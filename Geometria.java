import java.util.Arrays;

public class Geometria {

    public static void main(String[] args) {

        Triangulo T1 = new Triangulo(10, 5);
        Triangulo T2 = new Triangulo(2, 5);
        Cuadrado C1 = new Cuadrado(4);

        float t1 = T1.CalcularAreaTriangulo();
        float t2 = T2.CalcularAreaTriangulo();
        float c1 = C1.CalcularAreaCuadrado();

        System.out.println("El area del triangulo primero es: "+ t1);
        System.out.println("El area del triangulo segundo es: "+ t2);
        System.out.println("El area del cuadrado primero es: "+ c1);

       if(t1>t2&&t1>c1){

           System.out.println("El area del triangulo primero es el mayor");

           if(t2<c1){
               System.out.println("El area del triangulo segundo es el menor");
           }
           else{
               System.out.println("El area del cuadrado primero es el menor");
           }

       }

       else if(t2>t1&&t2>c1){

           System.out.println("El area del triangulo segundo es el mayor");

           if(t1<c1){
               System.out.println("El area del triangulo primero es el menor");
           }
           else{
               System.out.println("El area del cuadrado primero es el menor");
           }
       }

       else{

           System.out.println("El area del cuadrado primero es el mayor");

           if(t1<t2){
               System.out.println("El area del triangulo primero es el menor");
           }
           else{
               System.out.println("El area del triangulo segundo es el menor");
           }
       }
    }

}