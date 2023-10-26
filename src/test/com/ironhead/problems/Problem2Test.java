package com.ironhead.problems;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem2Test {
  private Problem2 problem;

  @org.junit.jupiter.api.BeforeEach
  public void setup() {
    problem = new Problem2();
  }

  @org.junit.jupiter.api.Test
  void getResult() throws Exception {
    int sum = problem.getResult().intValue();
    assertEquals(4613732, sum);
  }

  @org.junit.jupiter.api.Test
  void getInitialConditionsResult() throws Exception {
    int sum = problem.getInitialConditionsResult();
    assertEquals(44, sum);
  }

  @org.junit.jupiter.api.Test
  void getFirstTenTerms() throws Exception {
    ArrayList<Integer> firstTenExpected = new ArrayList<>(List.of(1, 2, 3, 5, 8, 13, 21, 34, 55, 89));
    ArrayList<Integer> firstTen = problem.getFirstTenTerms();
    assertIterableEquals(firstTenExpected, firstTen);
  }
}