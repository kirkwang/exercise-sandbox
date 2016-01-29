package gw.testharness.clustering.exercise.AllWorks;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by amp on 9/23/2015.
 */

public class Test1 {
  @BeforeClass
  public static void setUpOnce(){
    System.out.println("setup once");
  }
  @Test
  public void test1() {
    System.out.println("test1");
  }

}
  