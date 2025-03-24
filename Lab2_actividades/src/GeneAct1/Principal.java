package GeneAct1;

public class Principal {
	public static void main(String[] args) {
		Bolsa < Chocolatina > bolsaCho = new Bolsa < Chocolatina > (3);
		Chocolatina c = new Chocolatina("milka");
		Chocolatina c1 = new Chocolatina("milka");
		Chocolatina c2 = new Chocolatina("ferrero");
		bolsaCho.add(c);
		bolsaCho.add(c1);
		bolsaCho.add(c2);
		for (Chocolatina chocolatina: bolsaCho) {
			System.out.println(chocolatina.getMarca());
		}
		
		Bolsa < Golosina > bolsaGo = new Bolsa < Golosina > (3);
		Golosina g = new Golosina("golosina1",1);
		Golosina g1 = new Golosina("golosina2",2);
		Golosina g2 = new Golosina("golosin3",3);
		bolsaGo.add(g);
		bolsaGo.add(g1);
		bolsaGo.add(g2);
		for (Golosina go: bolsaGo) {
			System.out.println(go.getNombre()+" " + go.getPeso());
		}
	}
}
