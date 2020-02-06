package com.herencia.privados.cert;

class GameShape {
	public void displayShape(){
		System.out.println("displaying shape");
	}
}

class PlayerPiece extends GameShape {
	public void moviePiece(){
		System.out.println("getting adjacent tiles");
	}
}
class TilePiece extends PlayerPiece {
	public void getAdjacent(){
		System.out.println("moving game piece");
	}
}

public class TestShapes {
	public static void main(String[] args) {
		PlayerPiece playerPiece = new GameShape();
		TilePiece tilePiece = new PlayerPiece();
		doShapes(playerPiece);
		doShapes(tilePiece);
	}
	
	public static void doShapes(GameShape gameShape) {
		gameShape.displayShape();
	}
}
