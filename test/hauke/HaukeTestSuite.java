package hauke;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	Piglet.class,
	SPiglet.class,
	Kanga.class,
	Mips.class,
	Minijava.class
})
public class HaukeTestSuite {
}
