
public class TestControlBonificaion {
	
	public static void main(String[] args) {
		Funcionario diego = new Contador();
		diego.setSalario(2000);
		
		Gerente pablo = new Gerente();
		pablo.setSalario(10000);
		
		Contador marcelo = new Contador();
		marcelo.setSalario(5000);
		
		ControlBonificacion controlBonificacion = new ControlBonificacion();
		
		controlBonificacion.registrarSalario(diego);
		controlBonificacion.registrarSalario(pablo);
		controlBonificacion.registrarSalario(marcelo);
		
	}

}
