package com.example.calculator;
import java.util.ArrayList;
public class Calculator {
    // int num1; 이미 넘겨 받은 매게변수가 있고 이 값을 저장하지 않고 결과 값만 가지고 있기 떄문에 필요없다.
    // int num2;
    private int result;
    // char operator;
    ArrayList<Integer> resultList = new ArrayList<Integer>();


    public void calculate(int num1, int num2, char operator) {
        boolean success = true;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if(num2 == 0) {
                    System.out.println("계산 불가");
                    success = false;
                }else result = num1 / num2;
                break;
        }
       if(success) resultList.add(result);
    }
    public void Myremove(String b) {
        if(b.equals("Yes")) {
            resultList.remove(0);
        }else System.out.println("삭제하지 않기를 선택하셨습니다.");
    }
    public int Getter(){
        return result;
    }
    public int Setter(int result){
        this.result = result;
        return result;
    }
}
