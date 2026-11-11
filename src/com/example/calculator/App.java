package com.example.calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String a;
        String b;

        do {
            System.out.println("첫 번째 숫자를 입력하시오");
            int num1 = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하시오");
            int num2 = sc.nextInt();
            System.out.println("사칙연산 기호를 입력하시오");
            char operator = sc.next().charAt(0);

            calculator.calculate(num1,num2,operator);
            System.out.println("결과: "+ calculator.Getter());
            System.out.println("현재 저장된 결과들: "+calculator.resultList);

            System.out.println("가장 먼저 저장된 결과를 삭제하시겠습니까? ( Yes or No");
            b = sc.next();
            calculator.Myremove(b);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료 계속 하시려면 아무 글자 입력)");
            a = sc.next();
         }while(!a.equals("exit"));

        System.out.println("세터 메서드 수정값 " + calculator.Setter(1000));
        System.out.println("계산기를 종료합니다.");
    }

}