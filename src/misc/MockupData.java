package misc;

import java.util.ArrayList;

import model.Carro;
import model.Peca;
import model.Reparar;

public class MockupData {

	public static ArrayList<Carro> carro;
	public static ArrayList<Peca> peca;
	public static ArrayList<Reparar> reparar;
	
	public MockupData(){
		
		carro = new ArrayList<>();
		peca  = new ArrayList<>();
		reparar = new ArrayList<>();
	}
}
