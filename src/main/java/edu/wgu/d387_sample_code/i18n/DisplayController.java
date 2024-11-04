package edu.wgu.d387_sample_code.i18n;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.Locale;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")

public class DisplayController {

    @Autowired
    private DisplayMessage displayMessage;

    // English
    @GetMapping("/welcome-messageUS")
    public String getWelcomeMessageUS(Locale locale) {
        locale = Locale.US;
        String welcomeMessage = displayMessage.getWelcomeMessage(locale);
        return welcomeMessage;
    }

    // Canadian French
    @GetMapping("/welcome-messageFR")
    public String getWelcomeMessageFR(Locale locale) {
        locale = Locale.CANADA_FRENCH;
        String welcomeMessage = displayMessage.getWelcomeMessage(locale);
        return welcomeMessage;
    }
}
