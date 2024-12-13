import java.util.*;
// Клас Потяг
class Train {
    private List<RailwayCar> cars;

    public Train() {
        cars = new ArrayList<>();
    }

    public void addCar(RailwayCar car) {
        cars.add(car);
    }

    public List<RailwayCar> getCars() {
        return cars;
    }

    public int getTotalPassengers() {
        return cars.stream().mapToInt(RailwayCar::getPassengerCount).sum();
    }

    public int getTotalBaggage() {
        int totalBaggage = 0;
        for (RailwayCar car : cars) {
            // Для вантажних вагонів додаємо cargoCapacity як багаж
            if (car instanceof FreightCar) {
                totalBaggage += ((FreightCar) car).getCargoCapacity(); // Вантаж = багаж
            } else {
                totalBaggage += car.getBaggageCount(); // Для пасажирських вагонів
            }
        }
        return totalBaggage;
    }

    public List<RailwayCar> getComfortableCars() {
    List<RailwayCar> comfortableCars = new ArrayList<>();
    for (RailwayCar car : cars) {
        if (car.getComfortLevel() > 0) { // Виключаємо вантажні вагони
            comfortableCars.add(car);
        }
    }
    return comfortableCars;
}
    //пошук вагонів за діапазоном
    public List<RailwayCar> findCarsByPassengerRange(int minPassengers, int maxPassengers) {
        List<RailwayCar> result = new ArrayList<>();
        for (RailwayCar car : cars) {
            if (car.getPassengerCount() >= minPassengers && car.getPassengerCount() <= maxPassengers) {
                result.add(car);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Train{" +
               "cars=" + cars +
               '}';
    }
}
