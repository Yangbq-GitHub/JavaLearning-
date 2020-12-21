package coins;

import java.util.HashMap;
import java.util.Scanner;

public class Coin {
    private HashMap<Integer,String> coinnames = new HashMap<Integer, String>();
    //Hash表，组队加入
    public Coin(){
        coinnames.put(1,"penny");
        coinnames.put(10,"dime");
        coinnames.put(25,"quarter");
        coinnames.put(50,"half-dollar");
        coinnames.put(50,"五毛");
        //hash表key唯一，只保留最后一次
        System.out.println(coinnames.keySet().size());
        System.out.println(coinnames);
        //遍历hash的key
        for(Integer k : coinnames.keySet()){
            String s = coinnames.get(k);
            System.out.println(s);
        }

        //key的类型是Integer为什么不是Int，这是个面向对象的事件，在这些容器里面Hash表依然是一种容器
        // 容器的类型都是对象，Integer包裹类型
    }
    public String getName(int amount){
        if(coinnames.containsKey(amount)){
            return coinnames.get(amount);
        }else{
            return "NOT FOUND";
        }
    }
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int amount = in.nextInt();
        Coin coin = new Coin();
        String name =coin.getName(amount);
        System.out.println(name);

    }
}
