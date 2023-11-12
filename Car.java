public class Car implements Vehicle {
    private String model;
    private int days;

    public Car(String model, int days) {
        this.model = model;
        this.days = days;
    }

    @Override
    public double calculateRentalCost() {
        return days*50;
    }

    @Override
    public void displayDetails() {
        System.out.printf("\nCar Model: %s\nDaily Rental Rate: %f\nRental cost: %f\n",this.model,50.0,this.calculateRentalCost());
    }
}
