import java.util.concurrent.Semaphore;

class Foo {

    private Semaphore semFirstDone;
    private Semaphore semSecondDone;

    public Foo() {
        //Initialize semaphores, which are flags to know when it's ok to start a process
        semFirstDone = new Semaphore(0);
        semSecondDone = new Semaphore(0);
    }

    public void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        semFirstDone.release(); //Allow second to run
    }

    public void second(Runnable printSecond) throws InterruptedException {
        
        // printSecond.run() outputs "second". Do not change or remove this line.
        semFirstDone.acquire(); //Wait for first semaphore to complete
        printSecond.run();
        semSecondDone.release(); //Allow third to run
    }

    public void third(Runnable printThird) throws InterruptedException {
        
        // printThird.run() outputs "third". Do not change or remove this line.
        semSecondDone.acquire(); //Wait for second semaphore to complete
        printThird.run();
    }
}