package pattern.creational.abstractfactory.assignment.weightloss;

import pattern.creational.abstractfactory.assignment.FitnessRoutineFactory;

public class WeightLossFitnessRoutine implements FitnessRoutineFactory {
    @Override
    public void createMealPlan() {
        System.out.println("Meal plan for weight loss.");
    }

    @Override
    public void createWorkoutRoutine() {
        System.out.println("Workout routine for weight loss.");
    }
}
