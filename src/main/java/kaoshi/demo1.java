package kaoshi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Admin on 2018/5/11.
 */
public class demo1 {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        Scanner scanner = new Scanner(System.in);
        int teamNum = scanner.nextInt();
        int diffNum = scanner.nextInt();
        for(int j=0;j < diffNum;j++){
            String line = scanner.nextLine();
            map = calculate(line,"\\,",map);
        }
        Map<Integer,Integer> customerTeamPeople = new HashMap<Integer, Integer>();
        for (int i=1;i<=teamNum;i++){
            customerTeamPeople.put(2*i-1,2*i);
        }
        Boolean isSuccess = deal(customerTeamPeople, map);
        if(true == isSuccess){
            System.out.println("yes");
        }
        System.out.println("no");
    }

    private static  Map calculate(String exp,String opt,Map<Integer,Integer> map){
        int array[] = split(exp,opt);
        map.put(array[0],array[1]);
        return map;
    }

    private static int[] split(String exp,String opt){
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
    private static Boolean deal(Map<Integer,Integer> customerTeamPeople,Map<Integer,Integer> map){
        for (Map.Entry<Integer,Integer> entry : customerTeamPeople.entrySet()){

        }
        return true;
    }
}
