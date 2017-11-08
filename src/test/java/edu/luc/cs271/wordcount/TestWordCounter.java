package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestWordCounter {

  // TODO complete this test class

  // DONE declare a reference to the SUT (system under test), i.e., WordCounter
  WordCounter counter;

  @Before
  public void setUp() {
    // DONE create the SUT instance
    Map<String, Integer> testMap = new HashMap<String, Integer>();
    counter = new WordCounter(testMap);
  }

  @After
  public void tearDown() {
    // DONE set the SUT instance to null
    counter = null;
  }

  @Test
  public void testGetCountEmpty() {

    // TODO verify that the SUT initially returns an empty map
    assertEquals(counter.getCounts(), Collections.emptyMap());

  }

  @Test
  public void testGetCountNonEmpty() {

    // TODO run the SUT on a specific String iterator with some repeated words,
    // then use assertions to verify the correct counts
    // do this for at least two words in the iterator and two not in the iterator
    fail();

  }
}
