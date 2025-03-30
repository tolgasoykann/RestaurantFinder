public class CategoryNode {
    String category;
    RestaurantBST bst;
    CategoryNode next;

    public CategoryNode(String category) {
        this.category = category;
        this.bst = new RestaurantBST();
        this.next = null;
    }
}
