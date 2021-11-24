package ru.appline.Logic;

import java.util.HashMap;
import java.util.Map;

public class Compass {
    private Map<String, Degrees> compass = new HashMap<>();

    public void addSide(String side, int firstDegree, int secondDegree) {
        Degrees degrees = new Degrees(firstDegree, secondDegree);
        compass.put(side, degrees);
    }

    public void addSide(String side, Degrees degrees) {
        compass.put(side, degrees);
    }

    public String getSide(int degree) {
        for (Map.Entry<String, Degrees> entry : compass.entrySet()) {
            if(entry.getValue().InRange(degree)) {
                return entry.getKey();
            }
        }
        return "Не удалось определить сторону света!";
    }

    public void deleteSide(String side) {
        compass.remove(side);
    }


    public Map<String, Degrees> getCompass() {
        return compass;
    }

    public void setCompass(Map<String, Degrees> compass) {
        this.compass = compass;
    }
}
