package model;

import java.util.ArrayList;

public class Reparar {

	public Reparar(){
		
	}
	
	public Reparar(int idReparacao, Carro carro, ArrayList<Peca> pecasTiradas, ArrayList<Peca> pecasMetidas,
			String dataInicio, String dataFinal, double custoMaoObra) {
		super();
		this.idReparacao = idReparacao;
		this.carro = carro;
		this.pecasTiradas = pecasTiradas;
		this.pecasMetidas = pecasMetidas;
		this.dataInicio = dataInicio;
		this.dataFinal = dataFinal;
		this.custoMaoObra = custoMaoObra;
	}

	private int idReparacao;
	private Carro carro;
	private ArrayList<Peca> pecasTiradas;
	private ArrayList<Peca> pecasMetidas;
	private String dataInicio;
	private String dataFinal;
	private double custoMaoObra;
	
	
	public int getIdReparacao() {
		return idReparacao;
	}

	public void setIdReparacao(int idReparacao) {
		this.idReparacao = idReparacao;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public ArrayList<Peca> getPecasTiradas() {
		return pecasTiradas;
	}

	public void setPecasTiradas(ArrayList<Peca> pecasTiradas) {
		this.pecasTiradas = pecasTiradas;
	}

	public ArrayList<Peca> getPecasMetidas() {
		return pecasMetidas;
	}

	public void setPecasMetidas(ArrayList<Peca> pecasMetidas) {
		this.pecasMetidas = pecasMetidas;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}

	public double getCustoMaoObra() {
		return custoMaoObra;
	}

	public void setCustoMaoObra(double custoMaoObra) {
		this.custoMaoObra = custoMaoObra;
	}
	
	
 	
}
