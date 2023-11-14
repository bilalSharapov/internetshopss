import java.util.Scanner;

public class User {
private String  firstName;
private String lastName;
private  String email;
private  int  password ;
private  String products;

    public User(String firstName, String lastName, String email, int password, String products) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.products = products;
    }

    public User() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }







//        User user1 = new User();
//        System.out.println("firstName");
//        user1.setFirstName(scanner.nextLine());
//        System.out.println("lastName");
//        user1.setLastName(scanner.nextLine());
//        System.out.println("email");
//        user1.setEmail(scanner.nextLine());
//        System.out.println("password");
//        user1.setPassword(scanner.nextInt());
//
//      if (!user1.getEmail().contains("@gmail.com")&& user1.getPassword())
//        User[] users = new User[]{user1};
//        System.out.println(users);
//    }
    //    if (email != null && email.contains("@gmail.com") && password != null && password.length() >= 5) {
    //            System.out.println("Сіз сәтті тіркелдіңіз!");
    //        } else {
    //            System.out.println("Жарамсыз email немесе кілтсөз!");
    //        }

// / Пароль 5 символдан аз болса және email жоқ болса
//        if (password.length() < 5 && !email.contains("gmail.com")) {
//            System.out.println("Invalid email");
//        } else {
//            // Басқа логикалық операциялар жасау мүмкін
//            System.out.println("Регистрация сәтті аяқталды!");
//        }


    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", products='" + products + '\'' +
                '}';
    }
}
// firstName, lastName, email, password, products