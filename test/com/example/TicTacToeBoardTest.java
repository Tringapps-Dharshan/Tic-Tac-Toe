package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TicTacToeBoardTest {
  @Test
  public static void simpleNoWinnerBoard() throws Exception {
    assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("O...X.X.."));
    assertEquals(Evaluation.Xwins, TicTacToeBoard.evaluateBoard("XXX...oo."));
    assertEquals(Evaluation.Xwins, TicTacToeBoard.evaluateBoard("...Xxx.oo"));
    assertEquals(Evaluation.Xwins, TicTacToeBoard.evaluateBoard("oo....xxx"));
    assertEquals(Evaluation.Xwins, TicTacToeBoard.evaluateBoard("x..x..xoo"));
    assertEquals(Evaluation.Xwins, TicTacToeBoard.evaluateBoard(".x..xoox."));
    assertEquals(Evaluation.Xwins, TicTacToeBoard.evaluateBoard("..xoox..x"));
    assertEquals(Evaluation.Xwins, TicTacToeBoard.evaluateBoard("x...x.oox"));
    assertEquals(Evaluation.Xwins, TicTacToeBoard.evaluateBoard("..x.x.xoo"));
    assertEquals(Evaluation.InvalidInput, TicTacToeBoard.evaluateBoard("O.."));
    assertEquals(Evaluation.InvalidInput, TicTacToeBoard.evaluateBoard("O...X.X...."));
    assertEquals(Evaluation.UnreachableState, TicTacToeBoard.evaluateBoard("Oooxxx..."));
    assertEquals(Evaluation.UnreachableState, TicTacToeBoard.evaluateBoard("oxooxooxo"));

  }
}
