package Demo;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        String choose = null;
        boolean exit = false;
        SachManager sachManager = new SachManager();
        int sachId;

        // show menu
        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    sachManager.add();
                    break;
                case "2":
                    sachManager.show();
                    break;
                case  "3":
                    System.out.println("Nhap ma khach hang: ");
                    String maid = scanner.nextLine();
                    try {
                        sachManager.timHoaDonTheoMASACH(maid);
                        sachManager.show();
                    } catch (Exception e){
                        System.out.println(e);
                    }
                    break;

                case "0":
                    System.out.println("exited!");
                    exit = true;
                    break;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
            if (exit) {
                break;
            }
            // show menu
            showMenu();
        }
    }


    /**
     * create menu
     */
    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Add sach.");
        System.out.println("2. Show sach.");
        System.out.println("3.Search sach");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}

