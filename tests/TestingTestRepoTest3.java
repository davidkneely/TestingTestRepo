import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests the third method added to the repo.
 */
public class TestingTestRepoTest3 {
  /**
   * Tests the third method that has been input.
   * @throws Exception Ignored.
   */
  @Test
  public void testDoSecondThingWithInt() throws Exception {
    assertEquals("Tests to see if the third test works", 15, TestingTestRepo.doSecondThingWithInt(15));
    assertEquals("Tests to see if the third test works", 24, TestingTestRepo.doSecondThingWithInt(24));
    assertEquals("Tests to see if the third test works", 25, TestingTestRepo.doSecondThingWithInt(25));
  }
}