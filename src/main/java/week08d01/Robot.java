package week08d01;

import javax.swing.*;
import java.util.Locale;

public class Robot {

    private int yCord;
    private int xCord;

    public Cord move(String paraMove) {

        paraMove = paraMove.toUpperCase();
        for (int i = 0; i < paraMove.length(); i++) {
            char parT = paraMove.charAt(i);
            switch (parT) {
                case 'F':
                    yCord++;
                    break;
                case 'L':
                    yCord--;
                    break;
                case 'B':
                    xCord--;
                    break;
                case 'J':
                    xCord++;
                    break;
                default:
                    throw new IllegalArgumentException("Wrong char");
            }
        }
        return new Cord(xCord, yCord);
    }
}