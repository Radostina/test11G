package edu.smg;

import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
//        JOptionPane.showMessageDialog(null,
//                "There's no input here, just a message",
//                "Title",
//                -1);

        
//        String input1 = (String)JOptionPane.showInputDialog(null,
//                "Is this a question?",
//                "Dialog Title",
//                2,
//                null,
//                null,
//                "Type something here.");
        
//        
        String[] acceptableValues = {"Chocolate", "Cake", "Ice cream", "Carrot cake"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Choose your favourite dessert",
                "Nom nom",
                3,
                null,
                acceptableValues,
                acceptableValues[0]);
                
    }
}

