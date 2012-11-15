package pl.troken.ecliballs.ui.view.components;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;

import pl.troken.ecliballs.EcliBallsPlugin;
import pl.troken.ecliballs.ImagesConstants;
import pl.troken.ecliballs.model.ecliballs.Figure;
import pl.troken.ecliballs.model.ecliballs.core.BufferListener;

public class BufferComposite extends Composite implements BufferListener,SelectedListener{

	public static int bufferSize=3;
	private Label labels[];
	int latestAddedColor=-1;
	private Label selected;
	
	public BufferComposite(Composite parent, int style) {
		super(parent, style);
		labels = new Label[bufferSize];
	}
	
	public void createContents() {
		this.setLayout(new GridLayout(2,false));
		this.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,true));
		Image image = EcliBallsPlugin.getDefault().getImage(ImagesConstants.BACKGROUND);
		
		Group currentSelectedGroup=new Group(this,SWT.NONE);
		currentSelectedGroup.setLayout(new GridLayout());
		currentSelectedGroup.setText("Current:");
		currentSelectedGroup.setBackgroundImage(image);
		selected=new Label(currentSelectedGroup, SWT.NONE);
		selected.setLayoutData(new GridData(SWT.CENTER,SWT.CENTER,true,true));
		selected.setImage(new Image(getDisplay(), 18,18));
		
		Group bufferGroup=new Group(this,SWT.NONE);
		bufferGroup.setLayout(new GridLayout(3,true));
		bufferGroup.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,true));
		bufferGroup.setText("Next:");
		bufferGroup.setBackgroundImage(image);
		for(int i=0;i<bufferSize;i++){
			labels[i]=new Label(bufferGroup, SWT.NONE);
		}
	}

	@Override
	public void handleEvent(Figure figure) {
		if((latestAddedColor=latestAddedColor+1)>2){
			latestAddedColor=0;
		}
		Image image = EcliBallsPlugin.getDefault().getImage(figure.getType());
		labels[latestAddedColor].setImage(image);
	}
	
	@Override
	public void imageSelected(Image image) {
		selected.setImage(image);
	}
}
