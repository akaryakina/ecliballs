package pl.troken.ecliballs.ui.view.components;


import java.util.Arrays;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.jface.preference.PreferenceManager;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.PreferencesUtil;
import org.eclipse.ui.internal.quickaccess.PreferenceProvider;

import pl.troken.ecliballs.EcliBallsPlugin;
import pl.troken.ecliballs.ImagesConstants;
import pl.troken.ecliballs.model.ecliballs.Board;
import pl.troken.ecliballs.model.ecliballs.Field;
import pl.troken.ecliballs.model.ecliballs.Score;
import pl.troken.ecliballs.model.ecliballs.core.Model;
import pl.troken.ecliballs.model.ecliballs.core.ScoreListener;
import pl.troken.ecliballs.ui.preferences.EcliBallsPreferencePage;
import pl.troken.ecliballs.ui.preferences.PreferenceConstants;
import pl.troken.ecliballs.ui.view.BallsView;

public class ControlComposite extends Composite implements ScoreListener {
	Model model;
	private Text fScoreText;
	private Text fCurrentTopScore;
	private String topScore;
	
	
	public ControlComposite(Composite parent,Model model) {
		super(parent,SWT.NONE);
		this.model=model;
		IPreferenceStore preferenceStore = EcliBallsPlugin.getDefault().getPreferenceStore();
		//TODO TOPSCORE
		topScore="0";
	}
	public void init() {
		this.setLayout(new GridLayout(1,false));
		this.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
		Image image = EcliBallsPlugin.getDefault().getImage(ImagesConstants.BACKGROUND);
		
	    Group controlGroup=new Group(this,SWT.NONE);
	    controlGroup.setText("Options");
	    controlGroup.setLayout(new GridLayout());
	    controlGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		controlGroup.setBackgroundImage(image);
		 
	    Button startNewGame=new Button(controlGroup,SWT.PUSH);
		startNewGame.setText("Start new game");
		startNewGame.setLayoutData(new GridData(SWT.CENTER,SWT.CENTER,true,true));
		startNewGame.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
					//TODO
				MessageDialog.openInformation(getShell(), "Ecliballs", "Not implemented. Restart view");
			}
		});
		
		Group scoreGroup=new Group(controlGroup,SWT.NONE);
		scoreGroup.setText("Current Score");
		scoreGroup.setBackgroundImage(image);
		scoreGroup.setLayout(new GridLayout());
		scoreGroup.setLayoutData(new GridData(SWT.CENTER,SWT.CENTER,true,true));
		
		fScoreText = new Text(scoreGroup, SWT.READ_ONLY | SWT.SINGLE);
		fScoreText.setText("0 points");
		fScoreText.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,true));
		fScoreText.setBackgroundImage(image);
		
		
		Group scoreToBeatGroup=new Group(controlGroup,SWT.NONE);
		scoreToBeatGroup.setText("Score to Beat");
		scoreToBeatGroup.setBackgroundImage(image);
		scoreToBeatGroup.setLayout(new GridLayout());
		scoreToBeatGroup.setLayoutData(new GridData(SWT.CENTER,SWT.CENTER,true,true));
		
		fCurrentTopScore = new Text(scoreToBeatGroup, SWT.READ_ONLY | SWT.SINGLE);
		fCurrentTopScore.setText(topScore);
		fCurrentTopScore.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,true));
		fCurrentTopScore.setBackgroundImage(image);
		
		Button preferencesButton=new Button(controlGroup,SWT.PUSH);
		preferencesButton.setText("Show &Preferences");
		preferencesButton.setLayoutData(new GridData(SWT.CENTER,SWT.CENTER,true,true));
		preferencesButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				PreferenceDialog preferenceDialog = PreferencesUtil.createPreferenceDialogOn(getShell(), EcliBallsPreferencePage.PAGE_ID, new String[]{}, null);
				preferenceDialog.open();
			}
		});
	}
	
	@Override
	public void handleEvent(Score score) {
		fScoreText.setText(String.valueOf(score.getPoints()));
	}
}
