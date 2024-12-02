package claseAbstracta;

public class Main {

	public static void main(String [] main) {
		Tarea t1 = new Tarea(1,3,2);
		Tarea t2 = new Tarea(12,22,100);
		Tarea t3 = new Tarea(222,21,11);
		Tarea t4 = new Tarea(1,1,1);
		
		Procesador compu = new ProcesadorLlegada();
		
		compu.addTarea(t1);
		compu.addTarea(t2);
		compu.addTarea(t3);
		compu.addTarea(t4);
		
		while(compu.tieneTareas()) {
			compu.ejecutarTarea();
		}
	}
}
