public class HomeAddress  implements Address{
private String address;

    public HomeAddress(String address) {
    this.address = address;
}

    @Override
    public String getAddressInfo() {
        return "Ev Adresi: "+address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
