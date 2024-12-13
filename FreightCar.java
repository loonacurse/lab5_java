import java.util.*;
// Клас для вантажних вагонів
class FreightCar extends RailwayCar {
    private int cargoCapacity;

    public FreightCar(int cargoCapacity) {
         // Викликаємо конструктор батьківського класу без пасажирів і багажу
         super(0, 0); // Вантажні вагони не мають пасажирів і багажу
         this.cargoCapacity = cargoCapacity;
     }
 
     public int getCargoCapacity() {
         return cargoCapacity;
     }
 
     @Override
     public int getComfortLevel() {
         return 0; // Вантажні вагони не мають рівня комфорту
     }

    @Override
    public String toString() {
        return "FreightCar{" +
               ", cargoCapacity=" + cargoCapacity +
               '}';
    }
}
