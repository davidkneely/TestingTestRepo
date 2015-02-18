import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests the input to print out an int.
 */
public class TestingTestRepoTest2 {
  /**
   * Tests the input int method.
   * @throws Exception Ignored.
   */

  @Test
  public void testDoSomethingWithInt() throws Exception {
    assertEquals("testing to see if input is same as output", 24, TestingTestRepo.doSomethingWithInt(24));
  }
}