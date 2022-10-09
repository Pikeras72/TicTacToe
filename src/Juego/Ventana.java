package Juego;


import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    public Ventana(){
        setSize(650,650);
        setTitle("Tic-Tac-Toe GAME");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(650,650));
        this.getContentPane().setBackground(Color.lightGray);
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        //panel.setBackground(Color.green);
        this.getContentPane().add(panel);
        JLabel etiqueta = new JLabel("TIC TAC TOE");
        etiqueta.setBounds(100,100,200,30);
        panel.add(etiqueta);
        //etiqueta.setText("prueba");
    }
}
