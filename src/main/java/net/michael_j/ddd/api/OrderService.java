package net.michael_j.ddd.api;

/**
 * @author: fuxi
 * @date: 2018/12/21
 */
public interface OrderService {

    void createOrder(long uid, String name, String content);
}
