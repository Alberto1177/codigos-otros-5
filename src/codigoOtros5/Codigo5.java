package codigoOtros5;
//importar el scanner
import java.util.Scanner;

public class Codigo5 {
	//falta agregar el metodo main
	public static void main(String[] args) {
		//Hace falta agregar el system.in
		Scanner s = new Scanner(System.in);
		//La ultima comilla es doble
	    System.out.print("Introduzca un número: ");
	    //El tipo de variable debe ser un int y debe cambiarse el metodo
	    int ni = s.nextInt();
	    int c = ni;
	    
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (ni > 0) {
	    	//No es necesaria la conversion al tratarse del mismo tipo
		  int digito = ni % 10;
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
	      }
	      //Se movio fuera del else
	      ni /= 10;
	    }
	    //Se saco la condicion del while
	    if (afo > noAfo) {
	    	//esta mal escrito printfln
	      System.out.println("El " + c + " es un número afortunado.");
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }
	 //Cerrar el scanner
        s.close();
	}
}
