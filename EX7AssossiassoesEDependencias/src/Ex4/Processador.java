package Ex4;

public class Processador {
	
	private String marca;
	private String modelo;
	private float capacidade;
	private float cache;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		if(marca.length() > 0)
			this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		if(modelo.length() > 0)
		this.modelo = modelo;
	}
	public float getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(float capacidade) {
		if(capacidade > 0)
			this.capacidade = capacidade;
	}
	public float getCache() {
		return cache;
	}
	public void setCache(float cache) {
		if(cache > 0)
			this.cache = cache;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Processador [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", capacidade=");
		builder.append(capacidade);
		builder.append(", cache=");
		builder.append(cache);
		builder.append("]");
		return builder.toString();
	}
	

}
