package com.sample.support;

/**
 * 모듈별 독립 버전 관리 확인용 샘플 API.
 *
 * @author sin
 */
public class SupportApi {

    /**
     * 모듈 동작 확인용 응답을 반환한다.
     *
     * @return 응답 문자열
     */
    public String ping() {
        return "pong from sample-support";
    }
}
