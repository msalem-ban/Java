import java.util.Scanner;
public class T1P2E1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca un numero entre 17 y 25: ");
        int num = teclado.nextInt();
        
        

        while (num <= 25 && num >= 17 ) {
            int aleatorio = (int)(Math.random()*(55 - 5 + 1)+ 5);
            System.out.println("La máquina ha sacado un: "+aleatorio);
            
            if (num > aleatorio){
                System.out.print("Tu ganas!!!");
            }
            else if (num < aleatorio){
                System.out.print("La máquina gana!!!");
            }
            System.out.print("Empate!!!");
            num = teclado.nextInt();
        }
        System.out.print("ERROR. El número introducido no está en el rango indicado.");
            
        }
    
      
        
        
        
        
        
    }
    

