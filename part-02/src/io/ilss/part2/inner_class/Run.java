package io.ilss.part2.inner_class;

import io.ilss.part2.inner_class.PublicClass.PrivateClass;
/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午6:34
 */
public class Run {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.setUsername("usernameValue");
        publicClass.setPassword("passwordValue");
        System.out.println(publicClass.getUsername() + " " + publicClass.getPassword());
        PrivateClass privateClass = publicClass.new PrivateClass();
        privateClass.setAge("ageValue");
        privateClass.setAddress("addressValue");
        System.out.println(privateClass.getAge() + " " + privateClass.getAddress());
    }
}
