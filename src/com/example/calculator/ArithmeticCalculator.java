package com.example.calculator;

import java.util.ArrayList;

public class ArithmeticCalculator<T extends Number> {
    private double result;
    ArrayList<Double> resultList = new ArrayList<Double>();

    public void calculate(T num1, T num2, OperatorType operator) {
        boolean success = true;

        double a = num1.doubleValue();
        double b = num2.doubleValue();

        switch (operator) {
            case ADD:
                result = a + b;
                break;
            case SUBTRACT:
                result = a - b;
                break;
            case MULTIPLY:
                result = a * b ;
                break;
            case DIVIDE:
                if(b == 0) {
                    System.out.println("계산 불가");
                    success = false;
                }else result = a / b;
                break;
        }
        if(success) resultList.add(result);
    }
    public void Myremove(String b) {
        if(b.equals("Yes")) {
            resultList.remove(0);
        }else System.out.println("삭제하지 않기를 선택하셨습니다.");
    }
    public Double Getter(){
        return result;
    }
    public Double Setter(Double result){
        this.result = result;
        return result;
    }

}
