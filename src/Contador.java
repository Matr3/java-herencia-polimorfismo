
public class Contador extends Funcionario{
	
	@Override
	public double getBonificacion() {
		System.out.println("Ejecutando desde el contador");
		return 200;
	}

}
