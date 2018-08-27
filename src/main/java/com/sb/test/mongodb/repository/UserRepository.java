package com.sb.test.mongodb.repository;

import com.sb.test.mongodb.pojo.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: spring-boot-mongodb
 * @package: com.sb.test.mongodb.repository
 * @email: cy880708@163.com
 * @date: 2018/8/27 下午2:58
 * @mofified By:
 */
public interface UserRepository extends MongoRepository<User, String> {

    User findByName(String name);

}
