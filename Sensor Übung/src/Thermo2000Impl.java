import java.util.Random;

public class Thermo2000Impl extends TemperatureSensor {
    public Thermo2000Impl() {
        super("celsius");
    }

    @Override
    public String getName() {
        return "Temperatur in Celsius";
    }

    @Override
    public void doMeasurement() {
        Random rand = new Random();
        measurementValue = rand.nextDouble() * 100.0;
    }
}