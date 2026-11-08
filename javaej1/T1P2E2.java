import java.util.Scanner;
public class T1P2E2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        int suma = 0;
        int nota;
        int mayor = 0;
        int menor = 0;
        int alumnos = 0;
        int notables = 0;
        int suspensos = 0;
        
        System.out.println("¿Cuantas notas va a introducir?");
        n = teclado.nextInt();
        
        //while (nota >= 0 && nota <= 10) {
        for (int i = 1; i <= n; i++) {
            System.out.print("Nota " + i + ": ");
            nota = teclado.nextInt();
            suma = suma + nota;
            alumnos++;
            if (alumnos == 1 || nota > mayor) {
                 mayor = nota;
            }
            if (alumnos == 1 || nota < menor) {
                    menor = nota;
            }
            if (nota < 7){
                suspensos++;
            } else {
                    notables++;
                }
        }
        //}else {
          //  System.out.println("ERROR! Nota incorrecta!");
        //}
        System.out.println("Notables: "+ notables);
        System.out.println("Suspensos: "+ suspensos);
        System.out.println("Nota maxima: "+ mayor);
        System.out.println("Nota minima: "+ menor);
        System.out.println("Suma de nota: " + suma);
        

    }
    
}
