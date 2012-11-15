package pl.troken.ecliballs.model.ecliballs.core;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.jface.preference.IPreferenceStore;

import pl.troken.ecliballs.EcliBallsPlugin;
import pl.troken.ecliballs.ImagesConstants;
import pl.troken.ecliballs.model.ecliballs.Board;
import pl.troken.ecliballs.model.ecliballs.EcliballsFactory;
import pl.troken.ecliballs.model.ecliballs.Figure;
import pl.troken.ecliballs.model.ecliballs.FigureList;
import pl.troken.ecliballs.model.ecliballs.FiguresType;
import pl.troken.ecliballs.model.ecliballs.impl.EcliballsPackageImpl;
import pl.troken.ecliballs.ui.preferences.PreferenceConstants;

public class Model {
	public static final int SIZE_OF_NEW_FIGURES = 3;
	private int boardSize,figureTypes,numbersOfFigures;
	private Board board;
	
	public Model() {
		IPreferenceStore preferenceStore = EcliBallsPlugin.getDefault().getPreferenceStore();
		boardSize = new Integer(preferenceStore.getString(PreferenceConstants.BOARD_SIZE));
		figureTypes = new Integer(preferenceStore.getString(PreferenceConstants.FIGURES_TYPE));
		numbersOfFigures = new Integer(preferenceStore.getString(PreferenceConstants.NUMBER_OF_FIGURES));
	}
	
	public void init() {
		EcliballsPackageImpl.init();
		EcliballsFactory factory = EcliballsFactory.eINSTANCE;
		
		board=factory.createBoard();
		getBoard().init(boardSize);
		
		FigureList figureList = factory.createFigureList();
		board.setFigureList(figureList);
		
		FiguresType figureEnum = FiguresType.get(figureTypes);
		figureList.setFigureSort(figureEnum);
		
		if(FiguresType.BALL.equals(figureEnum)){
			figureList.addFigures(createFigures(factory,ImagesConstants.BALLS));
		}else{
			figureList.addFigures(createFigures(factory,ImagesConstants.SQUARES));
		}
		
	}
	
	public void initFigureBuffer() {
		board.getFigureList().initFigureBuffer();
	}
	
	public void setRandomFiguresUsingPreference() {
		for(int i=0;i<SIZE_OF_NEW_FIGURES;i++)
			board.setRandomFigureInField();
	}

	private EList<Figure> createFigures(EcliballsFactory factory, String[] names) {
		EList<Figure> figures=new BasicEList<Figure>();
		for(int i=0;i<numbersOfFigures;i++){
			Figure figure = factory.createFigure();
			figure.setType(names[i]);
			figures.add(figure);
		}
		return figures;
	}
	
	 public void saveModel(EObject project)
	 {
	  try{
	   URI fileURI = URI.createFileURI("pl.troken.ecliballs/test1.xml");
	   Resource poResource = new XMLResourceFactoryImpl().createResource(fileURI);
	   poResource.getContents().add(project);
	   poResource.save(null);
	  } catch(Exception ex)
	  {
	   ex.printStackTrace();
	  }
	 }

	public Board getBoard() {
		return board;
	}

}
