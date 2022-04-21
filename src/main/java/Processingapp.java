import processing.core.PApplet;

public class Processingapp extends PApplet {
    int x=0;
    int y=0;
    int z=0;
    int a=0;
    public static void main(String[] args) {
        PApplet.main("Processingapp",args);
    }
        @Override
        public void settings () {
            super.settings();
            size(1000, 1000);
        }

        @Override
        public void setup () {
        }

    @Override
    public void draw() {
        drawcirc1();
        drawcirc2();
        drawcirc3();
        drawcirc4();
    }

    private void drawcirc1() {
        ellipse(x, 100,25 , 25);
        x++;
    }
    private void drawcirc2() {
        ellipse(y,200 , 33,33 );
        y=x*2;
    }
    private void drawcirc3() {
        ellipse(z, 400, 50, 50);
        z=x*3;
    }
    private void drawcirc4() {
        ellipse(a, 800, 100, 100);
        a=x*4;
    }
}
