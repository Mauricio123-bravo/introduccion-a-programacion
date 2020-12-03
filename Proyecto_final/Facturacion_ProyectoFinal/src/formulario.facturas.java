//AUTORES: Mauricio Bravo Y ESteban Gaona
//DESCRIPCION: este es el proyecto final sobre un software de facturacion
//DATE: 29-11-20

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class formulario_facturas extends JFrame {

        Jbutton boton_Guardar = new Jbutton(
                        "Guardar");boton_Guardar.setBounds(315,200,130,30);boton_Guardar.addActionListener(new boton_Guardar_clic());

        panel_Izquierdo.add(boton_Guardar);

    add(panel_Izquierdo.BorderLayout.SOUTH);

        Jbutton boton_Ver_Detalle = new Jbutton("Ver Detalle");
        boton_Ver_Detalle.setBounds(30, 200, 130, 30);
        boton_Ver_Detalle.addActionListener(new boton_Ver_Detalle_clic());

        panel_Izquierdo.add(boton_Ver_Detalle);
        add(panel_Izquierda.BorderLayout.SOUTH);

        Jbutton boton_Imprimir = new Jbutton("Imprimir");
        boton_Imprimir.setBounds(170, 200, 130, 30);
        boton_Imprimir.addActionListener(new boton_Imprimir_clic());

        panel_Izquierdo.add(boton_Imprimir);
        add(panel_centro.BorderLayout.SOUTH);

        JLabel l_Title = new JLabel("Facturas");
        l_Title.setBounds(200, 10, 500, 20);

        JLabel l_N_Factura = new JLabel("N_Factura:");
        l_N_Factura.setBounds(30, 20, 360, 30);

        l_N_Factura = new  TextField ();  
        l_N_Factura.setBounds (50 , 50 , 150 , 20 );
        
        
        JLabel l_Clientes = new JLabel("Clientes:");
        l_Clientes.setBounds(30, 100, 360, 25);

        l_Clientes = new  TextField ();  
        l_Clientes.setBounds (140, 102, 230, 25);
           

        JLabel l_Fecha = new JLabel("Fecha:");
        l_Fecha.setBounds(30, 60, 360, 30);
        l_Fecha = new  TextField ();  
        l_Fecha.setBounds (140, 62, 230, 25);

        
        JLabel l_Valor_Total= new JLabel("Valor_Total:");
        l_Valor_Total.setBounds(30, 140, 360, 25);

        l_Valor_Total = new  TextField ();  
        l_Valor_Total.setBounds(140, 142, 140, 25);

        add(l_Title);
        add(l_N_Factura);
        add(l_Clientes);
        add(l_Fecha);
        add(l_Valor_Total);

        boton_Ver_Detalle = new JButton("Ver Detalle");
        boton_Ver_Detalle.setBounds(250, 130, 100, 40);
        boton_Ver_Detalle.addActionListener(new boton_Ver_Detalle_click());
        add(boton_Ver_Detalle);

        Jbutton boton_Imprimir = new Jbutton("Imprimir");
        boton_Imprimir.setBounds(2, 0, 100, 30);
        boton_Imprimir.addActionListener(new boton_Imprimir_clic());
        add(boton_Imprimir);

        Jbutton boton_Guardar = new Jbutton("Guardar");
        boton_Guardar.setBounds(2,0,100,30);
        boton_Guardar.addActionListener(new boton_Guardar_clic());
        add(boton_Guardar);



        setTitle("Facturas");
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


        
        
         



}