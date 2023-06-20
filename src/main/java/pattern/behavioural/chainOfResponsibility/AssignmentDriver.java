package pattern.behavioural.chainOfResponsibility;

import pattern.behavioural.chainOfResponsibility.assignment.*;

public class AssignmentDriver {
    public static void main(String[] args) {
        QuickBookReader quickBookReader = new QuickBookReader(null);
        MacReader macReader = new MacReader(quickBookReader);
        ExcelReader excelReader = new ExcelReader(macReader);

        DataReader dataReader = new DataReader(excelReader);
        dataReader.read("chainOfResponsibility.txt");
    }
}
