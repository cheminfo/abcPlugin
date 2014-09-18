package org.cheminfo.scripting.abc.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.cheminfo.scripting.abc.Abc;


public class TestFunction {

	/**
	 * This gives the possibiliby to test directly the new functions from java
	 */
	
	public static void main(String[] args) {
		System.out.println(new Abc().helloWorld("Castillo"));
	}
}
