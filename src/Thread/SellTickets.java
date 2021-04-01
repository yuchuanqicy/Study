package Thread;

public class SellTickets implements Runnable {
    private int tickets=100;
    private Object obj=new Object();
    @Override
    public void run() {

            while (true) {
                synchronized (obj) {
                    if (tickets > 0) {
                        System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "票");
                        tickets--;
                    }
                }
            }
        }

}
