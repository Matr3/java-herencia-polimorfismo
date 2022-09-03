
public class TestReferencias {

	public static void main(String[] args) {
		
		//el elemento mas generico puede ser adaptado al elemento mas especifico
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Diego");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Pedro");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		
		
		gerente.iniciarSesion("123456");
		
	}
	
}
