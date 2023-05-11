public class Bike {
    private String make;
    private String model;
    private int year;
    private double price;
    
    public Bike(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    
    public void display() {
        System.out.println(make + " " + model + " (" + year + "): $" + price);
    }
    
    public String getMake() {
        return make;
    }
    
    public String getModel() {
        return model;
    }
}

public class Showroom {
    private String name;
    private List<Bike> inventory;
    
    public Showroom(String name) {
        this.name = name;
        this.inventory = new ArrayList<Bike>();
    }
    
    public void addBike(Bike bike) {
        inventory.add(bike);
    }
    
    public void displayInventory() {
        System.out.println(name + " Inventory:");
        for (Bike bike : inventory) {
            bike.display();
        }
    }
    
    public void searchBike(String make, String model) {
        for (Bike bike : inventory) {
            if (bike.getMake().equals(make) && bike.getModel().equals(model)) {
                bike.display();
                return;
            }
        }
        System.out.println("No " + make + " " + model + " found in " + name + " Inventory.");
    }
}
