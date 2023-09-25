package generic;

public class TreeDPrinter {
	private Powder  material;
	
	public void setMaterial( Powder  material) {
		this.material =  material;
	}
	
	public Powder getMaterial() {
		return material;
	}
	
	
	public void pirnt() {
		     System.out.println( "3D print use :" + material);
	}
	
	
	public static void main(String[] args) {
		TreeDPrinter printer = new TreeDPrinter();
		printer.setMaterial(new Powder());
		printer.pirnt();
	}

}
