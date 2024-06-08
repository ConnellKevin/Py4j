package org.connellkevin.pyrunner4j;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PyRunner4jTest {
	PyRunner4j subjectUnderTest;

	@BeforeEach
	void setUp() {
		subjectUnderTest = new PyRunner4j();
	}

	@Test
	void testSuccessfulPythonScriptHasExitCode0() {
		int exitCode = subjectUnderTest.execute("/path/to/script.py");
		assertEquals(0, exitCode);
	}
}
