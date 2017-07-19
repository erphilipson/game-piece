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
            System.out.println(gamePiece.isFrozen());
            gamePiece.move(70, 50, false);
        }


    }

}
