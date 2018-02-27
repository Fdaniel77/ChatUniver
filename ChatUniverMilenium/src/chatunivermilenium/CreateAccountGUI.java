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

public class CreateAccountGUI  extends JFrame{
    JPanel panel = new JPanel();
    JLabel instrucciones;
    JTextField email;
    JPasswordField pass;
    JPasswordField confirmPass;
    JTextField ip;
    JButton registro;
    JButton cancelar;

    public CreateAccountGUI(String titulo, int x, int y, int a, int b){
        super(titulo);
        this.setBounds(x,y,a,b);
        this.setLayout(null);
        this.setResizable(false);

        //adecuamos el panel
        panel.setLayout(null);
        panel.setBounds(0,0,500,620);
        panel.setBackground(Color.WHITE);

        //se agrega el logo al panel
        JLabel logoUniver = new JLabel("");
        ImageIcon iconoLogo = new ImageIcon("/home/daniel/NetBeansProjects/ChatUniverMilenium"
                + "/src/Images/logoUniver-Azul.png");
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
        ImageIcon iconoStudentScaled = new ImageIcon(imagenStudent.getScaledInstance(100,100,Image.SCALE_SMOOTH));
        imageStudent.setIcon(iconoStudentScaled);
        imageStudent.setBounds(200,100,100,100);
        panel.add(imageStudent);

        //instrucciones de registro
        instrucciones = new JLabel("Ingresa tus datos correctamente para registrarte");
        instrucciones.setBounds(70,200,400,40);
        instrucciones.setForeground(new Color(2,136,209));
        panel.add(instrucciones);

        //imagen de email
        JLabel imageEmail = new JLabel("");
        ImageIcon iconoEmail = new ImageIcon("/home/daniel/NetBeansProjects/ChatUniverMilenium" +
                "/src/Images/email.png");
        Image imagenEmail = iconoEmail.getImage();
        ImageIcon iconoEmailScaled = new ImageIcon(imagenEmail.getScaledInstance(40,40,Image.SCALE_SMOOTH));
        imageEmail.setIcon(iconoEmailScaled);
        imageEmail.setBounds(100,250,40,40);
        panel.add(imageEmail);
        //caja de texto usuario
        email = new JTextField();
        email.setBounds(150,255,250,30);
        panel.add(email);

        //imagen pass
        JLabel imagePass = new JLabel("");
        ImageIcon iconoPass = new ImageIcon("/home/daniel/NetBeansProjects/ChatUniverMilenium" +
                "/src/Images/pass1.png");
        Image imagenPass = iconoPass.getImage();
        ImageIcon iconoPassScaled = new ImageIcon(imagenPass.getScaledInstance(40,40,Image.SCALE_SMOOTH));
        imagePass.setIcon(iconoPassScaled);
        imagePass.setBounds(100,310,40,40);
        panel.add(imagePass);
        //caja de texto password
        pass = new JPasswordField();
        pass.setBounds(150,315,250,30);
        panel.add(pass);

        //imagen pass confirmacion
        JLabel imagePassConfirm = new JLabel("");
        ImageIcon iconoPassConfirm = new ImageIcon("/home/daniel/NetBeansProjects/ChatUniverMilenium" +
                "/src/Images/confirmpass.png");
        Image imagenPassConfirm = iconoPassConfirm.getImage();
        ImageIcon iconoPassConfirmScaled = new ImageIcon(imagenPassConfirm.getScaledInstance(40,40,Image.SCALE_SMOOTH));
        imagePassConfirm.setIcon(iconoPassConfirmScaled);
        imagePassConfirm.setBounds(100,375,40,40);
        panel.add(imagePassConfirm);
        //caja de texto password Confirm
        confirmPass = new JPasswordField();
        confirmPass.setBounds(150,375,250,30);
        panel.add(confirmPass);
        
        JLabel imageIp = new JLabel("");
        ImageIcon iconoIp = new ImageIcon("/home/daniel/NetBeansProjects/ChatUniverMilenium" + 
                "/src/Images/direccion_ip_logo.jpg");
        Image imagenIp = iconoIp.getImage();
        ImageIcon iconoIpScaled = new ImageIcon(imagenIp.getScaledInstance(40,40,Image.SCALE_SMOOTH));
        imageIp.setIcon(iconoIpScaled);
        imageIp.setBounds(100,435,250,30);
        panel.add(imageIp);
        ip = new JTextField();
        ip.setBounds(150,435,250,30);
        panel.add(ip);

        //se agregan los botones
        registro = new JButton("Continuar");
        registro.setBounds(150,490,250,40);
        registro.setBackground(new Color(2,136,209));
        registro.setForeground(Color.WHITE);
        panel.add(registro);
        cancelar = new JButton("Cancelar");
        cancelar.setBounds(150,550,250,40);
        cancelar.setForeground(Color.WHITE);
        cancelar.setBackground(new Color(255, 64, 129));
        panel.add(cancelar);

        CreateAccountEventos le = new CreateAccountEventos(this);
        cancelar.addActionListener(le);
        registro.addActionListener(le);
        this.getContentPane().add(panel);
        this.setVisible(true);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    }

}

