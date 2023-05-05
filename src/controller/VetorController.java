package controller;

import docarmo.ListaInt.Lista;

public class VetorController {

	public VetorController() {
		super();
	}

	public void Operacoes(Lista l, int[] vt) {
		int tam = vt.length;
		for (int i = 0; i < tam; i++) {
			if (l.isEmpty()) {
				l.addFirst(vt[0] * 2);
			} else if (l.size() < 3) {
				try {
					l.addLast((int) vt[i]/2);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (l.size() > 10) {
				try {
					l.add(vt[i] * 3, 5);
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				try {
					l.add(vt[i], 1);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		while (!l.isEmpty()) {
			if (l.size() > 10) {
				try {
					System.out.print(l.get(3) + " ");
					l.remove(3);
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (l.size() > 5) {
				int tamanho = l.size();
				try {
					System.out.print(l.get(tamanho - 1) + " ");
					l.removeLast();
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (l.size() > 3) {
				try {
					System.out.print(l.get(1) + " ");
					l.remove(1);
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				try {
					System.out.print(l.get(0) + " ");
					l.removeFirst();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
