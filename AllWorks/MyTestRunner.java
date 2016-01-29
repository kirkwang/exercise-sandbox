package gw.testharness.clustering.exercise.AllWorks;

import gw.testharness.clustering.exercise.junitPackage.AllTests;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by amp on 9/24/2015.
 */
public class MyTestRunner { public static void main(String[] args) {
  Result result = JUnitCore.runClasses(AllTests.class);
  for (Failure failure : result.getFailures()) {
    System.out.println(failure.toString());
  }
}
}
