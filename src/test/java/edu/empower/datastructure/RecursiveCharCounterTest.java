package edu.empower.datastructure;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecursiveCharCounterTest {
	RecursiveCharCounter cut = new RecursiveCharCounter();

	@Test
	public void verifySameRepetiveCharecters() {
		assertEquals("a4", cut.count(0, "aaaa", 1));
	}

	@Test
	public void verifyMixedRepetiveCharecters() {
		assertEquals("a4b3", cut.count(0, "aaaabbb", 1));
	}

	@Test
	public void verifyMixedRepetiveGappedCharecters() {
		assertEquals("a4b3a2b2", cut.count(0, "aaaabbbaabb", 1));
	}

	@Test
	public void verifyOneCharecters() {
		assertEquals("c1", cut.count(0, "c", 1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void verifyEmptyContentInput() {
		cut.count(0, "", 1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void verifyNullContentInput() {
		cut.count(0, null, 1);
	}

}
