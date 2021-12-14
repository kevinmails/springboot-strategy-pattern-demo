package com.imcbb.strategy;

import org.springframework.stereotype.Component;

/**
 * @author kevin
 * @desc 普卡会员策略
 * @date 2021/12/13 16:22
 */
@Component("CM")
public class CardMemberStrategy implements MemberStrategy {

    /**
     * @desc 会员折扣，普卡会员不打折
     */
    private static final double MEMBER_DISCOUNT = 1.0;

    @Override
    public double getMemberPrice(double goodsPrice) {
        return MEMBER_DISCOUNT * goodsPrice;
    }
}
