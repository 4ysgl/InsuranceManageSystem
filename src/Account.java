
import java.util.ArrayList;

public abstract class Account implements Comparable<Account> {

    private AuthenticationStatus status = AuthenticationStatus.FAIL;
    private User user;
    private ArrayList<Insurance> insurances = new ArrayList<>();

    public Account(User user) {
        this.user = user;
    }

    public final void showUserInfo() {
        System.out.println("Ad: " + user.getName());
        System.out.println("Soyad: " + user.getSurname());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Meslek: " + user.getJob());
        System.out.println("Yaş: " + user.getAge());
        System.out.println("Son Giriş Tarihi: " + user.getLastLoginDate());

        System.out.println("Adresler:");
        for (Address address : user.getAddressList()) {
            System.out.println(address.getAddressInfo());
        }
    }

    public void login(String email, String password) throws InvalidAuthenticationException {
        if (this.user.getEmail().equals(email) && this.user.getPassword().equals(password)) {
            this.status = AuthenticationStatus.SUCCESS;
        } else {
            throw new InvalidAuthenticationException("Hatalı giriş!");
        }
    }

    public void addAddress(Address address) {
        user.addAddress(address);
    }

    public void removeAddress(Address address) {
        user.removeAddress(address);
    }

    public AuthenticationStatus getStatus() {
        return status;
    }

    public User getUser() {
        return user;
    }

    public ArrayList<Insurance> getInsurances() {
        return insurances;
    }

    public void addInsurance(Insurance insurance) {
        insurances.add(insurance);
    }

    public abstract void addInsurancePolicy(Insurance insurance);

    @Override
    public int compareTo(Account o) {
        return this.user.getEmail().compareTo(o.getUser().getEmail());
    }

    @Override
    public int hashCode() {
        return this.user.getEmail().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Account) {
            Account other = (Account) obj;
            return this.user.getEmail().equals(other.getUser().getEmail());
        }
        return false;
    }
}
