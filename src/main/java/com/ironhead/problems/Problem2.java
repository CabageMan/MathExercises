package com.ironhead.problems;

import java.util.ArrayList;

public class Problem2 implements IEulerProblem {

  private static final String DESCRIPTION = "Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:\n" +
          "1, 2, 3, 5, 8, 13, 21, 34, 55, 89,...\n" +
          "By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.";

  public String getDescription() {
    return DESCRIPTION;
  }

  public Number getResult() {
    int sum = 0;
    int first = 0;
    int second = 1;

    while (second < 4_000_000) {
      int newOne = first + second;
      first = second;
      second = newOne;

      if (newOne % 2 == 0) {
        sum += newOne;
      }
    }

    return sum;
  }

  // Returns sum of first 10 terms.
  public int getInitialConditionsResult() {
    int sum = 0;
    int first = 0;
    int second = 1;

    while (second < 89) {
      int newOne = first + second;
      first = second;
      second = newOne;

      if (newOne % 2 == 0) {
        sum += newOne;
      }
    }

    return sum;
  }

  public ArrayList<Integer> getFirstTenTerms() {
    ArrayList<Integer> allTerms = new ArrayList<>();

    int first = 1;
    int second = 2;

    allTerms.add(first);
    allTerms.add(second);

    for (int i = 2; i < 10; i++) {
      int newOne = first + second;
      first = second;
      second = newOne;
      allTerms.add(newOne);
    }

    return allTerms;
  }
}