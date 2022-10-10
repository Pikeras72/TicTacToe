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
        JLabel etiqueta = new JLabel("TIC TAC TOE", SwingConstants.CENTER);
        //etiqueta.setOpaque(true); //hacer que la etiqueta pueda tener color de fondo
        etiqueta.setBounds(165,15,300,80);
        etiqueta.setForeground(Color.black);
        etiqueta.setFont(new Font("cooper black",Font.BOLD,40));
        //etiqueta.setBackground(Color.black); //color de fondo de la etiqueta
        panel.add(etiqueta);
        //etiqueta.setText("prueba");
    }
}
