public class CategoryLinkedList {
    private CategoryNode head;
    private int size;

    public CategoryLinkedList() {
        head = null;
        size = 0;
    }

    // Node class for the linked list
    public static class CategoryNode {
        String categoryName;
        RestaurantBST bst;
        CategoryNode next;

        public CategoryNode(String categoryName) {
            this.categoryName = categoryName;
            this.bst = new RestaurantBST();
            this.next = null;
        }
    }

    // Add a new category
    public void addCategory(String categoryName) {
        CategoryNode newNode = new CategoryNode(categoryName);
        if (head == null) {
            head = newNode;
        } else {
            CategoryNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Get a category by name
    public CategoryNode getCategory(String categoryName) {
        CategoryNode current = head;
        while (current != null) {
            if (current.categoryName.equalsIgnoreCase(categoryName)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Remove a category
    public boolean removeCategory(String categoryName) {
        if (head == null) return false;

        if (head.categoryName.equalsIgnoreCase(categoryName)) {
            head = head.next;
            size--;
            return true;
        }

        CategoryNode current = head;
        while (current.next != null) {
            if (current.next.categoryName.equalsIgnoreCase(categoryName)) {
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Display all categories
    public void displayCategories() {
        CategoryNode current = head;
        System.out.println("\nAvailable Categories:");
        while (current != null) {
            System.out.println("- " + current.categoryName);
            current = current.next;
        }
    }

    // Get the size of the list
    public int getSize() {
        return size;
    }

    // Check if a category exists
    public boolean contains(String categoryName) {
        return getCategory(categoryName) != null;
    }
}
