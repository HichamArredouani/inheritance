public class Manager extends Employee {
    @Override
    public void work() {
        super.work();
        System.out.println("Manager is managing");
    }
}
