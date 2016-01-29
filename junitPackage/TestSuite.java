package gw.testharness.clustering.exercise.junitPackage;

/**
 * Created by amp on 9/23/2015.
 */
import gw.testharness.clustering.exercise.AllWorks.Test1;
import gw.testharness.clustering.exercise.AllWorks.Test2;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Test1.class, Test2.class})
public class TestSuite {

  @BeforeClass
  public static void setUp() {
    System.out.println("setting up");
  }

  public void testsimpletest(){
    System.out.println("hello");
   }
  @AfterClass
  public static void tearDown() {
    System.out.println("tearing down");
  }

}