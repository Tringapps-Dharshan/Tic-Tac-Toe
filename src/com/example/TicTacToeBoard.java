package com.example;

public class TicTacToeBoard {

  public static Evaluation evaluateBoard(String pattern) {
    // Convert the user input into the lowerCase form
    String patternFrom = pattern.toLowerCase();
    if (patternFrom.length() != 9) {
      return Evaluation.InvalidInput;
      // if length is mismatch return invaludInput
    } else {
      int xcount = 0;
      int ocount = 0;
      // get the count of x and o in a string
      for (int i = 0; i < patternFrom.length(); i++) {
        if (patternFrom.charAt(i) == 'x')
          xcount++;
        if (patternFrom.charAt(i) == 'o')
          ocount++;
      }
      // check the state of users
      if (Math.abs(xcount - ocount) >= 2)
        return Evaluation.UnreachableState;
      boolean xwins = win('x', patternFrom);
      boolean owins = win('o', patternFrom);
      if ((xwins) && (owins))
        return Evaluation.UnreachableState;
      else if (owins)
        return Evaluation.Owins;
      else if (xwins)
        return Evaluation.Xwins;
      else
        return Evaluation.NoWinner;
    }
  }

  // tictactoe checker
  public static boolean win(char check, String patterns) {
    for (int i = 0; i < 7; i += 3) {
      if (patterns.charAt(i) == check && patterns.charAt(i + 1) == check && patterns.charAt(i + 2) == check)
        return true;
    }
    for (int i = 0; i < 3; i++) {
      if (patterns.charAt(i) == check && patterns.charAt(i + 3) == check && patterns.charAt(i + 6) == check)
        return true;
    }
    if (patterns.charAt(0) == check && patterns.charAt(4) == check && patterns.charAt(8) == check)
      return true;
    return (patterns.charAt(2) == check && patterns.charAt(4) == check && patterns.charAt(6) == check);
  }
  
   public static void main(String[] args) {
   System.out.println(evaluateBoard("O...X.X.."));
   System.out.println(evaluateBoard("XXX...oo."));
   System.out.println(evaluateBoard("...Xxx.oo"));
   System.out.println(evaluateBoard("oo....xxx"));
   System.out.println(evaluateBoard("x..x..xoo"));
   System.out.println(evaluateBoard(".x..xoox."));
   System.out.println(evaluateBoard("..xoox..x"));
   System.out.println(evaluateBoard("x...x.oox"));
   System.out.println(evaluateBoard("..x.x.xoo"));
   System.out.println(evaluateBoard("O.."));
   System.out.println(evaluateBoard("O...X.X...."));
   System.out.println(evaluateBoard("Oooxxx..."));
   System.out.println(evaluateBoard("oxooxooxo"));
   }
  
}