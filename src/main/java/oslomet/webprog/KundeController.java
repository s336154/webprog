package oslomet.webprog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KundeController {
    @GetMapping("/")
    public Kunde returKunde(Kunde innKunde){
        return innKunde;
    }
}


