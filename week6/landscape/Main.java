package week6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Landscape landscape = new Landscape();

		    landscape.addTile(new Land());
		    landscape.addTile(new Water());
		    landscape.addTile(new Mountain());
		    landscape.addTile(new Forest());
		/*
		 * Landscape with more tiles 
		 * landscape.addTile(new Land());
		 * landscape.addTile(new Land()); landscape.addTile(new Mountain());
		 * landscape.addTile(new Mountain()); landscape.addTile(new Forest());
		 * landscape.addTile(new Forest()); landscape.addTile(new Forest());
		 * landscape.addTile(new Forest()); landscape.addTile(new Water());
		 * landscape.addTile(new Water()); landscape.addTile(new Mountain());
		 * landscape.addTile(new Mountain()); landscape.addTile(new Land());
		 * landscape.addTile(new Land()); landscape.addTile(new Land());
		 * landscape.addTile(new Forest()); landscape.addTile(new Forest());
		 * landscape.addTile(new Forest());
		 */
		    System.out.println(landscape.renderAll()); // --~~/\!!
	}

}
