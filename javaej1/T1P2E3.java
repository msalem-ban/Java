import java.util.Scanner;
public class T1P2E3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double saldo = 1075, cantidad;
        int opcion;


        do {
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            
            System.out.print("Opcion? ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    cantidad = teclado.nextDouble();
                    saldo += cantidad;
                    break;
                case 2:
                    cantidad = teclado.nextDouble();
                    saldo -= cantidad;
                    if(saldo < 0){
                        System.out.println("No hay saldo suficiente");
                    } else {
                        System.out.println("Operacion completada");
                    }
                    break;
                case 3:
                    System.out.println(saldo);
                    break;
                
            }
        } while (opcion != 4);{
        System.out.print("Saldo final: "+ saldo);
        System.out.println("Operacion finalizada");
        

    }
        
 
        
    }
    
}
