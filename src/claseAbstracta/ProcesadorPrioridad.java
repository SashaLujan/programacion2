/**
 * 
 */
package claseAbstracta;

/**
 * @author usuario
 *
 */
public class ProcesadorPrioridad {

	public boolean compare(Tarea t1, Tarea t2) {
		return t1.getPrioridad() > t2.getPrioridad();
	}
}