package com.ironhead;

import com.ironhead.constants.ConsoleTextColors;
import com.ironhead.problems.IEulerProblem;
import com.ironhead.problems.Problem1;
import com.ironhead.problems.Problem2;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<IEulerProblem> problems = new ArrayList<>();
    problems.add(new Problem1());
    problems.add(new Problem2());

    for (IEulerProblem problem : problems) {
      System.out.println(
              "\n\n" +
              ConsoleTextColors.ANSI_PURPLE + "Problem Description:\n" +
              ConsoleTextColors.ANSI_YELLOW + problem.getDescription() +
              ConsoleTextColors.ANSI_GREEN + "\nResult: " + problem.getResult()
      );
    }
  }
}