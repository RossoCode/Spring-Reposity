package Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class RandomController {
    @GetMapping("/random")
    public ResponseEntity<?> random() {
        boolean randomBoolean = new Random().nextBoolean();
        if(randomBoolean) {
            return ResponseEntity.ok("tutto bene");
        }
        else {
            return ResponseEntity.badRequest().build();
        }
    }
}
