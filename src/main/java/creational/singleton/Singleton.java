package creational.singleton;

import lombok.Getter;

/**
 * This is an implementation of Thread-safe Singleton Pattern. This pattern allows us to have one (and only one) instance
 * of a class in a given time.
 *
 * We've achieved this behavior by setting the constructor as private and creating a getInstance() method that either
 * retrieves an already instantiated class or a new instance of it.
 *
 * In order to be prepared for multi-thread access, we need to declare the singleton static attribute as "volatile" in order to prevent
 * the access in a partially constructed object. In addition, we've also added the synchronized keyword to lock a single thread access
 * at a time.
 *
 * @author Hugo Gois
 */

@Getter
public class Singleton {

    private final String data;

    private static volatile Singleton INSTANCE;

    private Singleton(String data){
        this.data = data;
    }

    public static Singleton getInstance(String data){

        Singleton result = INSTANCE;
        if(result == null){
            synchronized (Singleton.class) {
                result = INSTANCE;
                if(result == null) {
                    result = INSTANCE = new Singleton(data);
                }
            }
        }

        return result;

    }

}
