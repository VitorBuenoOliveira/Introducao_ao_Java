package Aves;

public class TestarAve {
	public static void main(String[] args) {
		Aves canario = new Aves(0, 0, 0);
		System.out.println(canario.peso);
		
		Aves sabia = new Aves(0, 0, 0);
		System.out.println(sabia.cantar());
		
	}
}
