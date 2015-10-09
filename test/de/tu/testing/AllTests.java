package de.tu.testing;

import hauke.HaukeTestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import carFrigge.CarFriggeTestSuite;

@RunWith(Suite.class)
@SuiteClasses({
	CarFriggeTestSuite.class,
	HaukeTestSuite.class
})
public class AllTests {
}
