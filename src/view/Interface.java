package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.CCarro;
import controller.CReparar;
import misc.MockupData;
import model.Carro;
import model.Peca;
import model.Reparar;

public class Interface {

	Scanner n = new Scanner(System.in);
	static MockupData bd = new MockupData();
	static CCarro ccarro = new CCarro();
	static CReparar creparar = new CReparar();
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
		System.out.println("	ESTADO DO CARRO		");
		System.out.println("ATIVO(1) ou INATIVO(2)");
		int est = n.nextInt();
		boolean estado = false;
		if(est==1){
			estado=true;
		}else if(est==2){
			estado=false;
		}
		
		ccarro.addCarro(marca, modelo,estado, data);
	}
	
	public void lCarro(){
		ccarro.listarCarrosAtivos();
	}
	
	public void lCarroId(){
		System.out.println("INTRODUZA O ID QUE DESEJA PROCURAR: ");
		int idCar = n.nextInt();
		Carro c=ccarro.listarCarroId(idCar);
		System.out.println("MARCA: "+c.getMarcaCarro()+"\nMODELO: "+c.getModeloCarro()+"\nDATA DE REGISTO: "+c.getDataPrimRegisto());
	}
	
	public void regRepararacao(int idCar){
		idCar-=1;
		Carro c =ccarro.listarCarroId(idCar);
		ArrayList<Peca> tiradas = null;
		ArrayList<Peca> repostas = null;
		System.out.println("QUANTAS PECAS FORAM TIRADAS?");
		int quant = n.nextInt();
		for(int i=0; i<quant;i++){
			System.out.println("INTRODUZA O NOME DA PECA: ");
			String nomePeca = n.nextLine();
			System.out.println("INTRODUZA A DESCRICAO DA PECA: ");
			String descricaoPeca = n.nextLine();
			//System.out.println("INTRODUZA O PRECO DA PECA: ");
			double precoPeca =0;
			Peca e = new Peca(tiradas.size(),nomePeca,descricaoPeca,precoPeca);
			tiradas.add(e);
		}
		for(int i=0; i<quant;i++){
			System.out.println("INSIRA O ID DA PECA RETIRADA: ");
			int id = n.nextInt();
			if(id==tiradas.get(i).getIdPeca()){
				System.out.println("NOME DA PECA: "+tiradas.get(i).getNomePeca());
				System.out.println("DESCRICAO DA PECA: "+tiradas.get(i).getDescricaoPeca());
				System.out.println("INTRODUZA O PRECO DA PECA: ");
				double precoPeca = n.nextDouble();
				Peca r = new Peca(repostas.size(),tiradas.get(i).getNomePeca(),tiradas.get(i).getDescricaoPeca(),precoPeca);
				repostas.add(r);
			}
		}
		System.out.println("INTRODUZA A DATA DE INICIO DA REPARACAO: ");
		String dataI = n.nextLine();
		System.out.println("INTRODUZA A DATA FINAL DA REPARACAO: ");
		String dataF = n.nextLine();
		System.out.println("INTRODUZA O VALOR DA MAO DE OBRA DA REPARACAO: ");
		double valor = n.nextDouble();
		
		Reparar r = new Reparar(bd.reparar.size(),c,tiradas,repostas,dataI,dataF,valor);
		bd.reparar.add(r);
	}
	
	
	
}
