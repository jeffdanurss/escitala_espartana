package escitala;

import java.util.Scanner;


public class Escitala {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char[][] matriz =new char[4][4];
        String frase;
        char letra;
        char[] arreglo =new char [4*4];
        char[] txtcifrado = new char [4*4];
        char [] txtdecifrado = new char[4*4];
        int i=0,j=0,a=0;
        System.out.println("Ingresa una frase(no debe pasarse de :)"+4*4+"caracteres");
        frase=leer.nextLine();
        if(frase.length()<4*4){
            //pasa la frase ingresada a un arreglo tipo caracter
            for(i=0; i<frase.length();i++){
                
                if (frase.charAt(i)==' ') {
                    letra='+';
                }else{
                    letra=frase.charAt(i);
                }
                arreglo[i]=letra;
            }  
            //relleno los espacios en blanco
            if(frase.length()<4*4){
                for(i=frase.length();i<4*4;i++){
                arreglo[i]='+';
                }
            }
            System.out.println(" ");
            System.out.println("El arreglo con las partes sobrantes rellenadas son:");
            
            System.out.println(arreglo);
            //pasamos el arreglo a una matriz
            for(j=0,i=0;j<matriz.length;j++){
                for(a=0;a<matriz[0].length;a++){
                    matriz[j][a]=arreglo[i];
                    i++;
                }
            }
            //imprimimos la matriz
            System.out.println("");
            System.out.println("La frase en linea quequeda asi:");
            for(j=0;j<matriz.length;j++){
                for(a=0;a< matriz[0].length;a++){
                    System.out.println(matriz[j][a]+"\t");
                }
                System.out.println();
            }
            //hacemos la transpuerta hacia el arreglo final
            for(j=0,i=0;j<matriz[0].length;j++){
                for(a=0;a<matriz.length;a++){
                    txtcifrado[i]=matriz[a][j];
                    i++;
                }
                
            }
            //imprimir texto cifrado
            System.out.println("");
            System.out.println("El texto cifrado quedaria de la siguiente manera:");
            System.out.println(txtcifrado);
            //decifra el texto usando la matriz
            
            for(j=0,i=0;j<matriz[0].length;j++){
                for(a=0;a<matriz.length;a++){
                    matriz[a][j]=txtcifrado[i];
                    i++;
                }
            }
            for(j=0,i=0;j<matriz.length;j++){
                for(a=0;a<matriz[0].length;a++){
                    if(matriz[j][a]=='+')
                      txtdecifrado[i]=' ';
                    else
                        txtdecifrado[i]=matriz[j][a];
                    i++;
                }
                
                
            }
            //imprimir texto decifrado
            System.out.println("");
            System.out.println("El texto original es:");
            System.out.println(txtdecifrado);
        }else{
            System.out.println("El texto no debe superar los"+4*4+"caracteres");
        }
    }
    
}
