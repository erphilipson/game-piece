package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	GamePiece gamePiece = new GamePiece();
	if (gamePiece.frozen == true) {
        gamePiece.unfreeze();
    } else if (gamePiece.frozen == false) {
	    gamePiece.freeze();
    }

    if (gamePiece.frozen == false) {
        gamePiece.move(10, 3, false);
	    if (gamePiece.positionX >= gamePiece.minX  && gamePiece.positionX <= 100 && gamePiece.positionY >= gamePiece.minY && gamePiece.positionY <= gamePiece.maxY) {
            System.out.println(gamePiece.frozen);
            System.out.println(gamePiece.getPositionX());
            System.out.println(gamePiece.getPositionY());
        } else {
	        System.out.println("Sorry, your position was out-of-bounds");
        }
    }






    }
}
