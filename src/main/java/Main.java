import ru.iteco.printer.PrintContext;

import java.io.File;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("1.txt");
        File file2 = new File("2.txt");
        String fileData = "1st file";
        String fileData2 = "2ns file";
        try {
            FileOutputStream fos = new FileOutputStream("1.txt");
            fos.write(fileData.getBytes());
            fos.flush();
            fos.close();
            FileOutputStream fos2 = new FileOutputStream("2.txt");
            fos2.write(fileData2.getBytes());
            fos2.flush();
            fos2.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        var context1 = new PrintContext();
        context1.depositMoney(100.0f);
        context1.selectDevice("WIFI");
        context1.selectFile(file1);
        context1.print();
        context1.selectFile(file2);
        context1.print();
        context1.cashBack();

        var context2 = new PrintContext();
        context2.depositMoney(500.0f);
        context2.selectDevice("USB");
        context2.selectFile(file1);
        context2.print();
        context2.selectFile(file2);
        context2.print();
        context2.cashBack();
    }
}
