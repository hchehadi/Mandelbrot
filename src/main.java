import codedraw.CodeDraw;
import codedraw.Palette;

import java.awt.*;


public class main {

    public static double minusX = -2;
    public static double plusX = 2;
    public static double minusY = -1;
    public static double plusY = 1;
    public static int aufloesung = 1500;
    public static int zoomfactor = 100;
    public static CodeDraw mydrawObj = new CodeDraw(1600, 800);

    public static void main(String[] args) {


        mydrawObj.setColor(Palette.BLACK);
        mydrawObj.setLineWidth(1);


        mydrawObj.onMouseClick((codeDraw, mouseEvent) -> {
            zoom(xFromI(mouseEvent.getX()), yFromJ(mouseEvent.getY()));
            System.out.println("X: " + mouseEvent.getX());
            System.out.println("Y: " + mouseEvent.getY());
            draw();
        });


        draw();

    }

    public static void draw() {
        mydrawObj.clear();

        double x;
        double y;

        IMN z = new IMN(0, 0);
        IMN c = new IMN(0, 0);

        for (int i = 0; i < mydrawObj.getWidth(); i++) {
            for (int j = 0; j < mydrawObj.getHeight(); j++) {
                x = xFromI(i);
                y = yFromJ(j);

                z.a = 0;
                z.b = 0;
                c.a = x;
                c.b = y;

                for (int k = 0; k <= aufloesung; k++) {
                    z = iteration(z, c);
                    if (z.a * z.a + z.b * z.b > 4) {
                        mydrawObj.setColor(Color.getHSBColor((float) (10.0 * k / aufloesung)%1, 1, 1));

                        break;
                    }
                    if (k == aufloesung) {
                        mydrawObj.setColor(Color.BLACK);
                    }
                }
                mydrawObj.drawPixel(i, j);
            }
        }
        mydrawObj.show();
    }

    private static double xFromI(int i) {
        return i / (mydrawObj.getWidth() / (plusX - minusX)) + minusX;
    }

    private static double yFromJ(int j) {
        return j / (mydrawObj.getHeight() / (plusY - minusY)) + minusY;
    }

    private static void zoom(double mX, double mY) {
        double sX = (plusX - minusX) / zoomfactor;
        double sY = (plusY - minusY) / zoomfactor;

        minusX = mX - sX / 2;
        minusY = mY - sY / 2;

        plusX = mX + sX / 2;
        plusY = mY + sY / 2;

    }

    //z*z+c
    private static IMN iteration(IMN z, IMN c) {
        IMN result = new IMN(0, 0);
        result.a = z.a * z.a - z.b * z.b;
        result.b = 2 * z.a * z.b;
        result.a += c.a;
        result.b += c.b;

        return result;
    }


}


