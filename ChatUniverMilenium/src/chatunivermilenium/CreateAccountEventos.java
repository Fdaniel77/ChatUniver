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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateAccountEventos implements ActionListener {
    LoginGUI lg;
    CreateAccountGUI cag;

    public CreateAccountEventos(CreateAccountGUI cae) {
        cag = cae;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ChatBD cdb = null;
        String email= cag.email.getText();
        if (actionEvent.getSource() == cag.cancelar) {
            lg = new LoginGUI("Chat Univer", 450, 100, 500, 620);
            lg.setVisible(true);
            cag.dispose();
        }
        
        if (actionEvent.getSource() == cag.registro) {
            if (!cag.email.getText().isEmpty()) {
                cdb = new ChatBD();
                if (cdb.consultaEmail(email)) {
                    System.out.println("Cuenta existente");
                }
                else {
                    String psw = "";
                    String psw2 = "";
                    char [] pw = cag.pass.getPassword();
                    char [] pw2 = cag.confirmPass.getPassword();
                    
                    for(int i=0; i < pw.length; i++){
                       psw += pw[i];
                       psw2 += pw2[i];
                    }
                    
                    cag.pass.getPassword();
                    System.out.println("no");
                    if(cdb.confirmacionPass(psw, psw2)){
                        
                    }
                    else{
                        System.out.println("passsword no son iguales");
                    }
                }
            }
        }
    }
}

