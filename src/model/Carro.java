package model;

public class Carro {

	public Carro(){
		
	}
	
	public Carro(int idCarro, String marcaCarro, String modeloCarro, String dataPrimRegisto) {
		super();
		this.idCarro = idCarro;
		this.marcaCarro = marcaCarro;
		this.modeloCarro = modeloCarro;
		this.dataPrimRegisto = dataPrimRegisto;
	}

	private int idCarro;
	private String marcaCarro;
	private String modeloCarro;
	private String dataPrimRegisto;
	
	public int getIdCarro() {
		return idCarro;
	}

	public void setIdCarro(int idCarro) {
		this.idCarro = idCarro;
	}

	public String getMarcaCarro() {
		return marcaCarro;
	}

	public void setMarcaCarro(String marcaCarro) {
		this.marcaCarro = marcaCarro;
	}

	public String getModeloCarro() {
		return modeloCarro;
	}

	public void setModeloCarro(String modeloCarro) {
		this.modeloCarro = modeloCarro;
	}

	public String getDataPrimRegisto() {
		return dataPrimRegisto;
	}

	public void setDataPrimRegisto(String dataPrimRegisto) {
		this.dataPrimRegisto = dataPrimRegisto;
	}
	
	
	
}
