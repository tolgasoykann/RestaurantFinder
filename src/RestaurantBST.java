import java.util.ArrayList;
import java.util.List;

public class RestaurantBST {
    private BSTNode root;

    public void insert(Restaurant restaurant) {
        root = insertRec(root, restaurant);
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
}
