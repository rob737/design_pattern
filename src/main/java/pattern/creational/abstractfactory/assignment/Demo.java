package pattern.creational.abstractfactory.assignment;

import pattern.creational.abstractfactory.assignment.buildmuscle.BuildMuscleFitnessRoutine;
import pattern.creational.abstractfactory.assignment.strengthtraining.StrengthTrainingFitnessRoutine;
import pattern.creational.abstractfactory.assignment.weightloss.WeightLossFitnessRoutine;

public class Demo {
    public static void show() {
        var homePage = new HomePage();
        homePage.setGoal(new StrengthTrainingFitnessRoutine());
    }
}
