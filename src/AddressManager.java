public class AddressManager {
    public static void addAddress(User user, Address address) 
    {
        System.out.println("eklenıooor");
        user.addAddress(address);
        System.out.println("eklendiii");
    }


     public static void removeAddress(User user, Address address) 
    {   System.out.println("siliniyorrrr");
        user.removeAddress(address);
        System.out.println("silindi");

      
    }
}
