package hello.core.singleton;

public class StateFullService {

    //private int price;  //상태를 유지라는 필드
    public  int  order(String name,int price){
        System.out.println("name = "+name+" price = "+price);
      //  this.price = price; // 여기가 문제!!
        return price;
    }




}
