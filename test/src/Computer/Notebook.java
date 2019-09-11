package Computer;

public class Notebook extends Computer {

    private String battery;// 0 9芯 1 6芯

    public Notebook() {

    }

    public Notebook(String name, String brand, String cpu, String memory, String hardDisk, String monitor,
            String battery) {
        super(name, brand, cpu, memory, hardDisk, monitor);
        this.battery = battery;
    }

    public void search() {
        // System.out
        // .print(name + "\t" + brand + "\t" + cpu + "\t" + memory + "\t" + hardDisk +
        // "GB\t" + monitor + "英寸\t");
        // if (battery == false)
        // System.out.print("9芯\n");
        // else
        // System.out.print("6芯\n");
        System.out.println(String.format("%-12s\t%-12s\t%-12s\t%-12s\t%-12s\t%-12s\t%-12s\t%-12s", name, brand, cpu,
                memory, hardDisk, monitor, battery, "\t"));

    }

};