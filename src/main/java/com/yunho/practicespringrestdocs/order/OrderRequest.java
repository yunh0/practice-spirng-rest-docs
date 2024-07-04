package com.yunho.practicespringrestdocs.order;

import lombok.Getter;

@Getter
public class OrderRequest {

    private String orderNumber;
    private Long memberId;
    private Long amount;
    private String address;
}
