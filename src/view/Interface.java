package view;

import java.util.Scanner;

import controller.CCarro;
import misc.MockupData;
import model.Carro;

public class Interface {

	Scanner n = new Scanner(System.in);
	static MockupData bd = new MockupData();
	static CCarro ccarro = new CCarro();
	public Interface(){
		
	}
	
	public void menuCarro(){
		
		System.out.println("     		MENU CARRO     ");
		System.out.println("\n      1 - REGISTAR CARRO      ");
		System.out.println("      2 - LISTAR CARROS       ");
		System.out.println("      3 - LISTAR CARRO POR ID ");
		System.out.println("      4 - SAIR          ");
		
	}
	
	public void menuP(){
		
		System.out.println("     		MENU PRINCIPAL     ");
		System.out.println("\n    1 - GESTAO CARROS ");
		System.out.println("    2 - LISTAR REPARACOES  ");
		System.out.println("    3 - SAIR");
		
	}
	
	public void regCarro(){
		System.out.println("INSIRA A MARCA DO CARRO: ");
		String marca = n.nextLine();
		System.out.println("INSIRA O MODELO DO CARRO: ");
		String modelo = n.nextLine();
		System.out.println("INSIRA A DATA DO PRIMEIRO REGISTO DO CARRO: ");
		String data = n.nextLine();
		ccarro.addCarro(marca, modelo, data);
	}
	
	public void lCarro(){
		ccarro.listarTodosCarros();
	}
	public void lCarroId(){
		System.out.println("INTRODUZA O ID QUE DESEJA PROCURAR: ");
		int idCar = n.nextInt();
		Carro c=ccarro.listarCarroId(idCar);
		System.out.println("MARCA: "+c.getMarcaCarro()+"\nMODELO: "+c.getModeloCarro()+"\nDATA DE REGISTO: "+c.getDataPrimRegisto());
	}
}
