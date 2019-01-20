package io.ilss.part6.singleton_7_1;

import java.io.*;

/**
 * className SaveAndRead
 * description SaveAndRead
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 12:43
 */
public class SaveAndRead {
    public static void main(String[] args) {
        try {
            MyObject object1 = MyObject.getInstance();
            FileOutputStream out = new FileOutputStream(new File("myObjectFile.txt"));
            ObjectOutputStream outObject = new ObjectOutputStream(out);
            outObject.writeObject(object1);
            outObject.close();
            out.close();
            System.out.println(object1.hashCode());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream in = new FileInputStream(new File("myObjectFile.txt"));
            ObjectInputStream inObject = new ObjectInputStream(in);
            MyObject object2 = (MyObject) inObject.readObject();
            inObject.close();
            in.close();
            System.out.println(object2.hashCode());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
