/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ucebna
 */
import javax.swing.*;
import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;

public class Tetris extends JFrame{
    public Tetris(){
        add(new Panel());
        setTitle("TETRIS");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        setSize(new Dimension(321, 813));
    }
    /**
     * @param args the command line arguments
     */
   
}
