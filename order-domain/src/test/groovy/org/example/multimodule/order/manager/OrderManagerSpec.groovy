package org.example.multimodule.order.manager

import org.example.multimodule.order.client.SkuClient
import org.example.multimodule.order.domain.Order
import spock.lang.Specification

class OrderManagerSpec extends Specification {

    def "should assemble order code"() {
        given:
        def client = Mock(SkuClient);
        client.getCodeByName(_) >> "abc";
        def manager = new OrderManager(client);
        def order = new Order();

        when:
        manager.assembleOrderInfo(order);

        then:
        order.getCode() == "abc"

    }
}
