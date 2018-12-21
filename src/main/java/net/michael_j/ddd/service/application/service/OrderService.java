package net.michael_j.ddd.service.application.service;

/**
 * @author: fuxi
 * @date: 2018/12/21
 */
public interface OrderService {

    void createOrder(long uid, String name, String content);
}
