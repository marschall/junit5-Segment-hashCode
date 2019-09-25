package com.github.marschall.junit5.segmenthashcode;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ReproducerTest {

  public ReproducerTest(String description, Integer parameter1, Integer parameter2, Integer parameter3, Integer parameter4, Integer parameter5) {

  }

  @Parameters(name = "{0}")
  public static List<Object[]> parameters() {
    List<Object[]> parameters = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        for (int k = 0; k < 10; k++) {
          for (int l= 0; l < 10; l++) {
            for (int m= 0; m < 2; m++) {
              parameters.add(new Object[] {"index: " + parameters.size(), i, j, k, l, m});
            }
          }
        }
      }

    }

    return parameters;
  }

  @Test
  public void test1() {

  }

  @Test
  public void test2() {

  }

  @Test
  public void test3() {

  }

}
