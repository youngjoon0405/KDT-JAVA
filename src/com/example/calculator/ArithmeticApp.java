package com.example.calculator;

import java.util.Scanner;

public class ArithmeticApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator <Double> arithmeticCalculator = new ArithmeticCalculator<Double>();

        String a;
        String b;
        String c;

        do {
            System.out.println("첫 번째 숫자를 입력하시오");
            Double num1 = sc.nextDouble();
            System.out.println("두 번째 숫자를 입력하시오");
            Double num2 = sc.nextDouble();
            System.out.println("사칙연산 기호를 입력하시오");
            char operator = sc.next().charAt(0);

            arithmeticCalculator.calculate(num1,num2,OperatorType.fromChar(operator));

            System.out.println("결과: "+ arithmeticCalculator.Getter());
            System.out.println("현재 저장된 결과들: "+arithmeticCalculator.resultList);

            System.out.println("가장 먼저 저장된 결과를 삭제하시겠습니까? ( Yes or No)");
            a = sc.next();
            arithmeticCalculator.Myremove(a);

            System.out.println("특정 값보다 큰 결과를 조회하시겠습니까? ( Yes or No)");
            b = sc.next();


            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료 계속 하시려면 아무 글자 입력)");
            c = sc.next();

        }while(!c.equals("exit"));

        System.out.println("세터 메서드 수정값 " + arithmeticCalculator.Setter(1000.0));
        System.out.println("계산기를 종료합니다.");
    }

}