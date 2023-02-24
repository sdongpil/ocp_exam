package com.ocp.discount;

public class DiscountPolicyImpl implements DIscountPolicy {

    private int discountRate = 10;

    @Override
    public int discount(int price) {
        return price - price / discountRate;
    }
}
