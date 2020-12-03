//AUTORES: Mauricio Bravo Y ESteban Gaona
//DESCRIPCION: este es el proyecto final sobre un software de facturacion
//DATE: 29-11-20

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class formulario_principal extends JFrame {
    public formulario_principal() {
        setLayout(new BorderLayout());

        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel("Menu principal");
        label_menu.setBounds(190, 10, 100, 100);
        panel_superior.add(label_menu);

        panel_Izquierdo = new JPanel();
        panel_Izquierdo.setLayout(new GridLayout(3, 1));

        Jbutton boton_Clientes = new Jbutton("Clientes");
        boton_Clientes.setBounds(160, 100, 150, 30);
        boton_Clientes.addActionListener(new boton_Clientes_clic());

        Jbutton boton_Facturas = new Jbutton("Facturas");
        boton_Facturas.setBounds(160, 140, 150, 30);
        boton_Facturas.addActionListener(new boton_Facturas_clic());

        Jbutton boton_AcercaDe = new Jbutton("AcercaDe");
        boton_AcercaDe.setBounds(160, 180, 150, 30);
        boton_AcercaDe.addActionListener(new boton_AcercaDe_clic());

        label_Creado_por = new JLabel("Creado por: Esteban gaona y Mauricio Bravo");
        label_Creado_por.setBounds(130, 220, 300, 30);
        add(label_Creado_por);

        panel_Izquierdo.add(boton_Clientes);
        panel_Izquierdo.add(boton_Facturas);
        panel_Izquierdo.add(boton_AcercaDe);

        add(panel_superior.BorderLayout.NORTH);
        add(panel_Izquierdo.BorderLayout.WEST);

        setTitle("Menu Principal");
        Set.Visible(True);
        set.Resizable(false);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        class boton_click implements ActionListener {
            public void actionperformed(ActionEvent a) {

            }
        }
        class boton_click implements ActionListener {
            public void actionperformed(ActionEvent a) {

            }
        }
        class boton_click implements ActionListener {
            public void actionperformed(ActionEvent a) {
                formulario_AcercaDe form_AcercaDe = new formulario_AcercaDe();

            }

        }

    }
}