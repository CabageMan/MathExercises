package com.ironhead.problems;

public class Problem1 implements IEulerProblem {
  private static final String DESCRIPTION = "If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6, and 9.\n" +
          "The sum of these multiples is 23.\n" +
          "Find the sum of all the multiples of 3 or 5 below 1000.";

  public String getDescription() {
    return DESCRIPTION;
  }

  public Number getResult() {
    int sum = 0;
    for (int i = 0; i < 1000; i++) {
      if (i % 3 == 0) {
        sum += i;
        continue;
      }
      if (i % 5 == 0) {
        sum += i;
      }
    }

    return sum;
  }

  public int getInitialConditionsResult() {
    int sum = 0;

    for (int i = 0; i < 10; i++) {
      boolean condition1 = i % 3 == 0;
      boolean condition2 = i % 5 == 0;
      if (condition1) {
        sum += i;
        continue;
      }
      if (condition2) {
        sum += i;
      }
    }

    return sum;
  }
}
