
public class Triangulo {

    private int base;

    private int altura;

    public Triangulo(int base, int altura){

        this.base = base;
        this.altura = altura;

    }

    public float CalcularAreaTriangulo() {
        float areatri = 0;
        areatri=base*altura;
        return areatri;
    }

}
