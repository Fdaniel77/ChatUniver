/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatunivermilenium;

/**
 *
 * @author daniel
 */
import javax.swing.*;
import java.awt.*;

public class LoginGUI extends JFrame {

    JPanel panel=new JPanel();
    JTextField user;
    JPasswordField pass;
    JButton login;
    JLabel noCuenta;
    JButton crearCuenta;

    public LoginGUI (String titulo, int x, int y, int a, int b){
        super(titulo);
        this.setBounds(x, y, a, b);
        this.setLayout(null);
        this.setResizable(false);

        panel.setLayout(null);
        panel.setBounds(0, 0, 500, 620);
        panel.setBackground(Color.WHITE);

        //se agrega el logo al panel
        JLabel logoUniver = new JLabel("");
        ImageIcon iconoLogo = new ImageIcon("/home/daniel/NetBeansProjects/ChatUniverMilenium" +
                "/src/Images/logoUniver-Azul.png");
        Image imagenLogo = iconoLogo.getImage();
        ImageIcon iconoLogoEscalado = new ImageIcon(imagenLogo.getScaledInstance
                (500,100,Image.SCALE_SMOOTH));
        logoUniver.setIcon(iconoLogoEscalado);
        logoUniver.setBounds(0,0,500,100);
        panel.add(logoUniver);

        //se agrega imagen de usuario

        JLabel imageStudent = new JLabel("");
        ImageIcon iconoStudent = new ImageIcon("/home/daniel/NetBeansProjects/ChatUniverMilenium" +
                "/src/Images/userLoginUniver.jpg");
        Image imagenStudent = iconoStudent.getImage();
        ImageIcon iconoStudentScaled = new ImageIcon(imagenStudent.getScaledInstance(200,200,Image.SCALE_SMOOTH));
        imageStudent.setIcon(iconoStudentScaled);
        imageStudent.setBounds(150,100,200,200);
        panel.add(imageStudent);

        //se agrega icono usuario
        JLabel imageUser = new JLabel("");
        ImageIcon iconoUser = new ImageIcon("/home/daniel/NetBeansProjects/ChatUniverMilenium" +
                "/src/Images/usuario.png");
        Image imagenUser = iconoUser.getImage();
        ImageIcon iconoUserEscalado = new ImageIcon(imagenUser.getScaledInstance(40,40,Image.SCALE_SMOOTH));
        imageUser.setIcon(iconoUserEscalado);
        imageUser.setBounds(100,320,40,40);
        panel.add(imageUser);

        //caja de texto para usuario
        user = new JTextField();
        user.setBounds(150,320,250,40);
        panel.add(user);

        //se agrega icono pass
        JLabel imagePass = new JLabel("");
        ImageIcon iconoPass = new ImageIcon("/home/daniel/NetBeansProjects/ChatUniverMilenium" +
                "/src/Images/key.png");
        Image imagenPass = iconoPass.getImage();
        ImageIcon iconoPassEscalado = new ImageIcon(imagenPass.getScaledInstance(40,40,Image.SCALE_SMOOTH));
        imagePass.setIcon(iconoPassEscalado);
        imagePass.setBounds(100,400,40,40);
        panel.add(imagePass);

        //caja de texto para pass
        pass = new JPasswordField();
        pass.setBounds(150,400,250,40);
        panel.add(pass);

        //boton login
        login = new JButton("Entrar");
        login.setBounds(100,480,300,50);
        login.setBackground(new Color(2,136,209));
        login.setForeground(Color.WHITE);
        panel.add(login);

        //Label's nueva cuenta
        noCuenta = new JLabel("¿No tienes cuenta?");
        noCuenta.setBounds(100,550,150,40);
        noCuenta.setForeground(new Color(2,136,209));
        panel.add(noCuenta);

        crearCuenta = new JButton("Crear nueva cuenta");
        crearCuenta.setBorderPainted(false);
        crearCuenta.setBackground(Color.WHITE);
        crearCuenta.setToolTipText("Registra tus datos");
        crearCuenta.setBounds(230,550,190,40);
        crearCuenta.setForeground(new Color( 255, 64, 129 ));
        panel.add(crearCuenta);

        LoginEventos le = new LoginEventos(this);
        login.addActionListener(le);
        crearCuenta.addActionListener(le);
        this.getContentPane().add(panel);
        this.setVisible(true);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    }
}

