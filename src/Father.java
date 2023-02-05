public class Father extends GrandFather {
    private String car;

    @Override
    public String getInfo() {
        return super.getInfo()+
                "\nCar:" + car;

    }

    public Father(int age, String name, Working working, Home home, String car) {
        super(age, name, working, home);
        this.car = car;
    }

    public String getCar() {
        return car;
    }

    public void Work(){
        System.out.println("Development");
    }

    public void Work(String working){
        System.out.println(Working.BUSINESSMEN);
    }

    public final void Work(int speedCar){
        System.out.println("Speed car: " + speedCar);

    }


}