package ru.appline.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import ru.appline.Logic.Compass;
import ru.appline.Logic.Degrees;

import java.util.Map;

public class Controller {

    private Compass compass = new Compass();

@PostMapping(value = "/createCompass", consumes = "application/json")
public void addSide(@RequestBody Map<String, String> sides) {
        for (Map.Entry<String, String> entry : sides.entrySet()) {
            String side = entry.getKey();
            Degrees degrees = new Degrees(entry.getValue());
            compass.addSide(side, degrees);
        }
    }

@GetMapping(value = "/getAll", produces = "application/json")
public Map<String, Degrees> getAll() {
        return compass.getCompass();
    }

@GetMapping(value = "/getSide", consumes = "application/json", produces = "application/json")
public String getSide(@RequestParam int degree){
        return compass.getSide(degree);
    }

}

