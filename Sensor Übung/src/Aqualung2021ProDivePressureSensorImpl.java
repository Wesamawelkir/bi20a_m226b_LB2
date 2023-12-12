import java.util.Random;

public class Aqualung2021ProDivePressureSensorImpl extends PressureSensor{
    public Aqualung2021ProDivePressureSensorImpl() {
        super("bar");
    }

    @Override
    public String getName() {
        return "Druck in bar";
    }

    @Override
    public void doMeasurement() {
        Random rand = new Random();
        measurementValue = rand.nextDouble() * 10.0;
    }
}