import java.util.Scanner;
import com.zubiri.geometria.*;



public class OperacionesGeometricas {


public static void main(String[] ar) {

		String opcion;

		Scanner sc = new Scanner(System.in);
		Circulo cir = new Circulo();
		Rectangulo rec = new Rectangulo();

		System.out.println("\nDe que figura quieres hacer los cálculos?");
		System.out.println("\nEscribe 'c'(circulo)   'r'(rectangulo)   't'(terminar).");

		opcion = sc.next();


		while(!opcion.equalsIgnoreCase("c")&&!opcion.equalsIgnoreCase("r")&&!opcion.equalsIgnoreCase("t")){

			System.out.println("\nNo has seleccionado ninguna de las opciones dadas ");
			System.out.println("\nPrueba otra vez...");

			opcion = sc.next();
		}

		if(opcion.equals("C")) {

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

		if(opcion.equals("R")){

			double altura, base, peri, area;

			System.out.println("\nVamos a calcular la superficie y el perimetro de un rectangulo");
			System.out.println("\nIntroduce la altura del rectangulo");

			altura = sc.nextDouble();
			rec.setAltura(altura);			

			System.out.println("\nAhora introduce la base del rectangulo");

			base = sc.nextDouble();
			rec.setBase(base);			


			System.out.println("La superficie del rectangulo es: "+ rec.Area());
			System.out.println("\ny el perimetro es: "+ rec.Peri());
		}

		if(opcion.equals("T")){

			System.out.println("\nHas seleccionado terminar, hasta otra");
}
	}
}

