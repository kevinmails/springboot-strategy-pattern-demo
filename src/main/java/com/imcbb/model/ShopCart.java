package com.imcbb.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ShopCart {
   private double goodsPrice;
   private String cardType;
   private double discountPrice;

}
