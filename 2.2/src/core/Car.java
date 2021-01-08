package core;

public class Car {
    public String number;  // Переменная
    public int height;    // Переменная
    public double weight;    // Переменная
    public boolean hasVehicle;   // Переменная
    public boolean isSpecial;   // Переменная

    public String toString() {
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";
        return "\n=========================================\n" +
                special + "Автомобиль с номером " + number +
                ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг";
    }
}
