package generic;

public class GenericPrinter2<T extends Material> {
	private T  material;
	
	public void setMaterial( T  material) {
		this.material =  material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public void print() {
		System.out.println (  "3D print:" + material);
	}
	
	public static void main(String[] args) {
		/*GenericPrinter2<Powder> printer = new GenericPrinter<>();
		printer.setMaterial(new Powder());
		printer.print();
		 */
		
		/*GenericPrinter2<Plastic> printer = new GenericPrinter2<>();
		printer.setMaterial(new Plastic());
		printer.print();
		
		*/
		
	// 	 GenericPrinter2<Water> printer = new GenericPrinter2<>();
	//	printer.setMaterial(new Water());
	//	printer.print();
		
		
		// Bound mismatch: The type Water is not a valid substitute for the bounded parameter <T extends Material> of the type GenericPrinter2<T>
		 
		
	}
	
	
}
