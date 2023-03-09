/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.APIforSMS;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.Twilio;
import com.twilio.type.PhoneNumber;
/**
 *
 * @author Saivignesh Sridhar
 */
public class APIforSMS {
    
    public static final String ACCOUNT_SID = "";
    public static final String AUTH_TOKEN = "";
    public static final String fromNo = ""
    public String toNo;
    public String content;
     public APIforSMS(String toNo, String content) {
         this.toNo = toNo;
         this.content = content;
         Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
    Message message = Message.creator(
//                new PhoneNumber(toNo),
                new PhoneNumber(""),
                new PhoneNumber(fromNo),
                content)
            .create();

        System.out.println(message.getSid()+" <<"+content+">>  to "+toNo);
   }
}
