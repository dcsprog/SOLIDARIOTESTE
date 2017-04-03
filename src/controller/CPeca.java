package controller;

import java.util.Scanner;

import misc.MockupData;
import model.Peca;

public class CPeca {
	
	Scanner n = new Scanner(System.in);
	MockupData bd;
	
	public CPeca(){
		bd = new MockupData();
	}
	
	public void addPeca(int idPeca, String nomePeca, String descricaoPeca, double precoPeca){
		Peca p = new Peca(bd.peca.size(), nomePeca,  descricaoPeca, precoPeca);
		bd.peca.add(p);
	}
	
	public Peca listarPeca(int idPeca){
		Peca p = new Peca(); 
		idPeca-=1;
		for(Peca np: bd.peca){
			if(idPeca == np.getIdPeca()){
				p = np;
			}
		}
		
		return p;
	}

}
