package com.example.calculator;

public enum OperatorType  {

    ADD('+'), SUBTRACT('-'), MULTIPLY('*'), DIVIDE('/');

    private  final  char operator;

    OperatorType(char operator) {
        this.operator = operator;
    }

    public char getOperator() {
        return operator;
    }
    public static OperatorType fromChar(char c) { // +,-,*,/
        for (OperatorType type : OperatorType.values()) {
            if (type.operator == c) {
                return type;
            }
        }
        throw new IllegalArgumentException("올바른 연산자를 입력하세요.");
    }

}
