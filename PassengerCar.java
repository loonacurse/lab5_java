import java.util.*;
// Клас для пасажирських вагонів
class PassengerCar extends RailwayCar {
    private int comfortLevel; // 1 = найвищий комфорт, 3 = найнижчий комфорт

    public PassengerCar(int passengerCount, int baggageCount, int comfortLevel) {
        super(passengerCount, baggageCount);
        this.comfortLevel = comfortLevel;
    }

    @Override
    public int getComfortLevel() {
        return comfortLevel;
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
               "passengers=" + getPassengerCount() +
               ", baggage=" + getBaggageCount() +
               ", comfortLevel=" + comfortLevel +
               '}';
    }
}