package com.sb.test.mongodb.pojo;

import org.springframework.data.annotation.Id;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: spring-boot-mongodb
 * @package: com.sb.test.mongodb.pojo
 * @email: cy880708@163.com
 * @date: 2018/8/27 下午2:55
 * @mofified By:
 */
public class User {

    //id属性是给mongodb用的，用@Id注解修饰
    @Id
    private String id;
    private String name;
    private int age;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

}
