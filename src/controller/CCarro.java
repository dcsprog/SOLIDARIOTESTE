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
	
	public void addCarro(String marcaCarro, String modeloCarro, String dataPrimRegisto){
		
		Carro c = new Carro(bd.carro.size(), marcaCarro, modeloCarro, dataPrimRegisto);
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
	
	public void listarTodosCarros(){
		if(bd.carro.size()!= 0){
			for(Carro c: bd.carro){
				System.out.println("MARCA: "+bd.carro.get(0).getMarcaCarro()+"\nMODELO: "+bd.carro.get(0).getModeloCarro()+"\nDATA DE REGISTO: "+bd.carro.get(0).getDataPrimRegisto());
			}
		}else{
			System.out.println("NÃO EXIXTEM CARROS REGISTADOS...");
		}
	
	}
}
