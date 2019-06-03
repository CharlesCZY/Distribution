package com.qfedu.wfxmerchant.po;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WxGoods {
    private String goodId;
    private String goodName;
    private java.sql.Timestamp createTime;
    private long toped;
    private long recomed;
    private String customerId;
    private String goodPic;
    private String goodPic1;
    private String goodPic2;
    private String promoteDesc;
    private String skuTitle;
    private String skuCost;
    private String skuPrice;
    private String skuPmoney;
    private String copyIds;
    private String copyDesc;
    private String forwardLink;
    private long orderNo;
    private String typeId;
    private String tags;
    private long state;

    private java.sql.Timestamp topedTime;
    private java.sql.Timestamp recomedTime;
    private String spcId;
    private String zonId;
    private long sellNum;
    private String website;
    private long iswxpay;
    private long isfdfk;
    private long leixingId;
    private String kfqq;

    private List<WxbGoodSku> skuList;


    public void getCustomerId(String s) {
        this.customerId=s;
    }
}
