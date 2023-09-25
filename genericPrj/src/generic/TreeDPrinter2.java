package generic;

public class TreeDPrinter2 {
	private Plastic  material;
	
	public void setMaterial( Plastic  material) {
		this.material =  material;
	}
	
	public Plastic getMaterial() {
		return material;
	}
	
	public void pirnt() {
	     System.out.println( "3D print use :" + material);
}


public static void main(String[] args) {
	TreeDPrinter2 printer = new TreeDPrinter2();
	printer.setMaterial(new Plastic());
	printer.pirnt();
}

}
