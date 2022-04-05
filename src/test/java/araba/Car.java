package araba;

public class Car {
private String make;
private String model;
private int year;
private String plant_number;

    public Car(String make, String model, int year, String plant_number) {

            this.year= year;
            this.make=make;
            this.model=model;
            this.plant_number=plant_number;
        }

    public Car() {

    }


    @Override
    public String toString() { return year + " " + make + " " + model +  " (" + plant_number + ")" ;
    }

}