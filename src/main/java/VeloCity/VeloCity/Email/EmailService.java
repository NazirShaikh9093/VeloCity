package VeloCity.VeloCity.Email;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;

@Service
@AllArgsConstructor

public class EmailService implements EmailSender{

    private final static Logger LOGGER = LoggerFactory.getLogger(EmailService.class);

    private final JavaMailSender mailSender;

    @Override
    public void send(String to, String email){
        try{

        }catch (MessagingException e) {
            LOGGER.error("Unable to send email", e);
            throw new IllegalStateException("failed to send email");
        }

    }
}
