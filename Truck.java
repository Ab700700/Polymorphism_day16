public class Truck implements Vehicle {
    private String type;
    private int weeks;

    public Truck(String type, int weeks) {
        this.type = type;
        this.weeks = weeks;
    }

    @Override
    public double calculateRentalCost() {
        return weeks*500;
    }

    @Override
    public void displayDetails() {
        System.out.printf("\nTruck Type: %s\nWeekly Rental Rate: %f\nRental cost: %f\n",this.type,500.0,this.calculateRentalCost());
    }
}
