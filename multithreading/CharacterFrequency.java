package multithreading;

//You are using Java
import java.util.Scanner;

class Mythread extends Thread{
 String s;
 Mythread(String s){
     this.s=s;
 }
 public void run(){
     Frequency.count(s);
 }
}
class Frequency{
 public static void count(String s){
     int freq[]= new int[s.length()];
     char str[]=s.toCharArray();
     for(int i=0;i<s.length();i++){
         freq[i]=1;
         for(int j =i+1;j<s.length();j++){
             if(str[i]==str[j]){
                 freq[i]++;
                 str[j]='0';
             }
         }
     }
     for(int i=0;i<freq.length;i++){
         if(str[i]!='0'){
             System.out.println(str[i]+""+freq[i]);
         }
     }

 }
}
public class CharacterFrequency  extends Thread{
 public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int n= sc.nextInt();
     for (int i=0;i<n+1;i++){
         String str = sc.nextLine();
         Thread t = new Mythread(str);
         t.start();

     }
 }
}