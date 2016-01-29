package gw.testharness.clustering.exercise.AllWorks;



import org.apache.commons.collections.iterators.ArrayIterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by amp on 9/21/2015.
 */
public class ArrayUtilities {

  public static void main(String... args){
    String[] cars= {"a","b","c","d"};
    List<String> carList = Arrays.asList(cars);

    for (String car : carList){
      System.out.println(car);
    }
  }
}
