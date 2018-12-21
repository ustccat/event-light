package net.michael_j.ddd.service.application.service.impl;

import net.michael_j.ddd.service.application.service.OrderService;
import net.michael_j.ddd.service.core.order.OrderCreatedEvent;
import net.michael_j.ddd.service.core.shared.DomainEventPublisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    private static Logger LOG = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Override
    public void createOrder(long uid, String name, String content) {
        LOG.info("user:{} create order:{}-{}.", uid, name, content);
        DomainEventPublisher.publish(new OrderCreatedEvent(name, content));
    }
}

