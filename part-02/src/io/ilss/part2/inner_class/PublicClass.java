package io.ilss.part2.inner_class;

/**
 * className PublicClass
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午6:33
 */
public class PublicClass {
    private String username;
    private String password;

    class PrivateClass {
        private String age;
        private String address;

        public PrivateClass() {
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void printPublicProperty() {
            System.out.println(username + " " + password);
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
