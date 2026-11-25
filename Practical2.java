//Миронов В.Д. УБСТ-2404 11.11.26 (Mirdiway)

abstract class ComputerPeripheral
{
    private String brand;
    private String model;
    private int price;
    static int count = 0;

    ComputerPeripheral()
    {
        this("Unknown", "Unknown", 0);
    }

    ComputerPeripheral(String brand, String model, int price)
    {
        this.brand = brand;
        this.model = model;
        this.price = price;
        count++;
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getPrice() { return price; }

    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
    public void setPrice(int price) { this.price = price; }

    public void showInfo(String text)
    {
        System.out.println(text);
        showInfo();
    }

    public abstract void showInfo();
}

class Keyboard extends ComputerPeripheral
{
    private int keys;
    private String type;
    private boolean backlight;

    Keyboard(String brand, String model, int price, int keys, String type, boolean backlight)
    {
        super(brand, model, price);
        this.keys = keys;
        this.type = type;
        this.backlight = backlight;
    }

    public int getKeys() { return keys; }
    public void setKeys(int keys) { this.keys = keys; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public boolean getBacklight() { return backlight; }
    public void setBacklight(boolean backlight) { this.backlight = backlight; }

    public void pressKey() { System.out.println("Ввод текста с клавиатуры."); }
    public void changeLayout() { System.out.println("Изменение раскладки клавиатуры."); }

    @Override
    public void showInfo()
    {
        System.out.println("\nКлавиатура: " + getBrand() + " " + getModel());
        System.out.println("Цена: " + getPrice());
        System.out.println("Клавиш: " + keys);
        System.out.println("Тип: " + type);
        System.out.println("Подсветка: " + backlight);
    }
}

class Headphones extends ComputerPeripheral
{
    private String connection;
    private boolean microphone;
    private int volume;

    Headphones(String brand, String model, int price, String connection, boolean microphone, int volume)
    {
        super(brand, model, price);
        this.connection = connection;
        this.microphone = microphone;
        this.volume = volume;
    }

    public String getConnection() { return connection; }
    public void setConnection(String connection) { this.connection = connection; }

    public boolean getMicrophone() { return microphone; }
    public void setMicrophone(boolean microphone) { this.microphone = microphone; }

    public int getVolume() { return volume; }
    public void setVolume(int volume) { this.volume = volume; }

    public void playMusic() { System.out.println("Прослушивание музыки."); }
    public void adjustVolume() { System.out.println("Регулировка громкости."); }

    @Override
    public void showInfo()
    {
        System.out.println("\nНаушники: " + getBrand() + " " + getModel());
        System.out.println("Цена: " + getPrice());
        System.out.println("Подключение: " + connection);
        System.out.println("Микрофон: " + microphone);
        System.out.println("Громкость: " + volume);
    }
}

class GraphicsTablet extends ComputerPeripheral
{
    private String size;
    private int resolution;
    private int pressure;

    GraphicsTablet(String brand, String model, int price, String size, int resolution, int pressure)
    {
        super(brand, model, price);
        this.size = size;
        this.resolution = resolution;
        this.pressure = pressure;
    }

    public String getSize() { return size; }
    public void setSize(String size) { this.size = size; }

    public int getResolution() { return resolution; }
    public void setResolution(int resolution) { this.resolution = resolution; }

    public int getPressure() { return pressure; }
    public void setPressure(int pressure) { this.pressure = pressure; }

    public void draw() { System.out.println("Рисование на графическом планшете."); }
    public void erase() { System.out.println("Стирание изображения."); }

    @Override
    public void showInfo()
    {
        System.out.println("\nГрафический планшет: " + getBrand() + " " + getModel());
        System.out.println("Цена: " + getPrice());
        System.out.println("Размер: " + size);
        System.out.println("Разрешение: " + resolution);
        System.out.println("Чувствительность пера: " + pressure);
    }
}

public class Practical2 
{
    public static void main(String[] args)
    {
        System.out.println("Миронов В.Д. Вариант-15 УБСТ-2404 11.11.26 (Mirdiway)");

        Keyboard keyboard = new Keyboard("Logitech", "G Pro X", 12000, 104, "Механическая", true);
        Headphones headphones = new Headphones("HyperX", "Cloud Alpha", 9000, "Проводные", true, 70);
        GraphicsTablet tablet = new GraphicsTablet("Wacom", "Intuos Pro", 25000, "A4", 5080, 8192);

        // Вывод информации о созданных объектах
        ComputerPeripheral[] devices = {keyboard, headphones, tablet};

        for (ComputerPeripheral device : devices)
        {
            device.showInfo();
        }

        // Демонстрация поведения
        keyboard.pressKey();
        headphones.playMusic();
        tablet.draw();

        // Демонстрация перегрузки
        keyboard.showInfo("Дополнительная информация:");

        // Счётчик объектов
        System.out.println("\nВсего создано объектов: " + ComputerPeripheral.count);
    }
}

//Миронов В.Д. УБСТ-2404 11.11.26 (Mirdiway)




