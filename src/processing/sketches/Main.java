package processing.sketches;

import processing.core.PApplet;

public class Main extends PApplet {

    public void settings() {
        size(600, 600);
    }

    public void setup() {
        colorMode(HSB);
        noStroke();
    }

    public void draw() {
        background(0, 0, 0);
    }

    public static void main(String[] args) {
        PApplet.main("processing.sketches.Main");
    }
}
