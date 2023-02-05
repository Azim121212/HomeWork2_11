public final class Son extends Father{
    private int school;

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nSchool: " + school;
    }

    public Son(int age, String name, Working working,Home house, String car, int school) {
        super(age, name, working, house, car);
        this.school = school;
    }

    public int getSchool() {
        return school;
    }

    @Override
    public void Work(String working) {
        super.Work(working);
    }
}
