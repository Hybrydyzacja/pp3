public class SimpleCounter {
    int counter;

    public void increaseByOne(){
        counter++;
    }

    public void increaseBy10 (){
        counter = (counter + 10);
    }

     public void decreaseByOne(){
        counter--;
    }

    public void decreaseBy10(){
        counter = (counter - 10);
    }

    public void reset(){
        counter = 0;
    }

    public void printValue(){
        System.out.println("Counter value: " + counter);
    }
}
