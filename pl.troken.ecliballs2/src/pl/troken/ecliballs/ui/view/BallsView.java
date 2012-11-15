package pl.troken.ecliballs.ui.view;


import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Link;
import org.eclipse.ui.part.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;

import pl.troken.ecliballs.EcliBallsPlugin;
import pl.troken.ecliballs.ImagesConstants;
import pl.troken.ecliballs.model.ecliballs.Board;
import pl.troken.ecliballs.model.ecliballs.core.Model;
import pl.troken.ecliballs.ui.view.components.BoardComposite;
import pl.troken.ecliballs.ui.view.components.BufferComposite;
import pl.troken.ecliballs.ui.view.components.ControlComposite;


/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

public class BallsView extends ViewPart {

	
	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "pl.troken.ecliballs.view.BallsView";

	private BoardComposite fBoardComposite;
	private ControlComposite fControlComposite;
	private Action infoAction;
	private Model model;

	private BufferComposite fBufferComposite;

	 
	class ViewContentProvider implements IStructuredContentProvider {
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}
		public void dispose() {
		}
		public Object[] getElements(Object parent) {
			return new String[] { "One", "Two", "Three" };
		}
	}
	class ViewLabelProvider extends LabelProvider implements ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			return getText(obj);
		}
		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}
		public Image getImage(Object obj) {
			return PlatformUI.getWorkbench().
					getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
		}
	}
	class NameSorter extends ViewerSorter {
	}

	/**
	 * The constructor.
	 */
	public BallsView() {
	}

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		Image image = EcliBallsPlugin.getDefault().getImage(ImagesConstants.BACKGROUND2);
		model=new Model();
		model.init();
		Composite composite=new Composite(parent,SWT.NONE);
		composite.setLayout(new GridLayout(2,true));
		composite.setBackgroundImage(image);
	
		fBoardComposite=new BoardComposite(composite,model);
		Composite left=new Composite(composite,SWT.NONE);
		left.setLayout(new GridLayout(1,true));
		left.setBackgroundImage(image);
		fBufferComposite = new BufferComposite(left, SWT.NONE);
		fControlComposite=new ControlComposite(left, model);

		Board board = model.getBoard();
		board.addFieldChangeListener(fBoardComposite);
		board.addScoreChangeListener(fControlComposite);
		board.addBufferListener(fBufferComposite);
		model.initFigureBuffer();
		
		fBufferComposite.createContents();
		fBoardComposite.init();
		fControlComposite.init();
		model.setRandomFiguresUsingPreference();
		fBoardComposite.addSelectedElementListener(fBufferComposite);
		
		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(fBoardComposite, "pl.troken.ecliballs.viewer");
		makeActions();
		contributeToActionBars();
	}

	

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalToolBar(bars.getToolBarManager());
	}

	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(infoAction);
	}

	private void makeActions() {
		infoAction = new Action() {
			public void run() {
				showMessage();
			}
		};
		infoAction.setText("About EcliBalls");
		infoAction.setToolTipText("About");
		infoAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_LCL_LINKTO_HELP));
	}

	private void showMessage() {
		String message = "This is Alpha version. \n" +
		"If you have any sugesstions please send it to wtrocki@gmail.com.\n" +
		"For mode information please browse eclipse context help." +
		"\n(Use F1 shortcut on the view)";
		
		MessageDialog.openInformation(
			fBoardComposite.getShell(),
			"EcliBalls",
			message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		fBoardComposite.setFocus();
	}
	
	private void reset() {
		//createPartControl(getS)
	}
	
}