import java.util.Scanner;
import com.zubiri.geometria.*;



public class OperacionesGeometricas {


public static void main(String[] ar) {

		String opcion;

		Scanner sc = new Scanner(System.in);
		Circulo cir = new Circulo();
		Rectangulo rec = new Rectangulo();

		System.out.println("\nDe que figura quieres hacer los cálculos?");
		System.out.println("\nEscribe `circulo´ o `rectangulo´...");

		opcion = sc.next();


		while(!opcion.equalsIgnoreCase("circulo")&&!opcion.equalsIgnoreCase("rectangulo")){

			System.out.println("\nVa a ser que no has escrito bien...");
			System.out.println("\nPrueba otra vez...");

			opcion = sc.next();
		}

		if(opcion.equals("circulo")) {

			double radio, area, circu;
			System.out.println("\nVamos a calcular el área y circunferencia de un " + opcion);
			System.out.println("Introduzca el radio del círculo en cuestión");

			radio = sc.nextDouble();
			cir.setRadio(radio);
			area = cir.getArea();
			circu = cir.getCircu();

			System.out.println("El área del círculo es: " + area);
			System.out.println("La circunferencia del círculo es: " +circu);
		}

		else{

			double altura, base, perimetro, superficie;

			System.out.println("\nVamos a calcular la superficie y el perimetro de un rectangulo");
			System.out.println("\nIntroduce la altura del rectangulo");

			altura = sc.nextDouble();
			

			System.out.println("\nAhora introduce la base del rectangulo");

			base = sc.nextDouble();
			rec.setMedidas(base, altura);			

			//perimetro = rec.perimetro();
			//superficie = rec.superficie();

			//System.out.println("\nCon una altura de: "+ rec.getAltura() + " y una anchura de: "+ rec.getBase() +"...");
			System.out.println("La superficie del rectangulo es: "+ rec.getSuperficie());
			System.out.println("\ny el perimetro es: "+ rec.getPerimetro());
		}
	}
}





