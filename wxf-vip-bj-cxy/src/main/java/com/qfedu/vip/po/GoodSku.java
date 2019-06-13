package com.qfedu.vip.po;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GoodSku {
    private String skuId;
    private String skuName;
    private String skuCost;
    private String skuPrice;
    private String skuPmoney;
    private String goodId;
    private long orderNo;
    private String serviceMoney;
}
