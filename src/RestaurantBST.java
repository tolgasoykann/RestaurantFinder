import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class RestaurantBST {
    private BSTNode root;
    private List<Restaurant> allRestaurants;

    public RestaurantBST() {
        allRestaurants = new ArrayList<>();
    }

    public void insert(Restaurant restaurant) {
        root = insertRec(root, restaurant);
        allRestaurants.add(restaurant);
    }

    private BSTNode insertRec(BSTNode root, Restaurant restaurant) {
        if (root == null) return new BSTNode(restaurant);
        if (restaurant.getName().compareToIgnoreCase(root.restaurant.getName()) < 0)
            root.left = insertRec(root.left, restaurant);
        else
            root.right = insertRec(root.right, restaurant);
        return root;
    }

    public Restaurant search(String name) {
        BSTNode result = searchRec(root, name);
        return result != null ? result.restaurant : null;
    }

    private BSTNode searchRec(BSTNode root, String name) {
        if (root == null || root.restaurant.getName().equalsIgnoreCase(name)) return root;
        return name.compareToIgnoreCase(root.restaurant.getName()) < 0 ? searchRec(root.left, name) : searchRec(root.right, name);
    }

    public void displayInOrder() { inOrderRec(root); }

    private void inOrderRec(BSTNode root) {
        if (root != null) {
            inOrderRec(root.left);
            root.restaurant.display();
            inOrderRec(root.right);
        }
    }

    public void sortByRating() {
        Collections.sort(allRestaurants, Comparator.comparingDouble(Restaurant::getRating).reversed());
        displaySortedList();
    }

    public void sortByPrice() {
        Collections.sort(allRestaurants, Comparator.comparingDouble(Restaurant::getPriceRange));
        displaySortedList();
    }

    public void sortByPopularity() {
        Collections.sort(allRestaurants, Comparator.comparingInt(Restaurant::getPopularity).reversed());
        displaySortedList();
    }

    private void displaySortedList() {
        for (Restaurant restaurant : allRestaurants) {
            restaurant.display();
        }
    }

    public List<Restaurant> filterByRating(double minRating) {
        List<Restaurant> filtered = new ArrayList<>();
        for (Restaurant restaurant : allRestaurants) {
            if (restaurant.getRating() >= minRating) {
                filtered.add(restaurant);
            }
        }
        return filtered;
    }

    public List<Restaurant> filterByPrice(double maxPrice) {
        List<Restaurant> filtered = new ArrayList<>();
        for (Restaurant restaurant : allRestaurants) {
            if (restaurant.getPriceRange() <= maxPrice) {
                filtered.add(restaurant);
            }
        }
        return filtered;
    }
}
