package org.grandmasterhex.patterns.examples.adapter;

/**
 * Created by kvatashydze on 12/6/13.
 */
public class TurkeyAdapter implements Duck
{
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    public void quack(){
        turkey.voice();
    }

    public void fly(){
        for(int i = 0; i< 5; i++)
        {
            turkey.fly();
        }
    }
}
