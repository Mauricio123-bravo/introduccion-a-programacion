//AUTORES: Mauricio Bravo Y ESteban Gaona
//DESCRIPCION: este es el proyecto final sobre un software de facturacion
//DATE: 29-11-20

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class formulario_Clientes extends JFrame {

    JLabel l_Title = new JLabel("Clientes");l_Title.setBounds(200,10,500,20);

    JLabel l_Identificacion = new JLabel("Identificacion:");l_Identificacion.setBounds(30,20,360,30);

    l_Identificacion=new TextField();l_Identificacion.setBounds(50,50,150,20);

    JLabel l_Nombre = new JLabel("Nombre Completo:");l_Nombre.setBounds(30,60,360,30);

    l_Nombre=new TextField();l_Nombre.setBounds(50,50,150,20);

    JLabel l_Email = new JLabel(
            "Email:");l_Email.setBounds(30,100,360,25);l_Email=new TextField();l_Email.setBounds(140,102,230,25);

    JLabel l_Telefono = new JLabel(
            "Telefono:");l_Telefono.setBounds(30,140,360,25);l_Telefono=new TextField();l_Telefono.setBounds(180,148,150,35);

    add(l_Title);
        add(l_Identificacion);
        add(l_Nombre);
        add(l_Email);
        add(l_Telefono);

        boton_Guardar = new JButton("Guardar");
        boton_Guardar.setBounds(150, 200, 150, 30);
        boton_Guardar.addActionListener(new boton_Guardar_click());
        add(boton_Guardar);
        panel_Izquierdo.add(boton_Guardar);
        add(panel_Derecho.BorderLayout.SOUTH);
        
          
        setTitle("Clientes");
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

}