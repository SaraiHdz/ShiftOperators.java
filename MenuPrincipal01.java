//Menu principal
//limpiar consola multiplataforma, verificar funcionamiento en cualquier SO
import java.util.Scanner;
import java.io.*;

public class MenuPrincipal01{
    static boolean continuar = false;
	public static void main(String [] args){
        //Por hacer: depurar el clear de la pantalla
        try{
            if(System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
            else{
                Runtime.getRuntime().exec("clear");
            }
            
        }catch(IOException | InterruptedException ex ){
            System.out.println("Ocurrio un error al limpiar pantalla");
        }
        do{
        System.out.println("Programa demostrativo sobre Tipos de Datos en Java");
        System.out.println("Digite la opcion del menu segun corresponda");
        System.out.println("1. Boolean y caracteres");
        System.out.println("2. Double");
        System.out.println("3. Entero Simple");
        System.out.println("4. String");
        System.out.println("5. Not cientifica doble precision");     System.out.println("6. Shift Operators");
        System.out.print("Digite opcion:");
        Scanner entrada = new Scanner(System.in);
        int decision = Integer.parseInt(entrada.nextLine());
            switch(decision){
                case 1:
                    System.out.println("Ejemplo de Boolean y Caracteres");
                    //roberto y bryan
                    break;
                case 2:
                    System.out.println("Ejemplo de Doble");
                    //claudia
                    break;                
                case 3:
                    System.out.println("Ejemplo de Entero Simple");
                    //guerra
                    break;                
                case 4:
                    System.out.println("Ejemplo de String");
                    //walter
                    break;                
                case 5:
                    System.out.println("Ejemplo de Notacion Cientifica doble precision");
                    DobleP objDobleP = new DobleP(2.25,1.25);
                    break;                
                case 6:
                    System.out.println("Ejemplo de Shift Operators");
                    ShiftOperators objShiftOperators = new ShiftOperators(60,13,0);
                    break;                
                default:
                    System.out.println("Digite un numero entre 1 y 6");
                    break;                
            }//fin de switch
            //reinicio el valor de la variable para capturar la entrada del teclado
            decision = 0;
            System.out.print("Para continuar digite 1, caso contrario digite 0: ");
            decision = Integer.parseInt(entrada.nextLine());            
            if(decision == 1){
                continuar = true;
            }
            else{
                break;
            }
        }while(continuar);
	}//fin de la funcion main
}

