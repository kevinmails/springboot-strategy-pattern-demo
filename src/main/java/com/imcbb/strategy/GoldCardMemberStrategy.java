package com.imcbb.strategy;

import org.springframework.stereotype.Component;

/**
* @desc 金卡会员
* @author kevin
* @date 2021/12/13 16:32
*
*/
@Component("GCM")
public class GoldCardMemberStrategy implements MemberStrategy {

    /**
     * @desc 会员折扣
     */
    private static final double MEMBER_DISCOUNT = 0.8;

    @Override
    public double getMemberPrice(double goodsPrice) {
        return MEMBER_DISCOUNT * goodsPrice;
    }
}
