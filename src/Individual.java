public class Individual extends Account {

    public Individual(User user) {
        super(user);
        
    }
    public void addInsurancePolicy(Insurance insurance)
    {
    
    double calculatedPrice= insurance.calculate()*1.1;
    insurance.price=calculatedPrice;
    addInsurance(insurance);
    }
}
