package org.example.lab12;

import java.io.FileWriter;
import java.io.IOException;

class BitmapImage {
    private final int width;
    private final int height;
    private final int[][][] pixels;

    public BitmapImage(int width, int height) {
        this.width = width;
        this.height = height;
        this.pixels = new int[height][width][3];
    }

    public void fillRectangle(int x, int y, int w, int h, int[] color) {
        for (int i = y; i < y + h && i < height; i++) {
            for (int j = x; j < x + w && j < width; j++) {
                setPixel(j, i, color);
            }
        }
    }

    public void fillTriangle(int x1, int y1, int x2, int y2, int x3, int y3, int[] color) {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (isInTriangle(x, y, x1, y1, x2, y2, x3, y3)) {
                    setPixel(x, y, color);
                }
            }
        }
    }

    public void fillCircle(int cx, int cy, int r, int[] color) {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if ((x - cx) * (x - cx) + (y - cy) * (y - cy) <= r * r) {
                    setPixel(x, y, color);
                }
            }
        }
    }

    public void fillStar(int cx, int cy, int size, int[] color) {
        double angleStep = Math.PI / 5;
        int[] xPoints = new int[10];
        int[] yPoints = new int[10];

        for (int i = 0; i < 10; i++) {
            double angle = i * angleStep - Math.PI / 2;
            int radius = (i % 2 == 0) ? size : size / 2;
            xPoints[i] = cx + (int) (radius * Math.cos(angle));
            yPoints[i] = cy + (int) (radius * Math.sin(angle));
        }

        for (int i = 0; i < 10; i++) {
            fillTriangle(cx, cy, xPoints[i], yPoints[i], xPoints[(i + 1) % 10], yPoints[(i + 1) % 10], color);
        }
    }

    private boolean isInTriangle(int px, int py, int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        double a1 = 0.5 * Math.abs(px * (y2 - y3) + x2 * (y3 - py) + x3 * (py - y2));
        double a2 = 0.5 * Math.abs(x1 * (py - y3) + px * (y3 - y1) + x3 * (y1 - py));
        double a3 = 0.5 * Math.abs(x1 * (y2 - py) + x2 * (py - y1) + px * (y1 - y2));
        return Math.abs(area - (a1 + a2 + a3)) < 1e-2;
    }

    public void setPixel(int x, int y, int[] color) {
        if (x >= 0 && x < width && y >= 0 && y < height) {
            pixels[y][x] = color.clone();
        }
    }

    public void saveToPPM(String filename) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("P3\n" + width + " " + height + "\n255\n");
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    int[] color = pixels[y][x];
                    writer.write(color[0] + " " + color[1] + " " + color[2] + " ");
                }
                writer.write("\n");
            }
        }
    }
}