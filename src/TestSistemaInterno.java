
public class TestSistemaInterno {

	
	public static void main(String[] args) {
		SistemaInterno sistema = new SistemaInterno();
		Gerente gerente1 = new Gerente();
		Administrador admin = new Administrador();
		gerente1.setClave("123456");
		gerente1.iniciarSesion("123456");
		
		sistema.autentica(gerente1);
		sistema.autentica(admin);
		
	}
}
