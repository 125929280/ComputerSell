package Computer;

import java.util.Scanner;

public class ComputerMgr {
    Computer[] ComputerSet = new Computer[50];

    public void initial() {
        addComputer(new Notebook("T61", "IBM", "Intel酷睿2", "2GB", "160GB", "14.1inch", "6芯"));
        addComputer(new Notebook("X60", "IBM", "Intel酷睿2", "512MB", "60GB", "12.1英寸", "6芯"));
        addComputer(new Notebook("u4000", "华硕", "酷睿i5", "4GB", "160GB", "14英寸", "9芯"));
        addComputer(new Desktop("530MT", "戴尔", "Intel酷睿2", "512MB", "80GB", "19英寸", "卧式"));
        addComputer(new Desktop("Lenovo5050", "联想", "AMD速龙64", "1GB", "160GB", "22英寸", "立式"));
        addComputer(new Desktop("Lenovo天逸", "联想", "酷睿i5", "8GB", "1T", "22英寸", "立式"));
    }

    public void startMenu() {
        System.out.println("欢迎使用电脑管理系统");
        System.out.println("-------------------------------------");
        System.out.println("1. 查看电脑信息");
        System.out.println("2. 增加电脑信息 ");
        System.out.println("3. 删除电脑信息 ");
        System.out.println("4. 退出 ");
        System.out.print("--------------------------------------\n");

        System.out.print("请选择： ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice) {
        case 1:// 查看电脑信息
            System.out.println(" 查看电脑信息");
            search();
            break;
        case 2:// 增加电脑信息
            System.out.println("增加电脑信息 ");
            addComputer();
            break;
        case 3:// 删除电脑信息
            System.out.println("删除电脑信息 ");
            delete();
            break;
        case 4:// 退出
            System.out.println("\n谢谢 使 用！");
            break;
        }
    }

    public void returnMenu() {
        Scanner input = new Scanner(System.in);
        System.out.print("输入0返回：");
        if (input.nextInt() == 0) {
            startMenu();
        } else {
            System.out.println("输入错误, 异常终止！");
        }
    }

    public void search() {
        int i = 0;
        Scanner s = new Scanner(System.in);
        // System.out.println("序号" + "\t型号名称" + "\t品牌" + "\tCPU" + "\t内存" + "\t硬盘" +
        // "\t显示器" + "\t电池芯片" + "\t机箱类型");
        System.out.println(String.format("%-12s%-12s%-12s%-12s%-12s%-12s%-12s%-12s%-12s", "序号", "型号名称", "品牌", "CPU",
                "内存", "硬盘", "显示器", "电池芯片", "机箱类型"));
        for (i = 0; i < ComputerSet.length; ++i) {
            if (ComputerSet[i] == null)
                break;
            System.out.print(i + 1 + "\t");
            ComputerSet[i].search();
        }
        System.out.println("请用户输入所选序号");
        i = s.nextInt();
        while (i <= 0 || i > ComputerSet.length || ComputerSet[i - 1].name == null) {
            System.out.println("输入有误,请重新输入");
            i = s.nextInt();
        }
        ComputerSet[i - 1].search();
        returnMenu();
    }

    public void addComputer() {
        Scanner input = new Scanner(System.in);
        System.out.println("请选择电脑类型：1：笔记本\t2：台式机");
        int choice = input.nextInt();
        System.out.println("请输入型号名称：");
        String name = input.next();
        System.out.println("请输入品牌名称");
        String brand = input.next();
        System.out.println("请输入CPU：");
        String cpu = input.next();
        System.out.println("请输入内存");
        String memory = input.next();
        System.out.println("请输入硬盘：");
        String hardDisk = input.next();
        System.out.println("请输入显示器尺寸：");
        String monitor = input.next();

        int index = 0;
        for (; index < ComputerSet.length; index++) {
            if (ComputerSet[index] == null) {
                break;
            }
        }

        if (choice == 2) {
            System.out.println("请选择机箱类型：1：立式\t2：卧式");
            int temp = input.nextInt();
            String hosttype = "";
            if (temp == 1)
                hosttype = "立式";
            else if (temp == 2)
                hosttype = "卧式";
            Desktop desktop = new Desktop(name, brand, cpu, memory, hardDisk, monitor, hosttype);
            ComputerSet[index] = desktop;
        } else if (choice == 1) {
            System.out.println("请选择电池芯片：1：6芯\t2：9芯");
            int temp = input.nextInt();
            String battery = "";
            if (temp == 1)
                battery = "6芯";
            else if (temp == 2)
                battery = "9芯";
            Notebook notebook = new Notebook(name, brand, cpu, memory, hardDisk, monitor, battery);
            ComputerSet[index] = notebook;
        }
        returnMenu();
    }

    public void addComputer(Computer computer) {
        int index = 0;
        for (; index < ComputerSet.length; index++) {
            if (ComputerSet[index] == null) {
                break;
            }
        }
        ComputerSet[index] = computer;
    }

    public void delete() {
        boolean flag = false;// 标识删除成功与否
        System.out.println("请输入待删除序号:");
        while (flag == false) {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            number = number - 1;
            int i = 0;
            for (; (i < ComputerSet.length - 1) && ComputerSet[i] != null; i++) {
                if (i >= number) {
                    flag = true;
                    ComputerSet[i] = ComputerSet[i + 1];
                }
            }
            if (flag) {
                System.out.println("删除成功！");
                ComputerSet[i - 1] = null;
            } else {
                System.out.println("不存在请重新输入");
            }
        }
        returnMenu();
    }

}