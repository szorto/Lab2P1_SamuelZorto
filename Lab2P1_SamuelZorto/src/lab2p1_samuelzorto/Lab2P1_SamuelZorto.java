package lab2p1_samuelzorto;

import java.util.Scanner;

public class Lab2P1_SamuelZorto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elija el No. del ejercicio que desea hacer: ");
        System.out.println("1. Ejercicio práctico 1 – Índice académico ");
        System.out.println("2. Ejercicio práctico 2 – ¡OK Boomer! ");
        System.out.println("3. Ejercicio práctico 3 – ¡Gotta Know Them All! ");
        
        int ejercicio_sz = entrada.nextInt();
        if(ejercicio_sz == 1){
            
        
        //Ejercicio práctico 1 – Índice académico 
        
        //:) = fue facil     :( = me costo
        
        //Se ingresa los valores de A y B :)
        System.out.print("Ingrese A: ");
        int numA_sz = entrada.nextInt();
        int Amcd_sz = numA_sz;// 25
        
        System.out.print("Ingrese B: ");
        int numB_sz = entrada.nextInt();
        int Bmcd_sz = numB_sz;//15
        int resultado = 0;
        
        //Se calcula el MCD :(
        if((numA_sz != 0) && (numB_sz != 0)){
            while(Amcd_sz != Bmcd_sz){// 5 y 5
                if(Amcd_sz > Bmcd_sz){
                    Amcd_sz = Amcd_sz - Bmcd_sz;//25-15=10, 10-5=5
                    resultado = Amcd_sz;
                }
                else if (Amcd_sz < Bmcd_sz) {
                    Bmcd_sz = Bmcd_sz - Amcd_sz; //15-10= 5
                    resultado= Bmcd_sz;
                }
            }
        int MCD_sz = resultado;
        System.out.println("El MCD de " + numA_sz + " y " + numB_sz + " es: " + MCD_sz);
        
        }else{
            System.out.println("Los números ingresados deben ser positivos.");
        }
        }else if(ejercicio_sz == 2){
        //7/10, no era tan dificil, solo puse una letra diferente y me tuvo con miedo por como una hora.
        
        
        //Ejercicio práctico 2 – ¡OK Boomer!
        // Ingresar y print 
        System.out.print("Ingrese su año de nacimiento: ");
        int Naci_sz = entrada.nextInt();
        
        if((Naci_sz >= 1946) && (Naci_sz <= 1964)){
            System.out.println("¡Felicidades usted es de la Generación Baby Boomer Gen!");
        }else if((Naci_sz >= 1960) && (Naci_sz <= 1979)){
            System.out.println("¡Felicidades usted es de la Generación X!");
        }else if((Naci_sz >= 1975) && (Naci_sz <= 1985)){
            System.out.println("¡Felicidades usted es de la Generación Xennials!");
        }else if((Naci_sz >= 1980) && (Naci_sz <= 1994)){
            System.out.println("¡Felicidades usted es de la Generación Millenials!");
        }else if((Naci_sz >= 1990) && (Naci_sz <= 2012)){
            System.out.println("¡Felicidades usted es de la Generación Z!");
        }else if((Naci_sz >= 2013) && (Naci_sz <= 2025)){
            System.out.println("¡Felicidades usted es de la Generación Alpha!");
        }
        }else{
        //8/10 facil, simple, no costo entender en lo absoluto :)
        
        
        //Ejercicio práctico 3 – ¡Gotta Know Them All!
        System.out.println("BIENVENIDO A TU PRIMERA LUCHA ENTRENADOR POKEMON");
        System.out.println("ELIJA EL NO. DEL TIPO DEL POKEMON ATACADOR: ");
        System.out.println("1. Luchador");
        System.out.println("2. Psiquico");
        System.out.println("3. Hierro");
        System.out.println("4. Hada");
        int pokeA_sz = entrada.nextInt();
        
        System.out.println("ELIJA EL NO. DEL TIPO DEL POKEMON DEFENSOR: ");
        System.out.println("1. Luchador");
        System.out.println("2. Psiquico");
        System.out.println("3. Hierro");
        System.out.println("4. Hada");
        int pokeD_sz = entrada.nextInt();
        
        if(pokeA_sz == 1){
            if(pokeD_sz == 1){
                System.out.println("¡El tipo Luchador es neutral contra el tipo Luchador!");
            }else if(pokeD_sz == 2){
                System.out.println("¡El tipo Luchador es debil contra el tipo Psiquico!");
            }else if(pokeD_sz == 3){
                System.out.println("¡El tipo Luchador es super eficaz contra el tipo Hierro!");
            }else if(pokeD_sz == 4){
                System.out.println("¡El tipo Luchador es debil contra el tipo Hada!");
            }
        }else if(pokeA_sz == 2){
            if(pokeD_sz == 1){
                System.out.println("¡El tipo Psiquico es super eficaz contra el tipo Luchador!");
            }else if(pokeD_sz == 2){
                System.out.println("¡El tipo Psiquico es debil contra el tipo Psiquico!");
            }else if(pokeD_sz == 3){
                System.out.println("¡El tipo Psiquico es debil contra el tipo Hierro!");
            }else if(pokeD_sz == 4){
                System.out.println("¡El tipo Psiquico es neutro contra el tipo Hada!");
            }
        }else if(pokeA_sz == 3){
            if(pokeD_sz == 1){
                System.out.println("¡El tipo Hierro es neutral contra el tipo Luchador!");
            }else if(pokeD_sz == 2){
                System.out.println("¡El tipo Hierro es neutral contra el tipo Psiquico!");
            }else if(pokeD_sz == 3){
                System.out.println("¡El tipo Hierro es debil contra el tipo Hierro!");
            }else if(pokeD_sz == 4){
                System.out.println("¡El tipo Hierro es super eficaz contra el tipo Hada!");
            }
        }else if(pokeA_sz == 4){
            if(pokeD_sz == 1){
                System.out.println("¡El tipo Hada es super eficaz contra el tipo Luchador!");
            }else if(pokeD_sz == 2){
                System.out.println("¡El tipo Hada es neutral contra el tipo Psiquico!");
            }else if(pokeD_sz == 3){
                System.out.println("¡El tipo Hada es debil contra el tipo Hierro!");
            }else if(pokeD_sz == 4){
                System.out.println("¡El tipo Hada es neutral1 contra el tipo Hada!");
            }
        }
        }
    }
    
}
