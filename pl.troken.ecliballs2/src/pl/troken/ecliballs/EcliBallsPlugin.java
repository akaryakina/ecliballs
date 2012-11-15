package pl.troken.ecliballs;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

import pl.troken.ecliballs.model.ecliballs.core.Model;

/**
 * The activator class controls the plug-in life cycle
 */
public class EcliBallsPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "pl.troken.ecliballs"; //$NON-NLS-1$

	// The shared instance
	private static EcliBallsPlugin plugin;

	private Bundle bundle;

	/**
	 * The constructor
	 */
	public EcliBallsPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static EcliBallsPlugin getDefault() {
		return plugin;
	}

	public Image getImage(String descriptor){
		return getImageRegistry().get(descriptor);
	}
	
	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
	
	protected void initializeImageRegistry(ImageRegistry registry) {
		bundle = plugin.getBundle();
		createDescriptor(ImagesConstants.BALL_BLUE,registry);
		createDescriptor(ImagesConstants.BALL_BROWN,registry);
		createDescriptor(ImagesConstants.BALL_ECLIPSE,registry);
		createDescriptor(ImagesConstants.BALL_GRAY,registry);
		createDescriptor(ImagesConstants.BALL_RED,registry);
		createDescriptor(ImagesConstants.BALL_VIOLET,registry);
		createDescriptor(ImagesConstants.BALL_WHITE,registry);
		createDescriptor(ImagesConstants.BALL_YELLOW,registry);
		createDescriptor(ImagesConstants.SQUARE_BLUE,registry);
		createDescriptor(ImagesConstants.SQUARE_ECLIPSE,registry);
		createDescriptor(ImagesConstants.SQUARE_GRAY,registry);
		createDescriptor(ImagesConstants.SQUARE_GREEN,registry);
		createDescriptor(ImagesConstants.SQUARE_PRUPLE,registry);
		createDescriptor(ImagesConstants.SQUARE_RED,registry);
		createDescriptor(ImagesConstants.SQUARE_VIOLET,registry);
		createDescriptor(ImagesConstants.SQUARE_YELLOW,registry);
		createDescriptor(ImagesConstants.BACKGROUND,registry);
		createDescriptor(ImagesConstants.BACKGROUND2,registry);
		
     }
	
	private void createDescriptor(String uri,ImageRegistry registry) {
		IPath path = new Path(uri);
        URL url = FileLocator.find(bundle, path,null);
        ImageDescriptor desc = ImageDescriptor.createFromURL(url);
        registry.put(uri, desc);
	}
	
}
