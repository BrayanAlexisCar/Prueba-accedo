import java.util.Scanner;

public class Morse{
    public static void main(String[] args) {
    Scanner entrada_texto = new Scanner(System.in);
    Scanner entrada_numero = new Scanner(System.in);


    String codigo_morse[] = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", 
    ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
                                                                //z    
    String abecedario[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
    "r", "s", "t", "u", "v", "w", "x", "y", "z"};

   
    int opcion = 0;
   


        do {
            System.out.println("------------------------------------- |");
            System.out.println("     TRADUCTOR DE CODIGO MORSE        |");
            System.out.println("------------------------------------- |");
            System.out.println("     ESCRIBA UNA OPCION               |");
            System.out.println("1. Traducir texto a codigo morse      |");
            System.out.println("2. Traducir morse a texto             |");
            System.out.println("3. Salir                              |");
            System.out.println("------------------------------------- |");
            System.out.println("------------------------------------- |");
            opcion = entrada_numero.nextInt();

          
            if(opcion == 1){
                System.out.println();
                System.out.println("------------------------------------- |");
                System.out.println("        TEXTO A CODIGO MORSE          |");
                System.out.println("------------------------------------- |");
                System.out.println();

                System.out.print(" Ingrese el texto para traducirlo ( De la A a la Z ): ");
                String texto = entrada_texto.nextLine().toLowerCase();
                
                char letra[] =  texto.toCharArray();

                String traduccion = "";
                boolean caracter_valido = true;
               
                
                
                for (int i = 0; i < texto.length(); i++) {

                    if (letra[i] == ' '){
                        traduccion = traduccion + "/ ";
                        
                    }else{
                        boolean letra_morse_encontrada = false;
                        for (int j = 0; j < abecedario.length; j++) {
                            if(letra[i] == abecedario[j].charAt(0)){
                                traduccion = traduccion + codigo_morse[j] + " ";
                                
                                letra_morse_encontrada = true;                
                                break;
                            }

                        }
                        if (!letra_morse_encontrada ) {
                            System.out.println("No se puede traducir el caracter : " + letra[i] + " por favor, intente de nuevo con caracteres validos");
                            caracter_valido = false;
                            
                        }
                   
                    }
                }
                
                if (caracter_valido) {
                    System.out.println();
                    System.out.println("------------------------------------- ");
                    System.out.println();
                    System.out.println("La traduccion del texto es: "+traduccion);
                    System.out.println();
                    System.out.println("------------------------------------- ");
                    System.out.println();
                }
    
            }
            
            if (opcion == 2){ 
                System.out.println();
                System.out.println("------------------------------------- |");
                System.out.println("        CODIGO MORSE A TEXTO          |");
                System.out.println("------------------------------------- |");
                System.out.println();
                System.out.println("------------------------------------- ");
                System.out.print(" Ingrese el codigo morse para traducirlo ( De la A a la Z )(recuerde dejar espacio entre cada letra): ");
                String morse = entrada_texto.nextLine();
                System.out.println("------------------------------------- ");

                String letra_morse[] = morse.split(" ");
                int limite = letra_morse.length;
            
                String traduccion = "";
                boolean caracter_valido = true;
                
                 //.... . .-.. .-.. --- / .-- --- .-. .-.. -..
                for  (int i = 0; i < limite ; i++){
		        	
                         boolean letra_encontrada = false;

                            if (letra_morse[i].equals("/")) {
                                traduccion += " ";
                                continue; 
                            }
                
                        for (int j = 0; j < codigo_morse.length; j++){ 
                            if (letra_morse[i].equals(codigo_morse[j])) {
                                traduccion = traduccion + abecedario[j] ;                            
                                letra_encontrada = true;
                                break;
		        		    }
                        }
                        if (!letra_encontrada ) {
                            System.out.println("No se pudo traducir el caracter : " + letra_morse[i] + " por favor, intente de nuevo con caracteres validos");
                            caracter_valido = false; 
                            
            
                        }
   
		        }
                 
                if(caracter_valido){
                    System.out.println("------------------------------------- ");
                    System.out.println(" la traduccion de el codigo morse a texto normal es: " +traduccion);
                    System.out.println("------------------------------------- ");
                }
            }
            
        }while(opcion != 3); 

    }

              
}









       
            
           

    






