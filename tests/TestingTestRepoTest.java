import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests the print string method.
 */
public class TestingTestRepoTest {
  /**
   * Tests the print string method.
   * @throws Exception Ignored.
   */
  @Test
  public void testDoSomething() throws Exception {
    assertEquals("tests for input string to create output string", "Hello", TestingTestRepo.doSomething("Hello"));
}
}