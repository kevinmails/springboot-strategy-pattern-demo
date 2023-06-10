package com.imcbb.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class MemberStrategyFactory {

    private Map<String, MemberStrategy> memberStrategyMap;

    public MemberStrategyFactory(Map<String, MemberStrategy> memberStrategyMap) {
        this.memberStrategyMap = memberStrategyMap;
    }

    public MemberStrategy getMemberStrategy(String cardType) {

        Objects.requireNonNull(cardType, "param cardType can not be null");
        return Objects.requireNonNull(memberStrategyMap
                .get(cardType), "member card type:" + cardType + " instance is undefined");
    }
}
