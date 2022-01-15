package jp.ac.uryukyu.ie.e215747;
import java.util.Map;

public class sugoroku{
  final static int goal=50;
  static int start;
  static int masu[]={0};

    public static void main(String[] args){
   

    while(start==0);

        for (int i = 0; i < goal; i++) {
          System.out.println(i+ "ターン目");
          int result=new java.util.Random().nextInt(6) +1;;
          masu[i]=masu[i]+result;
          System.out.println(result + "つ進む");
          if (masu[i] >= goal) {

            System.out.println("ゴールおめでとう!!");
            break;
        }else {
            System.out.println(masu[i] + "のマスに止まった。");
        }
    }
}
}




      

      
      
  
        

     