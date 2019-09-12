package Ex4;

public class ComputadorMain {

	public static void main(String[] args) {
		
		Computador computador = new Computador();
		computador.setTensao(220);
		computador.setMarca("Dell");
		computador.mouse.setMarca("Logitec");
		computador.mouse.setTipo("Laser");
		computador.gabinete.placamae.memoria.setCapacidade(8);
		
		System.out.println(computador);

	}

}
