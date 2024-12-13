import java.util.*;

// Узагальнений базовий клас для залізничного транспорту
abstract class RailwayCar {
    private int passengerCount;
    private int baggageCount;

    public RailwayCar(int passengerCount, int baggageCount) {
        this.passengerCount = passengerCount;
        this.baggageCount = baggageCount;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public int getBaggageCount() {
        return baggageCount;
    }

    public abstract int getComfortLevel();
}
