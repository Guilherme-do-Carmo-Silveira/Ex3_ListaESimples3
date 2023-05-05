package view;

import controller.VetorController;
import docarmo.ListaInt.Lista;

public class main {

	public static void main(String[] args) {
		
		VetorController control = new VetorController();
		Lista l = new Lista();
		
		int [] vt = {25, 42, 23, 74, 80, 77, 13, 41, 59, 35, 68, 53, 75, 84, 44, 94, 39, 71, 88};
		
		control.Operacoes(l, vt);
	}
}
