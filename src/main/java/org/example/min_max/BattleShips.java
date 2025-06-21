package org.example.lab1;

import java.util.Random;

public class BattleShips {
    public static char[][] board = new char[10][10];
    private final Random random = new Random();
    private final static int[] ships = {4, 3, 3, 2, 2, 2, 1, 1, 1, 1};

    public void init() {
        int row;
        int column;
        int direction;

        for (int ship : ships) {
            do {
                row = random.nextInt(10);
                column = random.nextInt(10);
                direction = random.nextInt(2);
            } while (!check(row, column, direction, ship));

            drawShip(row, column, direction, ship);
        }
    }

    private void drawShip(int row, int column, int direction, int ship) {
        if (direction == 0) {
            for (int i = column; i < ship + column; i++) {
                board[row][i] = '*';
            }
        } else {
            for (int i = row; i < ship + row; i++) {
                board[i][column] = '*';
            }
        }
    }

    public boolean check(int row, int column, int direction, int ship) {
        if ((row + ship >= 10 && direction == 1) || (column + ship >= 10) && (direction == 0))
            return false;

        int row1, col1, row2, col2;

        if (direction == 0) {
            row1 = Math.max(0, row - 1);
            col1 = Math.max(0, column - 1);
            row2 = Math.min(9, row + 1);
            col2 = Math.min(9, column + ship);
        } else {
            row1 = Math.max(0, row - 1);
            col1 = Math.max(0, column - 1);
            row2 = Math.min(9, row + ship);
            col2 = Math.min(9, column + 1);
        }

        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                if (board[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }


    public void print() {
        for (char[] line : board) {
            System.out.print('|');
            for (char cell : line) {
                System.out.print(cell == 0 ? ' ' : cell);
            }
            System.out.println('|');
        }
    }
}
