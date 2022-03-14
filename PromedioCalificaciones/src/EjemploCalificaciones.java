import java.util.Scanner;

public class EjemploCalificaciones {

    String nombre = "";
    int[] calif = new int[5];

    public static void main(String[] args) {

        String capturaNombre = "";
        float promedioResult = 0;
        char califNota = ' ';

        Calificaciones pCalculoCalif = new Calificaciones();
        System.out.println("Calificaciones");

        Scanner s = new Scanner(System.in);
        System.out.println("Nombre del alumno: ");
        capturaNombre = s.next();
        pCalculoCalif.setNombre(capturaNombre);

        pCalculoCalif.setCalificaciones();
        promedioResult = pCalculoCalif.promedioCalif();

        /*llamamos al metodo dentro de la clase calificaciones
        pCalculoCalif.imprime(promedioResult);
        califNota = pCalculoCalif.imprime(); */


    }

}
