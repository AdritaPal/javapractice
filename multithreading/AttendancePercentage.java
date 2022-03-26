package multithreading;
import java.util.Scanner;
import java.util.Vector;

class Attendance{
    static int winners = 0;
    static Vector<Integer> arr = new Vector<>();

    static synchronized void counting(int s,int n){
        for(int i = s; i < n; i++){
            if(arr.get(i) == 100)
                winners++;
        }
    }
}

class count extends Thread{
    int n,s;

    count(int s,int n){
        this.n = n;
        this .s=s;
    }
    public void run(){
        Attendance.counting(s,n);
    }
}

public class AttendancePercentage {
    public static void main(String[] args) {
    	Scanner sc = new Scanner (System.in);
    	int n=sc.nextInt();
        for(int i = 0; i < n; i++){
            Attendance.arr.add(sc.nextInt());
        }

        Thread t1 = new count(0,n/2);
        Thread t2 = new count(n/2,n);
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }

        System.out.println(Attendance.arr);
        System.out.println("Winners are = " + Attendance.winners);

    }
}