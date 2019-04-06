package ie.tudublin;

import processing.data.TableRow;

public class Product{

    private String name;
    private Float price;

    // Constructor class
    public Product(TableRow row){
        // gets values from TableRow Passed in
        name = row.getString("Name");
        price = row.getFloat("Price");

    }

    public Product(){
        
    }

    // toString method will print if a Sysout is called on the object
    public String toString(){
        return name + "\t" + price;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public Float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Float price) {
        this.price = price;
    }

}