package creational.singleton;

public class SingletonRunner {

    public static void main(String[] args){

        System.out.println(Singleton.getInstance("Testing Singleton"));
        Singleton singleton = Singleton.getInstance("Testing singleton 2");
        System.out.println(singleton);
        System.out.println(singleton.getData());

    }

}
