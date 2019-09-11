package Computer;

public abstract class Computer {
    String name;// 电脑名称
    String brand;// 品牌
    String cpu;// cpu
    String memory;// 内存大小，由于单位不一样，用String类型
    String hardDisk;// 硬盘大小,后面加GB
    String monitor;// 显示器，后面加英寸

    public Computer() {

    }

    public Computer(String name, String brand, String cpu, String memory, String hardDisk, String monitor) {
        this.name = name;
        this.brand = brand;
        this.cpu = cpu;
        this.memory = memory;
        this.hardDisk = hardDisk;
        this.monitor = monitor;
    }

    // public abstract void search(),delete(),addDesktop(),addNotebook();
    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setHardDisk(String hardDisk) {
        this.name = name;
    }

    public void setMonitor(String name) {
        this.monitor = monitor;
    }

    public abstract void search();
};
