package controller;

import java.util.ArrayList;
import java.util.Scanner;

import misc.MockupData;
import model.Carro;
import model.Peca;
import model.Reparar;

public class CReparar {

	Scanner n = new Scanner(System.in);
	CCarro cc = new CCarro();
	MockupData bd;
	
	public CReparar(){
		
		bd = new MockupData();
	}
	
	public void regReparacao(int idCar,ArrayList<Peca> pecasTiradas, ArrayList<Peca> pecasMetidas,
			String dataInicio, String dataFinal, double custoMaoObra){
		if(bd.carro.isEmpty()!=true){
			//System.out.println("INTRODUZA O ID DO CARRO: ");
			Carro c = cc.listarCarroId(idCar);
			Reparar r = new Reparar(bd.reparar.size(),c,pecasTiradas, pecasMetidas,
					dataInicio,  dataFinal, custoMaoObra);
		}
	}
	
	 
}
