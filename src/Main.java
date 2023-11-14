import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User();

        User[] users = new User[]{};
        Scanner scanner = new Scanner(System.in);
        User currentUser = null;

        while (true) {
            System.out.println("1. Register\n2. Login\n3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 1:
                    User.user(scanner.next());

                    break;
            }
        }
    }
}
//                case 2:
//                    // Login logic
//                    // Check user credentials and set the currentUser
//                    break;
//                case 3:
//                    // Exit the program
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("Invalid choice.");
//                    break;
//            }
//
//            while (currentUser != null) {
//                System.out.println("0. Logout\n1. Add new Product\n2. Get all Products\n3. Get all Book\n4. Get all Electronics\n5. Exit");
//                int userChoice = scanner.nextInt();
//
//                switch (userChoice) {
//                    case 0:
//                        // Logout
//                        currentUser = null;
//                        break;
//                    case 1:
//                        // Add new product logic
//                        // Ask for details and add a new product to the user's list
//                        break;
//                    case 2:
//                        // Get all products logic
//                        // Display all products the user has
//                        break;
//                    case 3:
//                        // Get all books logic
//                        // Display all books the user has
//                        break;
//                    case 4:
//                        // Get all electronics logic
//                        // Display all electronics the user has
//                        break;
//                    case 5:
//                        // Exit
//                        System.exit(0);
//                        break;
//                    default:
//                        System.out.println("Invalid choice.");
//                        break;
//                }
//            }
//        }
                /////////////////////////////////////////////////////
//        User[] user = new User[]{};
//        Scanner scanner = new Scanner(System.in);
//        String currentUser = null;
//
//        while (true){
//            System.out.println("1. Каттоо. Register");
//            System.out.println("2. Кирүү Login");
//            System.out.println("3. Чыгyy. Exit");
//            int chois = scanner.nextInt();
//
//
//            scanner.nextLine();
//            switch (chois) {
//                case 1:
//                    System.out.println("firstName");
//                    String firstName = scanner.nextLine();
//                    System.out.println("last Name");
//                    String lastName = scanner.nextLine();
//                    System.out.println("Email");
//                    String email = scanner.nextLine();
//                      if (email.equals("@gmail.com")) {
//                        int password = scanner.nextInt();
//                        if (password >= 4) {
//                            System.out.println(password);
//                        } else if (password <= 4) {
//                            System.out.println(" passwor 4 simvoldon jogory bolysh kerek");
//
//                        }else if (email != "@gmail.com"){
//                            System.out.println("invalit email");
//                        }
//                    }
//            }
//    }
//}
//}

      // Product деген класс туз. Полелери (name, description, price, createdAt).
//Product классын мурастаган эки класс тузунуз.
//Electronics полелери(Product деген класс туз. Полелери (name, description, price, createdAt).
//Product классын мурастаган эки класс тузунуз.
//Electronics полелери(brand, color, isNew, memory).
//Book полелери(authorFullName).
//Андан сырткары дагы бир User деген класс туз.
//Полелери (firstName, lastName, email, password, products).
//2. Сайтты колдонуу үчүн, биринчи колдонуучу (User) катталуусу керек.
//Төмөндөгү командалар болсун:
//1. Каттоо. Register
//2. Кирүү Login
//3. Чыгyy. Exit
//3. Колдонуучу катталгандан кийин Login команда аркылу кирип,
//төмөнкү функцияларды аткара алсын:
//0. Logout Чыгуу
//1. Add new Product Жаңы продукт кошуңуз
//2. Get all Products Бардык продукталарды алыңыз
//3. Get all Book Бардык китепти алыңыз
//4. Get all Electronics Бардык электроникаларды алыңыз
//4. Exit команда программаны токтотсун.
//Deadline(Мөөнөтү): 10.11.2023 11:00).
//Book полелери(authorFullName).
//Андан сырткары дагы бир User деген класс туз.
//Полелери (firstName, lastName, email, password, products).
//2. Сайтты колдонуу үчүн, биринчи колдонуучу (User) катталуусу керек.
//Төмөндөгү командалар болсун:
//1. Каттоо. Register
//2. Кирүү Login
//3. Чыгyy. Exit
//3. Колдонуучу катталгандан кийин Login команда аркылу кирип,
//төмөнкү функцияларды аткара алсын:
//0. Logout Чыгуу
//1. Add new Product Жаңы продукт кошуңуз
//2. Get all Products Бардык продукталарды алыңыз
//3. Get all Book Бардык китепти алыңыз
//4. Get all Electronics Бардык электроникаларды алыңыз
//4. Exit команда программаны токтотсун.
//Deadline(Мөөнөтү): 10.11.2023 11:00
