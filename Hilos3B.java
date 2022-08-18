package Hilos;
public class Hilo3B implements Runnable
{
	public static void main( String[] args){
		Hilo3B trabajo = new Hilo3B(); //trabajo
		Thread trabajador = new Thread(trabajo); 
		trabajador.start();
		System.out.println("MAIN");
	}

	public void run(){
		//Trabajo de el hilo
		System.out.println("Hilo");
		go();
	}

	public void go() {
		doMore();
	}

	public void doMore() {
		System.out.println("top o’ the stack");
	}
}//clase
