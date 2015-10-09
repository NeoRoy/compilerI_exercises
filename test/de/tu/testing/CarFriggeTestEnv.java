package de.tu.testing;

import minijava.Program;

public class CarFriggeTestEnv implements TestEnvironment{

	@Override
	public int getNumOfError(Program p) {
		p.check();
		return p.error().size();
	}

	@Override
	public piglet.Program getPiglet(Program p) {
		p.check();
		return p.toPiglet();
	}

	@Override
	public spiglet.Program getSPiglet(piglet.Program p) {
		return p.toSpiglet();
	}

}
