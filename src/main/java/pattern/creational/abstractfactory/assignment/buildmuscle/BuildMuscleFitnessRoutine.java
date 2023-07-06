package pattern.creational.abstractfactory.assignment.buildmuscle;

import pattern.creational.abstractfactory.assignment.FitnessRoutineFactory;

// This denotes one family. (goal/operation + components)
public class BuildMuscleFitnessRoutine implements FitnessRoutineFactory {
    @Override
    public void createMealPlan() {
        System.out.println("Meal Plan for building muscle");
    }

    @Override
    public void createWorkoutRoutine() {
        System.out.println("Workout plan for building muscle");
    }
}
