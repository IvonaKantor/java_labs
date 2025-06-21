package org.example.lab12;

import java.io.IOException;

public static void main(String[] args) {
    BitmapImage image = new BitmapImage(600, 800);

    int[] green = {0, 255, 0};
    int[] brown = {139, 69, 19};
    int[] red = {255, 0, 0};
    int[] blue = {0, 0, 255};
    int[] yellow = {255, 255, 0};
    int[] white = {255, 255, 255};
    int[] lightBlue = {135, 206, 235};
    int[] purple = {130, 0, 130};
    int[] orange = {255, 165, 0};

    image.fillRectangle(0, 0, 600, 600, lightBlue); // Sky
    image.fillRectangle(0, 600, 600, 200, white);   // Ground

    image.fillRectangle(250, 700, 100, 100, brown);

    image.fillTriangle(300, 400, 100, 700, 500, 700, green);
    image.fillTriangle(300, 300, 150, 580, 450, 580, green);
    image.fillTriangle(300, 200, 200, 450, 400, 450, green);
    image.fillTriangle(300, 190, 240, 350, 360, 350, green);

    image.fillCircle(280, 350, 20, red);
    image.fillCircle(350, 440, 18, blue);
    image.fillCircle(304, 580, 20, yellow);
    image.fillCircle(285, 270, 10, purple);
    image.fillCircle(350, 530, 15, orange);
    image.fillCircle(200, 680, 20, red);
    image.fillCircle(400, 650, 15, blue);
    image.fillCircle(210, 510, 15, purple);

    image.fillStar(300, 190, 50, yellow);

    try {
        image.saveToPPM("choinka.ppm");
        System.out.println("file saved");
    } catch (IOException e) {
        System.err.println("Error saving file: " + e.getMessage());
    }
}


