public class Bike implements Vehicle{
    private String brand;
    private int hours;

    public Bike(String brand, int hours) {
        this.brand = brand;
        this.hours = hours;
    }

    @Override
    public double calculateRentalCost() {
        return hours*10;
    }

    @Override
    public void displayDetails() {
        System.out.printf("\nBike Brand: %s\nHours Rental Rate: %f\nRental cost: %f\n",this.brand,10.0,this.calculateRentalCost());
    }
}
