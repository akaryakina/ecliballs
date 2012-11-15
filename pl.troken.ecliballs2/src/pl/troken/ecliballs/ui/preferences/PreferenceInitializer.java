package pl.troken.ecliballs.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import pl.troken.ecliballs.EcliBallsPlugin;
import pl.troken.ecliballs.model.ecliballs.Board;
import pl.troken.ecliballs.model.ecliballs.FiguresType;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	public void initializeDefaultPreferences() {
		IPreferenceStore store = EcliBallsPlugin.getDefault().getPreferenceStore();
		store.setDefault(PreferenceConstants.FIGURES_TYPE, String.valueOf(FiguresType.BALL_VALUE));
		store.setDefault(PreferenceConstants.BOARD_SIZE, String.valueOf(Board.DEFAULT_BOARD_SIZE));
		store.setDefault(PreferenceConstants.NUMBER_OF_FIGURES,"5");
	}
}
