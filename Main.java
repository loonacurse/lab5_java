import java.util.*;
//var 20->7
// Головний клас
public class Main {
    public static void main(String[] args) {
        try {
            Train train = new Train();
    
            // Додаємо вагони до потяга
            train.addCar(new PassengerCar(50, 30, 2));
            train.addCar(new FreightCar(100));
            train.addCar(new SpecialCar(10, 10, "Медичний"));
            train.addCar(new PassengerCar(40, 25, 1));
    
            // Вивід усіх вагонів (включно з вантажними)
            System.out.println("\n=== Всі вагони у потязі ===");
            for (RailwayCar car : train.getCars()) {
                printCarDetails(car);
            }


            // Загальна кількість пасажирів та багажу
            System.out.println("=== Загальна інформація про потяг ===");
            System.out.println("Загальна кількість пасажирів: " + train.getTotalPassengers());
            System.out.println("Загальна кількість багажу: " + train.getTotalBaggage());
    
            // Сортування вагонів за рівнем комфорту (без вантажних вагонів)
            List<RailwayCar> comfortableCars = train.getComfortableCars();
            comfortableCars.sort(Comparator.comparingInt(RailwayCar::getComfortLevel));
            System.out.println("\n=== Вагони після сортування за рівнем комфорту ===");
            for (RailwayCar car : comfortableCars) {
                printCarDetails(car);
            }

        int minPassengers = 30;
        int maxPassengers = 50;
        System.out.println("\n=== Вагони з кількістю пасажирів у діапазоні [" + minPassengers + ", " + maxPassengers + "] ===");
        
        List<RailwayCar> foundCars = train.findCarsByPassengerRange(minPassengers, maxPassengers);
        
        // Викликаємо метод для виведення знайдених вагонів
        if (foundCars.isEmpty()) {
            System.out.println("Не знайдено вагонів, що відповідають діапазону пасажирів.");
        } else {
            // Виведення знайдених вагонів
            for (RailwayCar car : foundCars) {
                printCarDetails(car);
            }
        }
    
        } catch (Exception e) {
            System.err.println("Виникла помилка: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    // Метод для форматованого виведення деталей вагона
    public static void printCarDetails(RailwayCar car) {
        if (car instanceof PassengerCar) {
            PassengerCar pc = (PassengerCar) car;
            System.out.println("PassengerCar");
            System.out.println("Passengers: " + pc.getPassengerCount());
            System.out.println("Baggage: " + pc.getBaggageCount());
            System.out.println("Comfort Level: " + pc.getComfortLevel());
        } else if (car instanceof SpecialCar) {
            SpecialCar sc = (SpecialCar) car;
            System.out.println("SpecialCar");
            System.out.println("Passengers: " + sc.getPassengerCount());
            System.out.println("Baggage: " + sc.getBaggageCount());
            System.out.println("Purpose: " + sc.getSpecialPurpose());
            System.out.println("Comfort Level: " + sc.getComfortLevel());
        } else if (car instanceof FreightCar) {
            FreightCar fc = (FreightCar) car;
            System.out.println("FreightCar");
            System.out.println("Cargo Capacity: " + fc.getCargoCapacity());
        }
        System.out.println("---------------------------");
    }
}