package net.michael_j.ddd.service.application.listener;

import net.michael_j.ddd.service.core.order.OrderCreatedEvent;
import net.michael_j.ddd.service.core.shared.DomainEventPublisher;
import net.michael_j.ddd.service.core.shared.DomainEventSubscriber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class OrderListener implements DomainEventSubscriber<OrderCreatedEvent> {

    private static Logger LOG = LoggerFactory.getLogger(OrderListener.class);

    @PostConstruct
    public void init() {
        DomainEventPublisher.subscribe(OrderCreatedEvent.class, this);
    }

    @Override
    public void handle(OrderCreatedEvent event) {
        LOG.info("received order created event:{}.", event);
    }
}
