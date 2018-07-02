
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Main {

    private static final String carSplit =";";
    private static final String timeSplit =",";
    private static final String regress = "(\\d{1,2},\\d{1,2};)*\\d{1,2},\\d{1,2}$";

    public static void main(String[] args) {
        String inString = null;
        // 数据输入
        Scanner in = new Scanner(System.in);
        inString = in.nextLine();
        //字符串数组格式校验
        Pattern pat = Pattern.compile(regress);
        if(inString == null || inString.trim().equals("")||!pat.matcher(inString).matches()){
            System.out.println("输入错误!");
            return;
        }
        Main sol = new Main();
        int countCars = sol.countCars(sol.convertToArray(inString));
        System.out.println(countCars);
    }

    //输入字符串转数组
    public int[][] convertToArray(String str) {
        String[] strArray = str.split(carSplit);
        int row = strArray.length;
        int col = 2;
        // 字符转数组判断
        int[][] carArray = new int[row][col];
        int start,end;
        for (int i = 0; i < row; i++) {
            start = Integer.parseInt(strArray[i].split(timeSplit)[0]);
            end = Integer.parseInt(strArray[i].split(timeSplit)[1]);
            if(start>end){
                continue;
            }
            carArray[i][0] = start;
            carArray[i][1] = end;
        }
        return carArray;
    }
    //核心算法实现
    public int countCars(int[][] carArray) {
        int ans = 0;
        List<Integer> jfd = new ArrayList<Integer>();
        for(int i=0,j=0;i<carArray.length;i++){

            if (carArray[i][1] > carArray[i][0]) {
                int s=0;
         //      for(int j=0;j<carArray.length;j++) {

                    if (carArray[i][0] < carArray[j][1] && carArray[j][0] > carArray[i][0]){
                        s++;
         //           }

                }
                jfd.add(s-1);

            }
            Collections.sort(jfd);
            ans=  jfd.get(jfd.size()-1);

        }

        return ans; // 返回计算结果
    }
}
