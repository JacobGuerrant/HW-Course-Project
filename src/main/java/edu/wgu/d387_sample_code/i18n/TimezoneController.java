package edu.wgu.d387_sample_code.i18n;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class TimezoneController {

    @GetMapping("/Timezone")
    public static String getTime() {
        ZonedDateTime time = ZonedDateTime.now();

        ZonedDateTime ET = time.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime MT = time.withZoneSameInstant(ZoneId.of("America/Denver"));
        ZonedDateTime UTC = time.withZoneSameInstant(ZoneId.of("UTC"));

        DateTimeFormatter dtFormat = DateTimeFormatter.ofPattern("HH:mm");
        String displayTime = "Join us for an online live presentation held at the London Hotel on " + ET.format(dtFormat) + " ET / " + MT.format(dtFormat) + " MT / " + UTC.format(dtFormat) + " UTC";

        return displayTime;
    }
}
