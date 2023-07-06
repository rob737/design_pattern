package pattern.creational.abstractfactory.assignment.strengthtraining;

import pattern.creational.abstractfactory.assignment.FitnessRoutineFactory;

public class StrengthTrainingFitnessRoutine implements FitnessRoutineFactory {
    @Override
    public void createMealPlan() {
        System.out.println("Meal plan for strength training");
    }

    @Override
    public void createWorkoutRoutine() {
        System.out.println("Workout routine for strength training.");
    }
}
