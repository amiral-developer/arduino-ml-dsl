package fr.unice.polytech.idm.arduinoml.kernel.behavioral;

import fr.unice.polytech.idm.arduinoml.kernel.generator.Visitable;
import fr.unice.polytech.idm.arduinoml.kernel.generator.Visitor;
import fr.unice.polytech.idm.arduinoml.kernel.structural.Actuator;
import fr.unice.polytech.idm.arduinoml.kernel.structural.SIGNAL;

public class Action implements Visitable {

	private SIGNAL value;
	private Actuator actuator;


	public SIGNAL getValue() {
		return value;
	}

	public void setValue(SIGNAL value) {
		this.value = value;
	}

	public Actuator getActuator() {
		return actuator;
	}

	public void setActuator(Actuator actuator) {
		this.actuator = actuator;
	}

	@Override
	public void accept(Visitor<?> visitor) {
		visitor.visit(this);
	}
}
