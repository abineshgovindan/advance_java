package Advance_Java.Multithreading_And_Concurrent.ThreadStates;
class ABC implements Runnable{
    public void run(){
        try
        {
// moving thread t2 to the state timed waiting
            Thread.sleep(100);
        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }

        System.out.println("The state of thread t1 while it invoked the method join() on thread t2 -"+ ThreadState.t1.getState());
    }
}

public class Thread_LifeCycle_State {


}
