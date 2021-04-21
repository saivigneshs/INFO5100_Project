/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.APIforSMS;
import com.twilio.Twilio;
import com.twilio.http.TwilioRestClient;
import com.twilio.exception.TwilioException;
import com.twilio.twiml.messaging.Message;
import com.twilio.type.PhoneNumber;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Saivignesh Sridhar
 */
public class APIforSMS {
    // Find your Account Sid and Token at twilio.com/console
    // and set the environment variables. See http://twil.io/secure
    public static final String ACCOUNT_SID = "ACb58703f172a26aff558eed1e726994fe";
    public static final String AUTH_TOKEN = "96b00320fc18a6aef176ae10c71ee582";
    public final String fromNum = "+12542782596";
    public String toNum;
    public String body;
   public APIforSMS(String toNum, String body) {
        this.toNum = toNum;
        this.body = body;
        try {
            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
            List<NameValuePair> params = new ArrayList<>();
            params.add(new BasicNameValuePair("Body", body));
            params.add(new BasicNameValuePair("To", toNum));
            params.add(new BasicNameValuePair("From", fromNum));

            MessageFactory messageFactory = client.getAccount().getMessageFactory();
            Message message = messageFactory.create(params);
            System.out.println(message);
        } catch (TwilioException e) {
            System.out.println(e);
        }
   }
 }
