import java.io.Serializable;

public class Restaurant implements Serializable {
    private String name;
    private String location;
    private double rating;
    private boolean servesAlcohol;
    private boolean isHalal;
    private double priceRange; // 1-5 scale where 1 is cheapest, 5 is most expensive
    private int popularity; // number of reviews/visits

    public Restaurant(String name, String location, double rating, boolean servesAlcohol, boolean isHalal, double priceRange, int popularity) {
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.servesAlcohol = servesAlcohol;
        this.isHalal = isHalal;
        this.priceRange = priceRange;
        this.popularity = popularity;
    }

    public String getName() { return name; }
    public double getRating() { return rating; }
    public double getPriceRange() { return priceRange; }
    public int getPopularity() { return popularity; }

    public void display() {
        System.out.println("\nRestaurant: " + name);
        System.out.println("Location: " + location);
        System.out.println("Rating: " + rating + "/5");
        System.out.println("Price Range: " + priceRange + "/5");
        System.out.println("Popularity: " + popularity);
        System.out.println("Alcohol: " + (servesAlcohol ? "Yes" : "No"));
        System.out.println("Halal: " + (isHalal ? "Yes" : "No"));
        System.out.println("-----------------------------");
    }
}

