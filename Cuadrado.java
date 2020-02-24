import java.util.Scanner;

public class Cuadrado {

    private int base;

    public Cuadrado(int base) {

        this.base = base;

    }

    public float CalcularAreaCuadrado() {
        float areacua = 0;
        areacua=base*base;
        return areacua;
    }

}
