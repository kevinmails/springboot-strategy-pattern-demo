package com.imcbb.controller;

import com.imcbb.model.ShopCart;

import com.imcbb.strategy.MemberStrategy;
import com.imcbb.strategy.MemberStrategyFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author kevin
 */
@Slf4j
@Controller
@RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
public class ShoppingController {


    private final MemberStrategyFactory memberStrategyFactory;

    public ShoppingController(MemberStrategyFactory memberStrategyFactory) {
        this.memberStrategyFactory = memberStrategyFactory;
    }


    @RequestMapping(value = "createOrder", method = RequestMethod.POST)
    public String createOrder(@ModelAttribute ShopCart cart, Model model) {
        log.info("收到订单。。。{}", cart);

        MemberStrategy memberStrategy = memberStrategyFactory.getMemberStrategy(cart.getCardType());
        double memberPrice = memberStrategy.getMemberPrice(cart.getGoodsPrice());
        cart.setDiscountPrice(memberPrice);
        log.info("会员价：{}", memberPrice);
        model.addAttribute("result",cart);
        model.addAttribute("cart", cart);
        if (true) {
            return "index";
        }
        return "error";
    }

    @RequestMapping(value = "index")
    public String getIndex(Model model) {
        model.addAttribute("cart", new ShopCart());
        return "index";
    }


}
