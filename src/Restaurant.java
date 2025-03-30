import java.io.Serializable;

public class Restaurant implements Serializable {
    private String name;
    private String location;
    private double rating;
    private boolean servesAlcohol;
    private boolean isHalal;

    public Restaurant(String name, String location, double rating, boolean servesAlcohol, boolean isHalal) {
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.servesAlcohol = servesAlcohol;
        this.isHalal = isHalal;
    }

    public String getName() { return name; }

    public void display() {
        System.out.println("\nRestaurant: " + name);
        System.out.println("Location: " + location);
        System.out.println("Rating: " + rating + "/5");
        System.out.println("Alcohol: " + (servesAlcohol ? "Yes" : "No"));
        System.out.println("Halal: " + (isHalal ? "Yes" : "No"));
        System.out.println("-----------------------------");
    }
}

