//AUTORES: Mauricio Bravo Y ESteban Gaona
//DESCRIPCION: este es el proyecto final sobre un software de facturacion
//DATE: 29-11-20

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class formulario_AcercaDe extends JFrame {

    public formulario_inicio() {
        JLabel l_Titulo = new JLabel("Acerca De");
        l_Titulo.setBounds(200, 10, 500, 20);
        
        JLabel l_Desarrollador1 = new JLabel("Desarrollador1: xxxxxxxxx");
        l_version.setBounds(15, 20, 360, 30);

        JLabel l_Facultad = new JLabel("Facultad: xxxxxxxxxxxxxxx");
        l_version.setBounds(15, 50, 360, 30);
        
        JLabel l_Correo = new JLabel("Correo: wwwww@eeeeeee");
        l_version.setBound(15, 80, 360, 30);

        JLabel l_Github = new JLabel("Github: xxxxxxxxxxx");
        l_version.setBounds(15, 110, 360, 30);

        
        
        JLabel l_titulo = new JLabel("Acerca De");
        l_Titulo.setBounds(200, 10, 500, 20);
        
        JLabel l_Desarrollador2 = new JLabel("Desarrollador1: xxxxxxxxx");
        l_version.setBounds(260, 20, 360, 30);

        JLabel l_facultad = new JLabel("Facultad: xxxxxxxxxxxxxxx");
        l_version.setBounds(15, 50, 360, 30);
        
        JLabel l_correo = new JLabel("Correo: wwwww@eeeeeee");
        l_version.setBounds(260, 50, 360, 30);

        JLabel l_github = new JLabel("Github: xxxxxxxxxxx");
        l_version.setBounds(260, 110, 360, 30);
        add(l_Titulo);
        add(l_Desarrollador1);
        add(l_Facultad);
        add(l_Correo);
        add(l_Github);
        add(l_Desarrollador2);
        add(l_facultad);
        add(l_correo);
        add(l_github);
          
        setTitle("Acerca De");
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


}
}