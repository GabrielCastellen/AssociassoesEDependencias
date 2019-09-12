package Ex2;

public class CarroMain {

	public static void main(String[] args) {
		
		Carro c = new Carro();
		c.dono.setNome("Jailson");
		c.dono.setEndereco("Casa 3 Rua Joao Peixeira");
		c.motor.setCilindros(6);
		c.motor.setCombustivel("Gasolina");
		c.motor.setMarca("Fiat");
		c.motor.setPotencia(100);
		c.setAno(2007);
		c.setCor("Azul");
		c.setFabricante("Fiat");
		c.setModelo("Uno");

		System.out.println(c);
	}

}
