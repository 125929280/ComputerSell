package Computer;

public class Desktop extends Computer {
    private String hosttype;// 0 卧式 1 立式

    public Desktop() {

    }

    public Desktop(String name, String brand, String cpu, String memory, String hardDisk, String monitor,
            String hosttype) {
        super(name, brand, cpu, memory, hardDisk, monitor);
        this.hosttype = hosttype;
    }

    public void search() {
        // System.out.print(name + "\t\t" + brand + "\t" + cpu + "\t" + memory + "\t" +
        // hardDisk + "GB\t" + monitor + "英寸\t");
        // if (hosttype == false)
        // System.out.print("\t\t\t卧式\n");
        // else
        // System.out.print("\t\t\t立式\n");
        System.out.println(String.format("%-12s\t%-12s\t%-12s\t%-12s\t%-12s\t%-12s\t%-12s\t%-12s", name, brand, cpu,
                memory, hardDisk, monitor, "\t", hosttype));
    }

};