package edu.wgu.d387_sample_code.i18n;

import org.springframework.stereotype.Component;

import java.util.ResourceBundle;
import java.util.Locale;

@Component
public class DisplayMessage {
    public String getWelcomeMessage(Locale locale) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("translation", locale);
        return resourceBundle.getString("welcomeMessage");
    }
}
