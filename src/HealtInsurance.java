import java.util.Date;

public class HealtInsurance extends Insurance {

    public HealtInsurance(String name, double price, Date startDate, Date endDate) {
        super(name, price, startDate, endDate);
       
    }

    @Override
    public double calculate() {
 return this.price*1.2; 



}
    
}
