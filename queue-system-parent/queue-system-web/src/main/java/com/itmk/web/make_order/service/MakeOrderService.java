package com.itmk.web.make_order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itmk.web.make_order.entity.MakeOrder;

/**
 * @author java实战基地
 * @since 2383404558
 */
public interface MakeOrderService extends IService<MakeOrder> {
    void callVisit(MakeOrder makeOrder);
}
