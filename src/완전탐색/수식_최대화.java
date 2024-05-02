package 완전탐색;

import java.util.ArrayList;

public class 수식_최대화 {
    public static void main(String[] args) {
        String expression = "100-200*300-500+20";

        solution(expression);
    }

    public static long solution(String expression){
        long answer = 0;

        String op[][] = {{"+","-","*"},{"+","*","-"},{"-","+","*"},{"-","*","+"},{"*","-","+"},{"*","+","-"}};

        ArrayList<String> list = new ArrayList<String>();

        //StringTokenizer로 변경해보기
        int start = 0;
        for(int i=0;i<expression.length();i++){
            if(expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '*'){
                list.add(expression.substring(0,i));
                list.add(expression.charAt(i)+""); //String으로 변경
                start = i+1;
            }
        }

        for(int i = 0 ; i<op.length;i++){
            ArrayList<String> sub_list = new ArrayList<String>(list);
            for(int j = 0; j<3;j++){
                for (int k = 0; k < sub_list.size(); k++) {
                    if (op[i][j].equals(sub_list.get(j))) {
                        sub_list.set(j - 1, calculate(sub_list.get(j - 1), sub_list.get(j), sub_list.get(j + 1)));
                        sub_list.remove(j);
                        sub_list.remove(j);
                        j--;
                    }
                }
            }
            answer = Math.max(answer, Math.abs(Long.parseLong(sub_list.get(0))));
        }

        return answer;
    }

    public static String calculate(String num1, String oper, String num2){
        long n1 = Long.parseLong(num1);
        long n2 = Long.parseLong(num2);

//        return switch (oper){
//            case "+" n1 + n2 + ""; break;
//
//        }
        if(oper.equals("+")){
            return n1 + n2 + "";
        }else if(oper.equals("-")){
            return n1 - n2 + "";
        }else{
            return n1 * n2 + "";
        }
    }
}
