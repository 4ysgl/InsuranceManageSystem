public class BusinessAddress implements Address {
private String address;



    public BusinessAddress(String address) {
    this.address = address;
}



    @Override
    public String getAddressInfo() {
    return "İş Adresi: "+address;
}



    public String getAddress() {
        return address;
    }



    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
