import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CsvWriter {
    private Sensor sensor;
    private int interval;
    private String filename;

    CsvWriter(Sensor sensor, int interval, String filename) {
        this.sensor = sensor;
        this.interval = interval;
        this.filename = filename;
    }

    public void run() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (int i = 0; i < 10; i++) {
                sensor.doMeasurement();
                writer.println(System.currentTimeMillis() + "," +
                        sensor.getName() + "," +
                        sensor.getUnit() + "," +
                        sensor.getValue());
                Thread.sleep(interval);
            }
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}