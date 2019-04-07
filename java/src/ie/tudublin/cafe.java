package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class cafe extends PApplet{

    // creates ArrayLists of type Product
    ArrayList<Product> products = new ArrayList<Product>();
    ArrayList<Product> bill = new ArrayList<Product>();

    // Processing variables
    private float border = 60;

    // setting of the Processing window
    public void settings(){
        size(800, 600);
    }

    // will occur on load
    public void setup(){
        loadData();
        printProducts();
    }

    // will be called 60 per second 
    public void draw(){
        displayProducts();
        displayBill();
    }

    // load data into memory
    public void loadData(){
        // loads the CSV file into table
        Table table = loadTable("cafe.csv", "header");

        // loop through each row in loaded table
        for (TableRow row : table.rows()) {

            // create new Product object of each row
            Product product = new Product(row);

            // add object to product ArrayList
            products.add(product);

        }

    }

    // iterates through and prints the object in the Array List
    public void printProducts(){
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void displayProducts(){

        // center line
        line(width / 2, border , width / 2, height - border);
            
        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            float price = p.getPrice();
            
            // box
            fill(255);
            rect(border, map(i, 0, products.size(), border, height - border), (width / 3), 60);

            // text in box
            textAlign(LEFT, CENTER);
            fill(0);
            text(p.getName(), border + 10, map(i, 0, products.size(), border, height - border) + 30);

            // text in box
            textAlign(RIGHT, CENTER);
            fill(0);
            text(nfc(price, 2), (width / 3) + 50, map(i, 0, products.size(), border, height - border) + 30);

        }

    }

    public void displayBill(){
        fill(255);
        rect(width / 2 + border, border, (width / 2) - border * 2, height - border * 2);

        fill(0);
        text("Your Bill", width * (3/4), border + 10);

    }

}

