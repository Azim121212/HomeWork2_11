public class GrandFather {
    private int age;
    private String name;
    private Working working;
    private Home home;


    public GrandFather(int age, String name, Working working,Home home) {
        this.age = age;
        this.name = name;
        this.working = working;
        this.home =home;
    }

    public Home getHouse() {
        return home;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Working getWorking() {
        return working;
    }

    public String getInfo (){
        return "Age: " + age +
                "\nName: " + name +
                "\nWorking: " + working +
                "\nHouse: " + home.getAddres();
    }
}
