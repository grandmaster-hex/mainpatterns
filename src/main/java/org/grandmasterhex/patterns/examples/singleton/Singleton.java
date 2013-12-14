package org.grandmasterhex.patterns.examples.singleton;

/**
 * Created by kvatashydze on 12/6/13.
 */
public class Singleton {
    private static Singleton instance;

    private Singleton(){

    }
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }
}

class SingletonThreadSafe{
    private static volatile SingletonThreadSafe instance;

    public static SingletonThreadSafe getInstance(){
        SingletonThreadSafe buffer = instance;
        if(buffer == null){
            synchronized (Singleton.class){
                buffer = instance;
                if(buffer == null){
                    instance = buffer = new SingletonThreadSafe();
                }
            }
        }
        return buffer;
    }
}

class SingletonFunny{
    public static final SingletonFunny instance = new SingletonFunny();
}
