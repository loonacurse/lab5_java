import java.util.*;
// Клас для спеціальних вагонів
class SpecialCar extends RailwayCar {
    private String specialPurpose;

    public SpecialCar(int passengerCount, int baggageCount, String specialPurpose) {
        super(passengerCount, baggageCount);
        this.specialPurpose = specialPurpose;
    }

    public String getSpecialPurpose() {
        return specialPurpose;
    }

    @Override
    public int getComfortLevel() {
        return 1; // Умовно високий рівень комфорту для спеціальних вагонів
    }

    @Override
    public String toString() {
        return "SpecialCar{" +
               "passengers=" + getPassengerCount() +
               ", baggage=" + getBaggageCount() +
               ", specialPurpose='" + specialPurpose + '\'' +
               '}';
    }
}
