package io.ilss.part2.inner_static_class;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午7:11
 */
public class Run {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.setUsername("usernameValue");
        publicClass.setPassword("passwordValue");
        System.out.println(publicClass.getUsername() + " " + publicClass.getPassword());
        PublicClass.PrivateClass privateClass =new PublicClass.PrivateClass();
        privateClass.setAge("ageValue");
        privateClass.setAddress("addressValue");
        System.out.println(privateClass.getAge() + " " + privateClass.getAddress());
    }
}
