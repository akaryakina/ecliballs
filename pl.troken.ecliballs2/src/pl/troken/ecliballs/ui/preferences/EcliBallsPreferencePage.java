package pl.troken.ecliballs.ui.preferences;

import org.eclipse.jface.preference.*;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;
import pl.troken.ecliballs.EcliBallsPlugin;
import pl.troken.ecliballs.ImagesConstants;

/**
 */
public class EcliBallsPreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	public static String PAGE_ID="pl.troken.ecliballs.ui.preferences.EcliBallsPreferencePage";
	
	public EcliBallsPreferencePage() {
		super(GRID);
		setPreferenceStore(EcliBallsPlugin.getDefault().getPreferenceStore());
		setDescription("Ecliballs game preferences");
	}
	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
		ComboFieldEditor boardSizeEditor = new ComboFieldEditor(PreferenceConstants.BOARD_SIZE, "Game board size: ", 
				new String[][]{{"8","8"},{"9","9"},{"10","10"},{"11","11"},{"12","12"}}, getFieldEditorParent());
		addField(boardSizeEditor);
		
		ComboFieldEditor figuresNumberEditor = new ComboFieldEditor(PreferenceConstants.NUMBER_OF_FIGURES, "Number of colors: ", 
				new String[][]{{"4","4"},{"5","5"},{"6","6"},{"7","7"},{"8","8"}}, getFieldEditorParent());
		addField(figuresNumberEditor);
				
		RadioGroupFieldEditor figureTypeEditor = new RadioGroupFieldEditor(
				PreferenceConstants.FIGURES_TYPE,
			"",
			1,
			new String[][] { { "&Balls", "0" }, {
				"&Squares", "1" }
		}, getFieldEditorParent());
		
		Group group=new Group(getFieldEditorParent(), SWT.NONE);
		group.setText("Figure Types");
		group.setLayout(new GridLayout());
		group.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false,2,1));
		Composite radioBoxControl = figureTypeEditor.getRadioBoxControl( getFieldEditorParent());
		radioBoxControl.setLayout(new GridLayout(2, false));
		radioBoxControl.setParent(group);
		addField(figureTypeEditor);
		Label label=new Label(radioBoxControl,SWT.NONE);
		label.setImage(EcliBallsPlugin.getDefault().getImage(ImagesConstants.BALL_BLUE));
		Label label1=new Label(radioBoxControl,SWT.NONE);
		label1.setImage(EcliBallsPlugin.getDefault().getImage(ImagesConstants.SQUARE_BLUE));
	addField(
		new BooleanFieldEditor("Hide", "&Hide game view in perspectives", getFieldEditorParent()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent event) {
		setMessage("Restart game view to perform changes");
		super.propertyChange(event);
	}

}