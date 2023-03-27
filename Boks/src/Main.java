
public class Main {

	public static void main(String[] args) {
		Fighter baris = new Fighter("Baris", 25,100,80,25);
		Fighter buse = new Fighter("Buse",25,100,65,25);
		Ring r =new Ring(baris, buse, 65, 80);
		r.Run();
	}

}
