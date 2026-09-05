package com.sample;

public class FeatureApi {

    /**
     * 모듈 동작 확인용 응답을 반환한다.
     *
     * @return 응답 문자열
     */
    public String ping() {
        return "pong from sample-domain";
    }
}
