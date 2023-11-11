public class SimpleCounterTest {
    public static void main(String[] args){
        SimpleCounter counter1 = new SimpleCounter();
        counter1.increaseBy10();
        counter1.increaseBy10();
        counter1.increaseByOne();
        counter1.increaseByOne();
        counter1.increaseByOne();
        counter1.printValue();

        SimpleCounter counter2 = new SimpleCounter();
        counter2.increaseBy10();
        counter2.reset();
        counter2.decreaseBy10();
        counter2.decreaseBy10();
        counter2.decreaseBy10();
        counter2.decreaseBy10();
        counter2.decreaseByOne();
        counter2.decreaseByOne();
        counter2.decreaseByOne();
        counter2.decreaseByOne();
        counter2.decreaseByOne();
        counter2.decreaseByOne();
        counter2.decreaseByOne();
        counter2.printValue();
    }
}
