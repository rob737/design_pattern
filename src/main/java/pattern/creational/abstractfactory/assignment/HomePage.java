package pattern.creational.abstractfactory.assignment;

public class HomePage {

    public void setGoal(FitnessRoutineFactory fitnessRoutineFactory) {
        fitnessRoutineFactory.createMealPlan();
        fitnessRoutineFactory.createWorkoutRoutine();
    }
}
