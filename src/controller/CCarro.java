package controller;

import java.util.Scanner;

import misc.MockupData;
import model.Carro;

public class CCarro {

	Scanner n = new Scanner(System.in);
	MockupData bd;
	
	public CCarro(){
		
		bd = new MockupData();
	}
	
	public void addCarro(String marcaCarro, String modeloCarro,boolean estadoCarro, String dataPrimRegisto){
		
		Carro c = new Carro(bd.carro.size(), marcaCarro, modeloCarro,estadoCarro, dataPrimRegisto);
		bd.carro.add(c);
		
	}
	
	public Carro listarCarroId(int idCar){
		Carro c = new Carro();
		idCar-=1;
		
		for(Carro nc:bd.carro){
			if(idCar == nc.getIdCarro()){
				c = nc;
			}
		}
		
		return c;
	}
	
	public void listarCarrosAtivos(){
		int cont=0;
		if(bd.carro.size()!= 0){
				for(int i=0; i<bd.carro.size();i++){
					if(bd.carro.get(i).isEstadoCarro()==true){
						System.out.println("MARCA: "+bd.carro.get(i).getMarcaCarro()+"\nMODELO: "+
							bd.carro.get(i).getModeloCarro()+"\nDATA DE REGISTO: "+bd.carro.get(i).getDataPrimRegisto());
					}else{
						cont++;
					}
				}
				if(cont==bd.carro.size()){
					System.out.println("NAO EXISTEM CARROS DISPONIVEIS");
				}
		}else{
			System.out.println("NÃO EXIXTEM CARROS REGISTADOS...");
		}
	
	}
}
