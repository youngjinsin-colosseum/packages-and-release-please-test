package com.sample;

/**
 * 인사말을 생성한다.
 *
 * @author sin
 */
public class Greeting {

    private final String name;

    public Greeting(String name) {
        this.name = name;
    }

    /**
     * 대상 이름이 포함된 인사말을 반환한다.
     *
     * @return 인사말 문자열
     */
    public String message() {
        return "안녕하세요, " + name + "님";
    }
}
