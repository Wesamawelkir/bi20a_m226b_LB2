import java.util.Random;

public class OilTempBoschImpl extends TemperatureSensor {
    public OilTempBoschImpl() {
        super("fahrenheit");
    }

    @Override
    public String getName() {
        return "Temperatur in Fahrenheit";
    }

    @Override
    public void doMeasurement() {
        Random rand = new Random();
        measurementValue = rand.nextDouble() * 1000.0;
    }
}