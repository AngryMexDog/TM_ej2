import java.util.Scanner;

public class Calificaciones {

    String nombre = "";
    int[] calif = new int[5];

    public float promedioCalif(){
        float promedio = 0;
        int suma = 0;

        for (int i = 0; i<calif.length; i++){
            suma = suma + calif[i];
        }

        promedio = (suma/calif.length);

        System.out.println("El promedio final es de " + promedio);
        return promedio;
    }

    //aqui sacamos la calificacion en nota
    public char imprime(float promedio){
        char nota = ' ';

        //se recibe el promedio
        //se hace un caso if-else

        if (promedio > 100 && promedio < 91){
            nota = 'A';
        }else if (promedio > 90 && promedio < 81){
            nota = 'B';
        }else if (promedio > 80 && promedio < 71){
            nota = 'C';
        }else if (promedio > 70 && promedio < 61){
            nota = 'D';
        } else if (promedio > 60 && promedio < 51){
            nota = 'E';
        }else {
            nota = 'F';
        }

        return nota;
    }


    public void setNombre (String pNombre){
        nombre = pNombre;
    }


    public void setCalificaciones(){

        Scanner s = new Scanner(System.in);

        System.out.println("Calificacion 1: ");
        calif[0] = s.nextInt();

        System.out.println("Calificacion 2: ");
        calif[1] = s.nextInt();

        System.out.println("Calificacion 3: ");
        calif[2] = s.nextInt();

        System.out.println("Calificacion 4: ");
        calif[3] = s.nextInt();

        System.out.println("Calificacion 5: ");
        calif[4] = s.nextInt();
    }
}
