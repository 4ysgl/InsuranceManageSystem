public class Enterprice extends Account {
        public Enterprice(User user) {
        super(user);
        
    }


    @Override
    public void addInsurancePolicy(Insurance insurance) {
        double calculatedPrice = insurance.calculate() * 1.05; // Kurumsala %5 kar
        insurance.price = calculatedPrice;
        addInsurance(insurance);
    }
}
