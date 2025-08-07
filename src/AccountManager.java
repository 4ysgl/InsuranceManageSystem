// manager/AccountManager.java


import java.util.TreeSet;

public class AccountManager {
    private TreeSet<Account> accountSet = new TreeSet<>();

    public void addAccount(Account account) {
        accountSet.add(account);
    }

    public Account login(String email, String password) {
        for (Account acc : accountSet) {
            try {
                acc.login(email, password);
                System.out.println("Giriş başarılı!");
                return acc;
            } catch (InvalidAuthenticationException e) {
                // Bu kullanıcı için başarısız, diğer kullanıcıları denemeye devam et
            }
        }
        System.out.println("Giriş başarısız. Lütfen bilgilerinizi kontrol edin.");
        return null;
    }
}
