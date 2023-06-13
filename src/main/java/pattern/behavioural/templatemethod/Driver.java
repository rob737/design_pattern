package pattern.behavioural.templatemethod;

import pattern.behavioural.templatemethod.practice.FinancialTask;
import pattern.behavioural.templatemethod.practice.GenerateReportTask;
import pattern.behavioural.templatemethod.practice.TransferMoneyTask;

/*
* Learned a very important use case of protected access modifier :)
* */
public class Driver {
    public static void main(String[] args) {
       FinancialTask financialTask = new GenerateReportTask();
       financialTask.record();
    }
}
