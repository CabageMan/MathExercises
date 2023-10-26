package com.ironhead.problems;

import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {
  private Problem1 problem;
  @org.junit.jupiter.api.BeforeEach
  public void setup () {
    problem = new Problem1();
  }

  @org.junit.jupiter.api.Test
  void getResult() throws Exception {
    int result = problem.getResult().intValue();
    assertEquals(233168, result);
  }

  @org.junit.jupiter.api.Test
  void  getInitialConditionsResult() throws Exception {
    int result = problem.getInitialConditionsResult();
    assertEquals(23, result);
  }
}

git@github.com:CabageMan/MathExercises.git