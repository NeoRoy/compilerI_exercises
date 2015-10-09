package carFrigge;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import carFrigge.kanga.KangaTest;
import carFrigge.minijava.NameTest;
import carFrigge.minijava.TypeTest;
import carFrigge.mips.MipsTest;
import carFrigge.piglet.PigletTest;
import carFrigge.spiglet.SPigletTest;

@RunWith(Suite.class)
@SuiteClasses({
	NameTest.class,
	TypeTest.class,
	PigletTest.class,
	SPigletTest.class,
	KangaTest.class,
	MipsTest.class
})
public class CarFriggeTestSuite {
}
