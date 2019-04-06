package ie.tudublin;

public class Main{

    // method to run cafe.java
    public void Cafe()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new cafe());
		
	}
    
    public static void main(String[] args) {
        Main main = new Main();
        main.Cafe();     

    }

}