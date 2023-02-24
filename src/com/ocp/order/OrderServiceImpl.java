package com.ocp.order;

import com.ocp.discount.DiscountPolicyImpl;

public class OrderServiceImpl implements OrderService {

    DiscountPolicyImpl discountPolicy = new DiscountPolicyImpl();

    @Override
    public void placed(int price) {
        int result = discountPolicy.discount(price);
        System.out.println("할인금액 = " + result);
    }


}
