package principal;

public aspect Logger {
	pointcut cambio() : call(* cambiarColor*(..) );
	after() : cambio(){
		System.out.println("Se ha cambiado el color del fondo");
	}


}
