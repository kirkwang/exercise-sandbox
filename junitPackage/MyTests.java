package gw.testharness.clustering.exercise.junitPackage;

/**
 * Created by amp on 9/23/2015.
 */

import gw.testharness.clustering.exercise.AllWorks.MyClass;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyTests extends TestCase {
  @BeforeClass
  public void beforeClass(){
    System.out.println("run once before class");
  }
  @Before
  public void setup(){
    System.out.println("run every test class");
  }
  @Test
  public void testMultiplicationOfZeroIntegersShouldReturnZero() {

    // MyClass is tested
    MyClass tester = new MyClass(1,1);

    // assert statements
    assertEquals("10 x 0 must be 0", 0, tester.multiply(10, 0));
    assertEquals("0 x 10 must be 0", 10, tester.multiply(1, 10));
    assertEquals("0 x 0 must be 0", 0, tester.multiply(0, 0));
  }

}

