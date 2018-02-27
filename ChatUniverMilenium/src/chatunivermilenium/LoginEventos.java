/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatunivermilenium;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginEventos implements ActionListener{
    LoginGUI lg;
    CreateAccountGUI cag;
    ChatBD chatBD;

    public LoginEventos(LoginGUI l){
        lg=l;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if (actionEvent.getSource()==lg.crearCuenta){
            cag =new CreateAccountGUI("Crea tu nueva cuenta de Chat Univer",450,100,500,620);
            cag.setVisible(true);
            lg.dispose();
        }

        if (actionEvent.getSource()== lg.login){
            chatBD = new ChatBD();
            char[] arrayPass=lg.pass.getPassword();
            String pass=new String(arrayPass);

            if (chatBD.userLogin(lg.user.getText(),pass)){
                System.out.println("Existe");
            }else {
                System.out.println("no");
            }


        }



    }
}
