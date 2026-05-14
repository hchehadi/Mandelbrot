import codedraw.CodeDraw;
import codedraw.Palette;

import java.math.BigDecimal;
import java.math.MathContext;

public class main2 {
    /*
    public static BigDecimal minusX = BigDecimal.valueOf(-1);
    public static BigDecimal plusX = BigDecimal.valueOf(1);
    public static BigDecimal minusY = BigDecimal.valueOf(-1);
    public static BigDecimal plusY = BigDecimal.valueOf(1);
    public static int aufloesung = 100;
    public static int zoomfactor = 5;
    public static CodeDraw mydrawObj = new CodeDraw(150, 150);

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

        BigDecimal x = BigDecimal.valueOf(0);
        BigDecimal y = BigDecimal.valueOf(0);

        IMN z = new IMN(BigDecimal.valueOf(0), BigDecimal.valueOf(0));
        IMN c = new IMN(BigDecimal.valueOf(0), BigDecimal.valueOf(0));

        for (int i = 0; i < mydrawObj.getWidth(); i++) {
            for (int j = 0; j < mydrawObj.getHeight(); j++) {
                x = xFromI(i);
                y = yFromJ(j);

                z.a = BigDecimal.valueOf(0);
                z.b = BigDecimal.valueOf(0);
                c.a = x;
                c.b = y;


                for (int k = 0; k <= aufloesung; k++) {
                    z = iteration(z, c);
                    if (z.a.multiply(z.a).add(z.b.multiply(z.b)).compareTo(BigDecimal.valueOf(4)) == 1) {
                        break;
                    }
                    if (k == aufloesung) {
                        mydrawObj.drawPixel(i, j);
                        mydrawObj.show();
                    }
                }
            }
        }
        mydrawObj.show();
    }

    private static BigDecimal xFromI(int i) {
        return BigDecimal.valueOf(i).divide((BigDecimal.valueOf(mydrawObj.getWidth()).divide(plusX.subtract(minusX), MathContext.DECIMAL128)).add(minusX), MathContext.DECIMAL128);
    }

    private static BigDecimal yFromJ(int j) {
        BigDecimal result = null;
        try {
            result = BigDecimal.valueOf(j).divide((BigDecimal.valueOf(mydrawObj.getHeight()).divide(plusY.subtract(minusY),MathContext.DECIMAL128)).add(minusY),MathContext.DECIMAL128);
        } catch (Exception e) {
            System.out.println(j);
            e.printStackTrace();
        }
        return result;
    }

    private static void zoom(BigDecimal mX, BigDecimal mY) {
        //BigDecimal sX = (plusX - minusX) / zoomfactor;
        //BigDecimal sY = (plusY - minusY) / zoomfactor;
        BigDecimal sX = plusX.subtract(minusX).divide(BigDecimal.valueOf(zoomfactor),MathContext.DECIMAL128);
        BigDecimal sY = plusY.subtract(minusY).divide(BigDecimal.valueOf(zoomfactor),MathContext.DECIMAL128);


        minusX = mX.subtract(sX.divide(BigDecimal.valueOf(2),MathContext.DECIMAL128));
        minusY = mY.subtract(sY.divide(BigDecimal.valueOf(2),MathContext.DECIMAL128));

        plusX = mX.add(sX.divide(BigDecimal.valueOf(2),MathContext.DECIMAL128));
        plusY = mY.add(sY.divide(BigDecimal.valueOf(2),MathContext.DECIMAL128));

    }

    //z*z+c
    private static IMN iteration(IMN z, IMN c) {
        IMN result = new IMN(BigDecimal.valueOf(0), BigDecimal.valueOf(0));
        result.a = z.a.multiply(z.a).subtract(z.b.multiply(z.b)).add(c.a);
        result.b = BigDecimal.valueOf(2).multiply(z.a).multiply(z.b).add(c.b);
        return result;
    }

     */
}


