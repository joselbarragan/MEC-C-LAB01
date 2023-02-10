import java.util.Scanner;

 
public class Lab011 {

   
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        int a, b, suma, resta;
        float iva, c;
        double multi, divi, pote, seno, coseno, tangente; 
       while(!salir){
            System.out.println("Ingrese el o los valores a operar (maximo 2), en caso de potencia la primera variable es la base y la segunda la potencia: ");
            System.out.println("si solo requiere un valor ingrese un 0 como segundo");
            a = sn.nextInt();
            b = sn.nextInt();
            System.out.println("1. suma");
            System.out.println("2. resta");
            System.out.println("3. multiplicacion");
            System.out.println("4. division");
            System.out.println("5. raiz");
            System.out.println("6. potencia");
            System.out.println("7. seno");
            System.out.println("8. coseno");
            System.out.println("9. tangente");
            System.out.println("10. hallar el IVA");
            System.out.println("11. salir");
            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();
            switch(opcion){
                
            
               case 1:
                   suma = a + b;
                   System.out.println("la suma de " + a + " + " + b + " es: " + suma);
                   break;
               case 2:
                   resta = a - b;
                   System.out.println("la resta de " + a + " - " + b + " es: " + resta);
                   break;
                case 3:
                    multi = a * b ;
                   System.out.println("la multiplicacion de " + a + " * " + b + " es: " + multi);
                   break;
                case 4:
                    divi = a / b;
                    System.out.println("la division de " + a + " / " + b + " es: " + divi);
                    break;
                case 5:
                    double raiz = Math.sqrt(a);
                    System.out.println("la raiz cuadrada de " + a +" es: " + raiz);
                    break;
                case 6:
                    double numero = a;
                    double elevado = Math.pow(numero,b);
                    System.out.println("el resultado de " + a + " ^ " + b + " es: " + elevado);
                    break;
                case 7:
                    System.out.println("el seno de "+ a +"es: "+Math.sin(a));
                    break;
                case 8:
                    System.out.println("el coseno de "+ a +"es: "+Math.cos(a));
                    break;
                case 9:
                    System.out.println("la tangente de " + a + "es: " + Math.tan(a));
                    break;
                case 10:
                    System.out.println("ingrese el IVA");
                    c = sn.nextInt();
                    iva = a * (c/100);
                    System.out.println("el IVA es de " + iva);
                    break;
                case 11:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 11");
            } 
        }          
                
    }
    
}