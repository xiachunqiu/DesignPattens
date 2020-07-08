package patterns.behavioralpatterns.observerpattern;

import patterns.behavioralpatterns.observerpattern.observer.BinaryObserver;
import patterns.behavioralpatterns.observerpattern.observer.HexObserver;
import patterns.behavioralpatterns.observerpattern.observer.OctalObserver;

/**
 * 观察者模式
 */
public class Demo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
