package forma_pagamento;

public class Produto {
	private float preco;

	public Produto(float preco) {
		this.preco = preco;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	@Override
	public String toString() {
		return String.format("Preco: %",this.preco);
	}
}
