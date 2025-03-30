import java.util.Scanner;

public class RestaurantFinder {
    public static void main(String[] args) {
        CategoryList categoryList = new CategoryList();
        Scanner scanner = new Scanner(System.in);

        // Adding categories
        categoryList.addCategory("Italian");
        categoryList.addCategory("Chinese");
        categoryList.addCategory("Halal");
        categoryList.addCategory("Vegan");
        // restaurant data
        Restaurant[] italianRestaurants = {
                new Restaurant("Nostra Casa", "Küçük Ayasofya Mh. Mustafa Paşa Sok. No:42, Sultanahmet", 4, true, false),
                new Restaurant("Fiore Pizzeria", "Miralay Sefikbey Sokak No:9/A Gümüşsuyu", 4, true, false),
                new Restaurant("Paps Italian", "Fransız Geçidi, Karaköy", 3, true, false),
                new Restaurant("Elio's", "Apartment or Condo, Istanbul", 4, true, false),
                new Restaurant("Eataly", "Zorlu Center, Levazım Mah. Koru Sok. No:2, Beşiktaş", 4, true, false),
                new Restaurant("Da Mario", "Nispetiye Cad. Dilhayat Sok. No:7 Etiler, Beşiktaş", 4, true, false),
                new Restaurant("La Scarpetta", "Etiler Mh. Dilhayat Sk. No:16, Beşiktaş", 4, true, false),
                new Restaurant("Paper Moon", "Kültür Mah. Nisbetiye Cad. No:54, Beşiktaş", 5, true, false),
                new Restaurant("Gina", "Esentepe Mah. Büyükdere Cad. No:185, Şişli", 4, true, false)
        };
        // adding data by category
        for (Restaurant r : italianRestaurants) {
            categoryList.getCategory("Italian").bst.insert(r);
        }

        // Adding sample restaurants
        categoryList.getCategory("Chinese").bst.insert(new Restaurant("Golden Dragon", "San Francisco", 4.7, true, false));
        categoryList.getCategory("Halal").bst.insert(new Restaurant("Halal Express", "Chicago", 4.3, false, true));
        categoryList.getCategory("Vegan").bst.insert(new Restaurant("VeganHouse","Istanbul",4.1,false,true));
        while (true) {
            System.out.println("\n--- Restaurant Finder ---");
            System.out.println("1. View all categories");
            System.out.println("2. Search for a restaurant");
            System.out.println("3. View all restaurants in a category");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                categoryList.displayCategories();
            } else if (choice == 2) {
                System.out.print("Enter category: ");
                String category = scanner.nextLine();
                CategoryNode selectedCategory = categoryList.getCategory(category);

                if (selectedCategory != null) {
                    System.out.print("Enter restaurant name: ");
                    String restaurantName = scanner.nextLine();
                    Restaurant foundRestaurant = selectedCategory.bst.search(restaurantName);
                    if (foundRestaurant != null) foundRestaurant.display();
                    else System.out.println("Restaurant not found.");
                } else {
                    System.out.println("Category not found.");
                }
            } else if (choice == 3) {
                System.out.print("Enter category: ");
                String category = scanner.nextLine();
                CategoryNode selectedCategory = categoryList.getCategory(category);

                if (selectedCategory != null) {
                    selectedCategory.bst.displayInOrder();
                } else {
                    System.out.println("Category not found.");
                }
            } else if (choice == 4) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }
}

