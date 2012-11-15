package pl.troken.ecliballs.ui.view.components;

import java.util.Vector;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Transform;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;

import pl.troken.ecliballs.EcliBallsPlugin;
import pl.troken.ecliballs.ImagesConstants;
import pl.troken.ecliballs.model.ecliballs.Board;
import pl.troken.ecliballs.model.ecliballs.Field;
import pl.troken.ecliballs.model.ecliballs.Figure;
import pl.troken.ecliballs.model.ecliballs.core.FieldListener;
import pl.troken.ecliballs.model.ecliballs.core.Model;
import pl.troken.ecliballs.ui.preferences.PreferenceConstants;

public class BoardComposite extends Composite implements FieldListener {
	
	private String labelPositionData="lP";
	
	private int boardSize;
	private Image background;
	private Board board;
	private Model model;
	private BufferComposite bufferComposite;
	
	protected Vector<Label> labels;

	private int fFieldWidth;

	private SelectedListener selectedListener;

	 public BoardComposite(Composite parent, Model model) {
		super(parent, SWT.None);
		IPreferenceStore preferenceStore = EcliBallsPlugin.getDefault().getPreferenceStore();
		boardSize=new Integer(preferenceStore.getString(PreferenceConstants.BOARD_SIZE));
		this.model = model;
		this.board=model.getBoard();
	 }
	 
	 public void init() {
			this.setLayout(new GridLayout(1,false));
			final Display display = getDisplay();
			createBackgroundImage(display);
			
		    Group boardGroup=new Group(this,SWT.NONE);
		    boardGroup.setText("Game board");
		    boardGroup.setLayout(new GridLayout(boardSize,true));
		    boardGroup.setBackgroundImage(EcliBallsPlugin.getDefault().getImage(ImagesConstants.BACKGROUND));
		    
		    labels = new Vector<Label>(boardSize*boardSize);
		    for(int i=0;i<boardSize*boardSize;i++){
		    	Label label=new Label(boardGroup,SWT.NONE);
		    	label.setImage(background);
		    	label.setData(labelPositionData,i);
		    	label.addMouseListener(new MouseAdapter() {
		    		@Override
		    		public void mouseDown(MouseEvent e) {
		    			final Label label=((Label)e.widget);
		    			Integer positionData = (Integer) label.getData(labelPositionData);
						Field field = board.getField(positionData);
		    			Field selectedField= board.getSelectedField();
		    			if(selectedField==null){
		    				model.getBoard();
			    			if(field.hasFigure()){ 
			    				notifySelected(label.getImage());
			    				board.setSelectedField(field);
			    				label.setImage(background);
			    			}
		    			} else{
		    				if(!field.hasFigure())
			    			{
		    					notifySelected(background);
			    				board.moveFigureToField(field);
			    				board.calculateMatches(field);
			    				try {
									model.setRandomFiguresUsingPreference();
								} catch (IllegalArgumentException e1) {
									 MessageDialog.openInformation(getShell(), "EcliBalls", "Game over");
									// TODO init new pallete.
										// init();
								}
								
			    			}
		    			}
		    		}
				});		
		    	labels.add(label);
		    }
	 }

	private void createBackgroundImage(Display display) {
		fFieldWidth = 18;
		background = new Image(display,fFieldWidth, fFieldWidth);
	}

	@Override
	public void handleEvent(Field field) {
		Label label = labels.get(field.getY()*boardSize+field.getX());
		Figure figure = field.getFigure();
		if(figure!=null) {
			Image image = EcliBallsPlugin.getDefault().getImage(figure.getType());
			label.setImage(image);
		}
		else{
			label.setImage(background);
		}
	}

	public void addSelectedElementListener(SelectedListener listener) {
		selectedListener = listener;
	}
	
	void notifySelected(Image image){
		selectedListener.imageSelected(image);
	}
	
	
}
