//AUTHOR:Mauricio Bravo y Esteban Gaona
//DATE:2-12-2020
//DESCRIPTION:proyecto final

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Facturas extends JFrame implements ActionListener {
    JLabel label_NroF, label_cliente, label_Vt;
    JButton boton_Guardar, boton_imprimir, boton_detalles;
    JTextField Nmro_fac, Fecha;

    public Facturas() {
        setLayout(null);
        setVisible(true);
        setBounds(0, 0, 500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Facturas");

        label_NroF = new JLabel("Nro Factura:");
        label_NroF.setBounds(30, 20, 360, 30);
        add(label_NroF);
        Nmro_fac = new JTextField();
        Nmro_fac.setBounds(140, 22, 50, 25);
        add(n_fac);

        label_Date = new JLabel("Fecha:");
        label_Date.setBounds(30, 60, 360, 30);
        add(label_Date);
        Fecha = new JTextField();
        fecha.setBounds(140, 62, 230, 25);
        add(fecha);

        label_cliente = new JLabel("Cliente:");
        label_cliente.setBounds(30, 100, 360, 25);
        add(label_cliente);
        cliente = new JTextField();
        cliente.setBounds(140, 102, 230, 25);
        add(cliente);

        label_Vt = new JLabel("Valor Total:");
        label_Vt.setBounds(30, 140, 360, 25);
        add(label_Vt);
        v_total = new JTextField();
        v_total.setBounds(140, 102, 2300, 25);
        add(v_total);

        boton_Guardar = new JButton("Guardar");
        boton_Guardar.setBounds(315, 200, 130, 30);
        boton_Guardar.addActionListener(this);
        add(boton_Guardar);

        boton_imprimir = new JButton("Imprimir");
        boton_imprimir.setBounds(170, 200, 130, 30);
        boton_imprimir.addActionListener(this);
        add(boton_imprimir);

        boton_detalles = new JButton("Ver detalles");
        boton_detalles.setBounds(30, 200, 130, 30);
        boton_detalles.addActionListener(this);
        add(boton_detalles);
    }

    public void actionPerformed(ActionEvent a) {
        if (e.getSource() == boton_Guardar) {
            Menu menu1 = new Menu();
        }
        if (e.getSource() == boton_imprimir) {

        }
        if (e.getSource() == boton_imprimir) {

        }
    }

    public static void main(String[] args) throws Exception {
        Facturas factura1 = new Facturas();
    }

}