package org.codarama.diet.event.model;

import org.codarama.diet.component.ListenableComponent;

public class JarExtractionStartEvent extends OperationStartEvent {

	public JarExtractionStartEvent(String message, Class<? extends ListenableComponent> by) {
		super(message, by);
	}
}