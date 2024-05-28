package modern.challenge;

import org.apache.bcel.Repository;
import org.apache.bcel.classfile.JavaClass;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        System.out.println("JDK 11 bytecode of Strings#concatViaPlus()");
        System.out.println("-----------------------------------------------------------");
        try {
            JavaClass objectClazz = Repository.lookupClass("modern.challenge.Strings");
            System.out.println(objectClazz.getMethod(Strings.class.getMethod(
                    "concatViaPlus", String.class, String.class, String.class, String.class)).getCode());
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("-----------------------------------------------------------");

        System.out.println();

        System.out.println("JDK 11 bytecode of Strings#concatViaStringBuilder()");
        System.out.println("-----------------------------------------------------------");
        try {
            JavaClass objectClazz = Repository.lookupClass("modern.challenge.Strings");
            System.out.println(objectClazz.getMethod(Strings.class.getMethod(
                    "concatViaStringBuilder", String.class, String.class, String.class, String.class)).getCode());
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("-----------------------------------------------------------");

        System.out.println();

        System.out.println("JDK 11 bytecode of Strings#concatListViaPlus()");
        System.out.println("-----------------------------------------------------------");
        try {
            JavaClass objectClazz = Repository.lookupClass("modern.challenge.Strings");
            System.out.println(objectClazz.getMethod(Strings.class.getMethod(
                    "concatListViaPlus", List.class)).getCode());
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("-----------------------------------------------------------");

        System.out.println();

        System.out.println("JDK 11 bytecode of Strings#concatListViaStringBuilder()");
        System.out.println("-----------------------------------------------------------");
        try {
            JavaClass objectClazz = Repository.lookupClass("modern.challenge.Strings");
            System.out.println(objectClazz.getMethod(Strings.class.getMethod(
                    "concatListViaStringBuilder", List.class)).getCode());
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("-----------------------------------------------------------");
    }
}
