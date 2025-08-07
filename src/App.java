import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Main.java


        Scanner scanner = new Scanner(System.in);

        // Örnek kullanıcı oluştur
        User user1 = new User("Ayşegül", "Aktaş", "aysegul@gmail.com", "1234", "Yazılımcı", 23, new Date());
        Individual account1 = new Individual(user1);

        User user2 = new User("Ahmet", "Yılmaz", "ahmet@gmail.com", "4321", "Mühendis", 30, new Date());
        Enterprice account2 = new Enterprice(user2);

        // AccountManager oluştur ve kullanıcıları ekle
        AccountManager accountManager = new AccountManager();
        accountManager.addAccount(account1);
        accountManager.addAccount(account2);

        // Giriş ekranı
        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Şifre: ");
        String password = scanner.nextLine();

        Account loggedInAccount = accountManager.login(email, password);

        // Giriş başarılıysa bilgileri göster
        if (loggedInAccount != null) {
            loggedInAccount.showUserInfo();
        }
    }


    
}
