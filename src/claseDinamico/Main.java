/**
 * 
 */
package claseDinamico;

/**
 * @author usuario
 *
 */
public class Main {

	public static void main(String[] args) {
		Tarea t1 = new Tarea(1,2,3);
		Tarea t2 = new Tarea(12,13,16);
		Tarea t3 = new Tarea(33,200,19);
		Tarea t4 = new Tarea(10,29,100);
		
		Procesador compu = new Procesador();
		Procesador cc = compu;
		
		compu.addTarea(t1);
		compu.addTarea(t2);
		compu.addTarea(t3);
		compu.addTarea(t4);
		
		//compu.cambiar(new ComparadorMemoria());
		
		while(cc.tieneTareas()) {
			cc.ejecutarTarea();
		}
	}
}
