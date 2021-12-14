package com.imcbb.strategy;

import org.springframework.stereotype.Component;

/**
 * @author kevin
 * @desc 白金卡会员
 * @date 2021/12/13 16:32
 */

@Component("PCM")
public class PlatinumCardMemberStrategy implements MemberStrategy {

    /**
     * @desc 会员折扣
     */
    private static final double MEMBER_DISCOUNT = 0.6;

    @Override
    public double getMemberPrice(double goodsPrice) {
        return MEMBER_DISCOUNT * goodsPrice;
    }
}
