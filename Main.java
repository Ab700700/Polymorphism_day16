import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> rentedVehicles = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        int num;
        do{
            System.out.print("\nVehicle Rental System\n1. Rent a Car\n2. Rent a Bike\n3. Rent a Truck\n4.View Rented Vehicles\n5. Exit");
            System.out.print("\nEnter your choice: ");
            num = scan.nextInt();
            if(num == 1){
                System.out.print("Enter Car Model: ");
                scan.nextLine();
                String model = scan.nextLine();
                System.out.print("Enter Rental Days: ");
                int days = scan.nextInt();
                System.out.println();
                Vehicle car = new Car(model,days);
                rentedVehicles.add(car);
                System.out.print("Rental Details: ");
                car.displayDetails();
            }else if(num == 2){
                System.out.print("Enter Bike Brand: ");
                scan.nextLine();
                String brand = scan.nextLine();
                System.out.print("Enter Rental Hours: ");
                int hours = scan.nextInt();
                System.out.println();
                Vehicle Bike = new Bike(brand,hours);
                rentedVehicles.add(Bike);
                System.out.print("Rental Details: ");
                Bike.displayDetails();
            }
            else if(num == 3){
                System.out.print("Enter Truck Type: ");
                scan.nextLine();
                String type = scan.nextLine();
                System.out.print("Enter Rental Weeks: ");
                int weeks = scan.nextInt();
                System.out.println();
                Vehicle truck = new Truck(type,weeks);
                rentedVehicles.add(truck);
                System.out.print("\nRental Details: ");
                truck.displayDetails();
            }
            else if(num == 4){
                System.out.print("\nRented Vehicles:");
                for(Vehicle v : rentedVehicles){
                    v.displayDetails();
                }
            }else if(num==5){
                break;
            }else System.out.println("choose from the menu.");
        }while(num!=5);

        System.out.println("Thank you for using the Vehicle Rental System!");


    }
}
