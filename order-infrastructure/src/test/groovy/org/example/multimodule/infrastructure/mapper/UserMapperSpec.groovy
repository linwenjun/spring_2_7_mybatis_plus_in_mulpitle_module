package org.example.multimodule.infrastructure.mapper

import org.example.multimodule.order.infrastructure.persistent.mapper.UserMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.jdbc.Sql

class UserMapperSpec extends BasicMapperSpec{

    @Autowired
    UserMapper userMapper;

    @Sql("/fixture/insert_user_n_order.sql")
    def "should get user by id"() {
        when:
        def user = userMapper.selectById(1);

        then:
        user.id == 1L;
    }

    @Sql("/fixture/insert_user_n_order.sql")
    def "should get all users"() {
        when:
        def user = userMapper.selectAllUsers();

        then:
        user.size() == 2;
    }
}
