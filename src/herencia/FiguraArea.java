/**
 * 
 */
package herencia;

/**
 * @author usuario
 *
 */
public class FiguraArea extends Figura{
	double area;
	
	public FiguraArea(String nombre, double area) {
		super(nombre); //trae nombre de la clase padre
		this.area = area;
	}
	
	public double getArea() {
		return area;
	}
}
