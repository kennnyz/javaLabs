package lab2.Bridge;

// Паттерн мост (Bridge) - структурный шаблон проектирования, который позволяет отделить абстракцию от реализации
// так, чтобы и абстракцию, и реализацию можно было изменять независимо друг от друга.


// Мотор
interface Engine {
    void start();
    void stop();
}

// Конкретная реализация интерфейса
class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electric engine starts");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stops");
    }
}

// Еще одна конкретная реализация интерфейса
class GasEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Gas engine starts");
    }

    @Override
    public void stop() {
        System.out.println("Gas engine stops");
    }
}

// Абстракция (Abstraction)
abstract class Vehicle {
    protected Engine engine;

    protected Vehicle(Engine engine) {
        this.engine = engine;
    }

    abstract void drive();
}

// Расширение абстракции (RefinedAbstraction)
class Car extends Vehicle {
    public Car(Engine engine) {
        super(engine);
    }

    @Override
    void drive() {
        System.out.print("Car ");
        engine.start();
        System.out.println("Car is moving");
    }
}

class Bike extends Vehicle {
    public Bike(Engine engine) {
        super(engine);
    }

    @Override
    void drive() {
        System.out.print("Bike ");
        engine.start();
        System.out.println("Bike is moving");
    }
}

public class Main {
    public static void main(String[] args) {
        Engine electricEngine = new ElectricEngine();
        Engine gasEngine = new GasEngine();

        Vehicle car = new Car(electricEngine);
        Vehicle bike = new Bike(gasEngine);

        car.drive();
        bike.drive();
    }
}
