package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class cafe extends PApplet{

    // creates ArrayLists of type Product
    ArrayList<Product> products = new ArrayList<Product>();
    ArrayList<Product> bill = new ArrayList<Product>();

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

}

