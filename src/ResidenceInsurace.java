import java.util.Date;

public class ResidenceInsurace extends Insurance{

    public ResidenceInsurace(String name, double price, Date startDate, Date endDate) {
        super(name, price, startDate, endDate);
    }

    @Override
    public double calculate() {
  return this.price*1.15;

    
}
}