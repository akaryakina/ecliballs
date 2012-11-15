package pl.troken.ecliballs.model.ecliballs.core;

import pl.troken.ecliballs.model.ecliballs.Field;
import pl.troken.ecliballs.model.ecliballs.Score;

public interface ScoreListener {
	public void handleEvent(Score score);
}
