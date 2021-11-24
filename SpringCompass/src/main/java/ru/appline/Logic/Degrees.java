package ru.appline.Logic;

public class Degrees {

    private int firstDegree;
    private int secondDegree;

    public Degrees(String degrees) {
        this.firstDegree = Integer.parseInt(degrees.substring(0, degrees.indexOf("-")));
        this.secondDegree = Integer.parseInt(degrees.substring(degrees.indexOf("-") + 1));
    }

    public Degrees(int firstDegree, int secondDegree) {
        this.firstDegree = firstDegree;
        this.secondDegree = secondDegree;
    }

    public boolean InRange(int degree) {

        if (degree >= firstDegree && degree <= secondDegree) {
            return true;
        }
        return false;
    }

    public int getFirstDegree() {
        return firstDegree;
    }

    public void setFirstDegree(int firstDegree) {
        this.firstDegree = firstDegree;
    }

    public int getSecondDegree() {
        return secondDegree;
    }

    public void setSecondDegree(int secondDegree) {
        this.secondDegree = secondDegree;
    }
}

