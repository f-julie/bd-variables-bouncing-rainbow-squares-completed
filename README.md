#Introduction to Graphical Programming with Processing

Processing is a Java library that will allow us to create simple 
graphics to accompany our fundamentals of Java coding. 
This library provides us with tools to create primitive shapes such
as rectangles and ellipses (circles and ovals), and allows us to 
programmatically animate and control them during runtime.

## Getting Started with Processing
 In the starter code for this lesson, you will notice the Main class
 extends PApplet (processing applet). 
 
 ```java
import processing.core.PApplet;

public class Main extends PApplet {
    
    ...
}
```
 
 We will cover extending classes
 in a future lesson, for now all you need to know is that by
 extending from PApplet, we are able to use processing functions
 inside our Main class.
 
 All processing functions can be found on the 
 [reference section](https://www.processing.org/reference) of
 the processing website.
 
 ## Core methods `settings`, `setup`, and `draw`
 
 These are the three functions that control the flow of a processing
 application (called a sketch).
 
 * `settings()` is used to create a window where graphics can be 
 displayed, known as the "canvas".
 
 * `setup()` the code inside of the function runs once right after the 
 program runs
 
 * `draw()` this function is called 60 times per second. This is 
 the main application loop and the heart of the program.
 
 ## Starter Code
 
 In the `settings` function we are calling `size` to create a 600
 x 600 pixel canvas window.
 
 In the `setup` function we are picking some color preferences.
 
 - `noStroke()` shapes are drawn without outlines.
 - `colorMode(HSB)` colors are now to be passed to functions using 
 **Hue**, **Saturation**, and **Brightness** values, each between 0 and 255.
 
 In the `draw` function we are drawing a black background over 
 the canvas. (hue 0, saturation 0, brightness 0).
 
 ## Project Description: Bouncing Rainbow Squares
 
 Using variables and arithmetic operations, we'll be creating an
 animation of a bouncing rainbow square.
 
 This project will allow us to change the properties of the
 square such as speed, color, and size.
 
 ## Instructions Part 1: Creating our variables
 
 These values will describe the properties of the square.
 Each should be a numeric type such as `int`, `double`, or `float`.
 
 - x position
 - y position
 - sideLength
 
 We will also need values to control the velocity of the square.
 
 - x velocity
 - y velocity
 
 Finally, we'll use a variable to store the hue of the square.
 
 - hue
 
 ## Instructions Part 2: Creating our graphics
 
 Inside the `draw` function use the rectangle function to draw a
 square. The syntax for rectangles is as follows:
 
 ```java
rect(float x, float y, float width, float height);
```

An x and y position of (0,0) reference the **top-left** of the canvas.

And since our canvas is 600 x 600px, the bottom right coordinate 
is (600,600).

Draw a square of any size, anywhere within the canvas. **Use the 
variables defined the Part 1 as input to the `rect` function**.

Play around with the values a bit, press the play button next to the
`main()` method to run the program.

### Set the color

Call the `fill` method before making a call to `rect`. The syntax
for the fill method depends on the colorMode. Since we are using `HSB`
the syntax is as follows:

```java
fill(float hue, float saturation, float brightness);
```

*Once the `fill` command has been called, all shapes will be drawn in
that color until a new call to `fill` has been made.*

Set the saturation and brightness to 255 and use your `hue` 
variable for the hue parameter.

- Try a few `hue` values going up from 0 to 255
- What happens if the number is larger than 255?

Let's use modulus to make any number larger than 255, wrap back
around to 0.

```java
fill(hue % 255, 255, 255);
```

## Instructions Part 3: Movement

Let's start by making the square move to the right.

Larger x-values correspond to increasingly rightward coordinates.

 * Use the `+=` operator to increase the x coordinate of the square
by the horizontal velocity.

*Write this code inside the draw method so that it is called 
every frame (60 times per second).*

 * Change the initial value of x velocity so that the square
 moves to the left. (You should not change the `+=` operator).
 
 * Now make the square also move vertically according to the 
 `y velocity` variable you created.
 
 #### Now for the cool part
 
 * Instead of drawing the background at the beginning of every frame.
 Move the `background` function call to the `setup()` method.
 
 ### Making the square bounce off the edges
 
 We will be covering boolean logic later in the course, however
 we do need to make use of `if-statements` now.
 
 The following code will make the square bounce off of the left 
 side of the canvas.
 
 ```java
if (x <= 0) {
    x = 0;
    xvelocity *= -1;
}
```

You may have different variable names, but this is the idea:

```
IF (the square passes the left edge)
    THEN move the square back to the edge;
         flip the horizontal velocity;
```

*`*=` works just like `+=` but performs multiplication instead 
of addition.*

Your challenge to complete this activity is to make the square
bounce off the remaining three sides of the canvas.

* The tricky part will be the right and bottom edges of
the canvas, since you'll need to account for the side length
of the square.

### Checking for completion

A finished project will have:
 
 1. The square bouncing properly off all four edges of the 
 canvas, without allowing the square to 
 visibly exit off the side (technically the square exits the
 canvas during collision, which is fine).

 2. Any size ***square*** bounces properly.

### Extension

Make this project more your own. Example ideas:

- Add a second mirrored square
- Change the hue range (between yellow and blue)
- Have the square increase and/or decrease in size over time