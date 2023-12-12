import java.util.Random;

public class Barometric1000PressureSensorImpl extends PressureSensor {
    public Barometric1000PressureSensorImpl() {
        super("hPa");
    }

    @Override
    public String getName() {
        return "Druck in hPa";
    }

    @Override
    public void doMeasurement() {
        Random rand = new Random();
        measurementValue = 0.5 + rand.nextDouble() * 0.55;
    }
}