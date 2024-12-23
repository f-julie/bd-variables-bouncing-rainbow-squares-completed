package processing.sketches;

import processing.core.PApplet;

public class Main extends PApplet {

    private float xPosition = 300f;
    private float yPosition = 300f;
    private int sideLength = 30;
    private float xVelocity = 5f;
    private float yVelocity = -8f;
    private int hue = 0;

    public void settings() {
        size(600, 600);
    }

    public void setup() {
        background(0, 0, 0);
        colorMode(HSB);
        noStroke();
    }

    public void draw() {

        fill(hue, 255, 255);
        rect(xPosition, yPosition, sideLength, sideLength);
        xPosition += xVelocity;
        yPosition += yVelocity;

        if (xPosition <= 0) {
            xPosition = 0;
            xVelocity *= -1; // Or xVelocity = -xVelocity;
        }

        if (yPosition <= 0) {
            yPosition = 0;
            yVelocity = -yVelocity; // Or yVelocity *= -1;
        }

        if (xPosition + sideLength >= width) {
            xPosition = width - sideLength;
            xVelocity = -xVelocity; // Or xVelocity *= -1;
        }

        if (yPosition + sideLength >= height) {
            yPosition = height - sideLength;
            yVelocity = -yVelocity; // Or yVelocity *= -1;
        }



    }

    public static void main(String[] args) {
        PApplet.main("processing.sketches.Main");
    }
}
