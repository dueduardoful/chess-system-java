package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		//criar fun��o para imprimir pe�as da partida
		UI.printBoard(chessMatch.getPieces());

	}

}
