public class Main {
    public static void main(String[] args) {
        Home home = new Home("Babushkina 3","Bishkek");
        Father father = new Father(56,"Alym ", Working.BUSINESSMEN,home,"lEXUS");
        Son son = new Son(17,"Azim",Working.STUDENT,new Home("Akylbekova 66","Bishkek"),"moped",2);
        Son son1 = new Son(19,"Aziz ",Working.STUDENT, new Home("Kishenevskya 1","Bishkek"),"baik",7 );
        System.out.println(father.getInfo());
        System.out.println("=======");
        System.out.println(son.getInfo());
        System.out.println("=======");
        System.out.println(son1.getInfo());
        father.Work();
        father.Work("Sell Appartmans");
        father.Work(220);
        son.Work();
        son.Work("Azim every day going to college");
        son1.Work();
        son1.Work("Aziz every day playing lap top");

    }
}