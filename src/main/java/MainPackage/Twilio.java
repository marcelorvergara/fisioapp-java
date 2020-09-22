/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import com.twilio.rest.api.v2010.account.Message;

/**
 *
 * @author marcelo
 */
public class Twilio {

// Find your Account Sid and Token at twilio.com/console
    // DANGER! This is insecure. See http://twil.io/secure
    public static final String ACCOUNT_SID = "ACbce6c15e9b9f4efbf9ff01a59231b339";
    public static final String AUTH_TOKEN = "54db8518001ff01c304a3dc00fc6a087";

    public void SendMessage(String phone, String msg, String IdAgend, String answ) {
        String url = "https://us-central1-fisioapp-9cfc0.cloudfunctions.net/fisioApp?" + "id=" + IdAgend + answ;

        com.twilio.Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("whatsapp:+" + phone),
                new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
                msg + "\n " + url)
                .create();

        System.out.println("Mensagem ID --> " + message.getSid());
    }

}
