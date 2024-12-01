/**
 * 
 */
package herencia;

/**
 * @author usuario
 *
 */
public class Main {

	public static void mostrar(Figura f1) {
		System.out.println("el " + f1.getNombre() + " tiene un area de " + f1.getArea() + " y un perimetro de "
				+ f1.getPerimetro());
	}

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo(10, 20);
		double area = r1.getArea();
		System.out.println("el " + r1.getNombre() + area);

		Circulo c1 = new Circulo(10);
		double area2 = c1.getArea();
		System.out.println("el " + c1.getNombre() + area2);

		Figura f1 = new Figura("cualquiera");

		Circulo cc1 = new Circulo(10);
		Rectangulo rr1 = new Rectangulo(10, 10);

		mostrar(cc1);
		mostrar(rr1);

		mostrar(new FiguraArea("fija", 1000));

		MedioCirculo md = new MedioCirculo(10);

		mostrar(md);

		System.out.println(f1.getDatosCompletos());
		System.out.println(cc1.getDatosCompletos());
		System.out.println(rr1.getDatosCompletos());
		System.out.println(md.getDatosCompletos());
	}
}
