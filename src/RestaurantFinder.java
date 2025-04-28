import java.util.Scanner;
import java.util.List;

public class RestaurantFinder {
    public static void main(String[] args) {
        CategoryLinkedList categoryList = new CategoryLinkedList();
        Scanner scanner = new Scanner(System.in);

        // Adding categories using linked list
        categoryList.addCategory("Italian");
        categoryList.addCategory("Chinese");
        categoryList.addCategory("Halal");
        categoryList.addCategory("Vegan");
        categoryList.addCategory("Turkish");
        categoryList.addCategory("Seafood");
        categoryList.addCategory("International");

        // Italian restaurant data
        Restaurant[] italianRestaurants = {
                new Restaurant("Nostra Casa", "Küçük Ayasofya Mh. Mustafa Paşa Sok. No:42, Sultanahmet", 4.2, true, false, 3.5, 150),
                new Restaurant("Fiore Pizzeria", "Miralay Sefikbey Sokak No:9/A Gümüşsuyu", 4.1, true, false, 3.0, 200),
                new Restaurant("Paps Italian", "Fransız Geçidi No:12, Karaköy", 3.9, true, false, 2.5, 100),
                new Restaurant("Elio's", "Teşvikiye Cad. No:123, Nişantaşı", 4.3, true, false, 4.0, 180),
                new Restaurant("Eataly", "Zorlu Center, Levazım Mah. Koru Sok. No:2, Beşiktaş", 4.4, true, false, 4.5, 300),
                new Restaurant("Da Mario", "Nispetiye Cad. Dilhayat Sok. No:7, Etiler", 4.2, true, false, 4.0, 250),
                new Restaurant("La Scarpetta", "Etiler Mh. Dilhayat Sk. No:16, Beşiktaş", 4.3, true, false, 4.5, 220),
                new Restaurant("Paper Moon", "Kültür Mah. Nisbetiye Cad. No:54, Beşiktaş", 4.5, true, false, 5.0, 400),
                new Restaurant("Gina", "Esentepe Mah. Büyükdere Cad. No:185, Şişli", 4.1, true, false, 4.0, 280)
        };

        // Turkish restaurant data
        Restaurant[] turkishRestaurants = {
                new Restaurant("Karaköy Lokantası", "Kemankeş Karamustafa Paşa Mah. Kemankeş Cad. No:37/A, Karaköy", 4.5, true, true, 3.0, 350),
                new Restaurant("Hafız Mustafa", "Hobyar Mah. Hamidiye Cad. No:84, Eminönü", 4.3, false, true, 2.5, 280),
                new Restaurant("Çiya Sofrası", "Caferağa Mah. Güneşli Bahçe Sok. No:43, Kadıköy", 4.7, false, true, 2.0, 420),
                new Restaurant("Sultanahmet Köftecisi", "Divan Yolu Cad. No:12, Sultanahmet", 4.2, false, true, 2.0, 380),
                new Restaurant("Hamdi Restaurant", "Tahmis Cad. Kalçın Sok. No:17, Eminönü", 4.6, false, true, 3.5, 400),
                new Restaurant("Borsa Restaurant", "Abdi İpekçi Cad. No:22, Nişantaşı", 4.4, true, true, 4.0, 320),
                new Restaurant("Hünkar", "Mim Kemal Öke Cad. No:21, Nişantaşı", 4.5, true, true, 4.0, 280),
                new Restaurant("Köşebaşı", "Nispetiye Cad. No:1, Etiler", 4.3, true, true, 3.5, 350),
                new Restaurant("Lokanta 1741", "Gümüşsuyu Mah. İnönü Cad. No:28, Taksim", 4.4, true, true, 3.5, 300)
        };

        // Seafood restaurant data
        Restaurant[] seafoodRestaurants = {
                new Restaurant("Balıkçı Sabahattin", "Seyit Hasan Koyu Sok. No:1, Sultanahmet", 4.6, true, false, 4.0, 380),
                new Restaurant("Kıyı", "Kıyı Cad. No:102, Tarabya", 4.5, true, false, 4.5, 320),
                new Restaurant("Borsa Balıkçısı", "Abdi İpekçi Cad. No:22, Nişantaşı", 4.4, true, false, 4.0, 280),
                new Restaurant("Lacivert", "Kuruçeşme Cad. No:57, Kuruçeşme", 4.7, true, false, 5.0, 400),
                new Restaurant("Sütiş", "Kuruçeşme Cad. No:7, Kuruçeşme", 4.3, true, false, 4.0, 250),
                new Restaurant("Beyti", "Orman Sok. No:8, Florya", 4.5, true, false, 4.0, 350),
                new Restaurant("Giritli", "Keresteci Hakkı Sok. No:8, Cihangir", 4.4, true, false, 3.5, 300),
                new Restaurant("Balıkçı Kahraman", "Kılıçali Paşa Mah. Kılıçali Paşa Cad. No:5, Beşiktaş", 4.3, true, false, 3.0, 280),
                new Restaurant("Ziya", "Kuruçeşme Cad. No:51, Kuruçeşme", 4.6, true, false, 4.5, 320)
        };

        // International restaurant data
        Restaurant[] internationalRestaurants = {
                new Restaurant("Mikla", "The Marmara Pera, Meşrutiyet Cad. No:15, Beyoğlu", 4.8, true, false, 5.0, 450),
                new Restaurant("Neolokal", "Mim Kemal Öke Cad. No:21, Nişantaşı", 4.7, true, false, 4.5, 380),
                new Restaurant("TURK Fatih Tutak", "Hacıahmet Mah. Kuloğlu Cad. No:17, Şişli", 4.9, true, false, 5.0, 500),
                new Restaurant("Nicole", "Abdi İpekçi Cad. No:18, Nişantaşı", 4.6, true, false, 4.5, 350),
                new Restaurant("Mürver", "Hacıahmet Mah. Kuloğlu Cad. No:17, Şişli", 4.7, true, false, 4.5, 400),
                new Restaurant("Aheste", "Kuloğlu Mah. Turnacıbaşı Sok. No:30, Beyoğlu", 4.5, true, false, 4.0, 320),
                new Restaurant("Mono", "Kılıçali Paşa Mah. Kılıçali Paşa Cad. No:18, Beşiktaş", 4.6, true, false, 4.0, 280),
                new Restaurant("Alexandra", "Kuruçeşme Cad. No:51, Kuruçeşme", 4.7, true, false, 4.5, 350),
                new Restaurant("Lucca", "Bebek Mah. Cevdet Paşa Cad. No:51, Bebek", 4.5, true, false, 4.0, 300)
        };

        // Chinese restaurant data
        Restaurant[] chineseRestaurants = {
                new Restaurant("China Town", "Nispetiye Cad. No:1, Etiler", 4.2, true, false, 3.5, 180),
                new Restaurant("Dragon", "Abdi İpekçi Cad. No:18, Nişantaşı", 4.3, true, false, 4.0, 200),
                new Restaurant("Wok", "Büyükdere Cad. No:185, Şişli", 4.1, true, false, 3.0, 160),
                new Restaurant("Shanghai", "Kuruçeşme Cad. No:51, Kuruçeşme", 4.4, true, false, 4.0, 220),
                new Restaurant("Peking", "Nispetiye Cad. No:1, Etiler", 4.2, true, false, 3.5, 190),
                new Restaurant("Hong Kong", "Bağdat Cad. No:420, Kadıköy", 4.0, true, false, 3.0, 170),
                new Restaurant("Beijing", "Abdi İpekçi Cad. No:18, Nişantaşı", 4.3, true, false, 4.0, 210),
                new Restaurant("Taiwan", "Büyükdere Cad. No:185, Şişli", 4.1, true, false, 3.0, 180),
                new Restaurant("Panda", "Bağdat Cad. No:420, Kadıköy", 4.0, true, false, 3.0, 150)
        };

        // Halal restaurant data
        Restaurant[] halalRestaurants = {
                new Restaurant("Sultanahmet Köftecisi", "Divan Yolu Cad. No:12, Sultanahmet", 4.2, false, true, 2.0, 380),
                new Restaurant("Hamdi Restaurant", "Tahmis Cad. Kalçın Sok. No:17, Eminönü", 4.6, false, true, 3.5, 400),
                new Restaurant("Borsa Restaurant", "Abdi İpekçi Cad. No:22, Nişantaşı", 4.4, false, true, 4.0, 320),
                new Restaurant("Hünkar", "Mim Kemal Öke Cad. No:21, Nişantaşı", 4.5, false, true, 4.0, 280),
                new Restaurant("Köşebaşı", "Nispetiye Cad. No:1, Etiler", 4.3, false, true, 3.5, 350),
                new Restaurant("Lokanta 1741", "Gümüşsuyu Mah. İnönü Cad. No:28, Taksim", 4.4, false, true, 3.5, 300),
                new Restaurant("Karaköy Lokantası", "Kemankeş Karamustafa Paşa Mah. Kemankeş Cad. No:37/A, Karaköy", 4.5, false, true, 3.0, 350),
                new Restaurant("Hafız Mustafa", "Hobyar Mah. Hamidiye Cad. No:84, Eminönü", 4.3, false, true, 2.5, 280),
                new Restaurant("Çiya Sofrası", "Caferağa Mah. Güneşli Bahçe Sok. No:43, Kadıköy", 4.7, false, true, 2.0, 420)
        };

        // Vegan restaurant data
        Restaurant[] veganRestaurants = {
                new Restaurant("Veganarsist", "Caferağa Mah. Moda Cad. No:60/A, Kadıköy", 4.5, false, true, 2.5, 280),
                new Restaurant("Zencefil", "Kuloğlu Mah. Kuloğlu Cad. No:3, Cihangir", 4.4, false, true, 3.0, 320),
                new Restaurant("Bi Nevi Deli", "Caferağa Mah. Moda Cad. No:62, Kadıköy", 4.3, false, true, 2.5, 250),
                new Restaurant("Community Kitchen", "Caferağa Mah. Moda Cad. No:64, Kadıköy", 4.2, false, true, 2.0, 200),
                new Restaurant("Vegan Istanbul", "Abdi İpekçi Cad. No:18, Nişantaşı", 4.3, false, true, 3.0, 180),
                new Restaurant("Vegan Dükkan", "Caferağa Mah. Moda Cad. No:66, Kadıköy", 4.1, false, true, 2.5, 150),
                new Restaurant("Vegan Masa", "Caferağa Mah. Moda Cad. No:68, Kadıköy", 4.2, false, true, 2.5, 170),
                new Restaurant("Vegan House", "Caferağa Mah. Moda Cad. No:70, Kadıköy", 4.0, false, true, 2.0, 140),
                new Restaurant("Vegan Life", "Büyükdere Cad. No:185, Şişli", 4.1, false, true, 2.5, 160)
        };

        // adding data by category using linked list
        for (Restaurant r : italianRestaurants) {
            categoryList.getCategory("Italian").bst.insert(r);
        }

        for (Restaurant r : turkishRestaurants) {
            categoryList.getCategory("Turkish").bst.insert(r);
        }

        for (Restaurant r : seafoodRestaurants) {
            categoryList.getCategory("Seafood").bst.insert(r);
        }

        for (Restaurant r : internationalRestaurants) {
            categoryList.getCategory("International").bst.insert(r);
        }

        for (Restaurant r : chineseRestaurants) {
            categoryList.getCategory("Chinese").bst.insert(r);
        }

        for (Restaurant r : halalRestaurants) {
            categoryList.getCategory("Halal").bst.insert(r);
        }

        for (Restaurant r : veganRestaurants) {
            categoryList.getCategory("Vegan").bst.insert(r);
        }

        // Adding sample restaurants for other categories
        categoryList.getCategory("Chinese").bst.insert(new Restaurant("Golden Dragon", "San Francisco", 4.7, true, false, 3.0, 180));
        categoryList.getCategory("Halal").bst.insert(new Restaurant("Halal Express", "Chicago", 4.3, false, true, 2.0, 120));
        categoryList.getCategory("Vegan").bst.insert(new Restaurant("VeganHouse", "Istanbul", 4.1, false, true, 2.5, 90));

        while (true) {
            System.out.println("\n--- Restaurant Finder ---");
            System.out.println("1. View all categories");
            System.out.println("2. Search for a restaurant");
            System.out.println("3. View all restaurants in a category");
            System.out.println("4. Sort restaurants");
            System.out.println("5. Filter restaurants");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    categoryList.displayCategories();
                    break;
                case 2:
                    System.out.print("Enter category: ");
                    String category = scanner.nextLine();
                    CategoryLinkedList.CategoryNode selectedCategory = categoryList.getCategory(category);

                    if (selectedCategory != null) {
                        System.out.print("Enter restaurant name: ");
                        String restaurantName = scanner.nextLine();
                        Restaurant foundRestaurant = selectedCategory.bst.search(restaurantName);
                        if (foundRestaurant != null) foundRestaurant.display();
                        else System.out.println("Restaurant not found.");
                    } else {
                        System.out.println("Category not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter category: ");
                    category = scanner.nextLine();
                    selectedCategory = categoryList.getCategory(category);

                    if (selectedCategory != null) {
                        selectedCategory.bst.displayInOrder();
                    } else {
                        System.out.println("Category not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter category: ");
                    category = scanner.nextLine();
                    selectedCategory = categoryList.getCategory(category);

                    if (selectedCategory != null) {
                        System.out.println("\nSort by:");
                        System.out.println("1. Rating (highest first)");
                        System.out.println("2. Price (cheapest first)");
                        System.out.println("3. Popularity (most popular first)");
                        System.out.print("Enter your choice: ");
                        int sortChoice = scanner.nextInt();
                        scanner.nextLine();

                        switch (sortChoice) {
                            case 1:
                                selectedCategory.bst.sortByRating();
                                break;
                            case 2:
                                selectedCategory.bst.sortByPrice();
                                break;
                            case 3:
                                selectedCategory.bst.sortByPopularity();
                                break;
                            default:
                                System.out.println("Invalid choice.");
                        }
                    } else {
                        System.out.println("Category not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter category: ");
                    category = scanner.nextLine();
                    selectedCategory = categoryList.getCategory(category);

                    if (selectedCategory != null) {
                        System.out.println("\nFilter by:");
                        System.out.println("1. Minimum Rating");
                        System.out.println("2. Maximum Price");
                        System.out.print("Enter your choice: ");
                        int filterChoice = scanner.nextInt();
                        scanner.nextLine();

                        switch (filterChoice) {
                            case 1:
                                System.out.print("Enter minimum rating (0-5): ");
                                double minRating = scanner.nextDouble();
                                scanner.nextLine();
                                List<Restaurant> ratingFiltered = selectedCategory.bst.filterByRating(minRating);
                                for (Restaurant r : ratingFiltered) {
                                    r.display();
                                }
                                break;
                            case 2:
                                System.out.print("Enter maximum price range (1-5): ");
                                double maxPrice = scanner.nextDouble();
                                scanner.nextLine();
                                List<Restaurant> priceFiltered = selectedCategory.bst.filterByPrice(maxPrice);
                                for (Restaurant r : priceFiltered) {
                                    r.display();
                                }
                                break;
                            default:
                                System.out.println("Invalid choice.");
                        }
                    } else {
                        System.out.println("Category not found.");
                    }
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

