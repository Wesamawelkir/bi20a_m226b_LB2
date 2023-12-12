public abstract class Sensor {
    public abstract String getName();

    public abstract String getUnit();

    public abstract Double getValue();

    public abstract void doMeasurement();
}