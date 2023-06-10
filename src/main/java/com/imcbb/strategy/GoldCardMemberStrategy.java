package com.imcbb.strategy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
* @desc 金卡会员
* @author kevin
* @date 2021/12/13 16:32
*
*/
@Slf4j
@Component("GCM")
public class GoldCardMemberStrategy implements MemberStrategy {

    /**
     * @desc 会员折扣
     */
    private static final double MEMBER_DISCOUNT = 0.8;

    @Override
    public double getMemberPrice(double goodsPrice) {
        log.info("执行金卡会员处理策略");
        return MEMBER_DISCOUNT * goodsPrice;
    }
}
