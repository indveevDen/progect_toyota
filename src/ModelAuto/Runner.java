package ModelAuto;

public class Runner {
    public static void main(String[] args) {
        CarCamry carCamry = new CarCamry();
        CarDyna carDyna = new CarDyna();
        CarHiance carHiance = new CarHiance();
        CarSolara carSolara = new CarSolara();
        Car[] cars = {carCamry, carDyna, carSolara, carHiance};

        for (Car car : cars) {
            car.color();
            car.inMotion();
            car.maximumSpeed();
            car.typeOfGearbox();
        }


    }
}
