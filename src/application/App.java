package application;

import java.util.Scanner;

import controller.CCarro;
import misc.MockupData;
import view.Interface;

public class App {

	static Interface i = new Interface();
	static CCarro g = new CCarro();
	MockupData bd = new MockupData();
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		boolean verf=true,verf2=true;
		
		do{
			
			i.menuP();
			int opc;
			opc = n.nextInt();
			switch(opc){
			case 1:
				i.menuCarro();
				int opc2 = n.nextInt();
				switch(opc2){
				case 1:
					i.regCarro();
				}			
				break;
			case 2:
				///i.///listCli();
				break;
			case 3:
				verf=false;
				break;
			default:
				break;
			}
		}while(verf);
		
		
	}	
}

