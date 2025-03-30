public class CategoryList {
    private CategoryNode head;

    public void addCategory(String category) {
        CategoryNode newNode = new CategoryNode(category);
        if (head == null) head = newNode;
        else {
            CategoryNode temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }

    public CategoryNode getCategory(String category) {
        CategoryNode temp = head;
        while (temp != null) {
            if (temp.category.equalsIgnoreCase(category)) return temp;
            temp = temp.next;
        }
        return null;
    }

    public void displayCategories() {
        System.out.println("\nAvailable Categories:");
        CategoryNode temp = head;
        while (temp != null) {
            System.out.println("- " + temp.category);
            temp = temp.next;
        }
    }
}

