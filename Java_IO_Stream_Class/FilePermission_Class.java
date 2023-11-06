package Advance_Java.Java_IO_Stream_Class;

import java.io.FilePermission;
import java.security.Permission;
import java.security.PermissionCollection;

public class FilePermission_Class {
    public static void main(String[] args) {
        String str = "D:\\FP\\AB.txt";
        FilePermission fp = new FilePermission("D:\\FP\\-", "read");
        PermissionCollection premission = fp.newPermissionCollection();
        premission.add(fp);
        FilePermission fp2 = new FilePermission(str, "write");
        premission.add(fp2);
        if(premission.implies(new FilePermission(str, "write,read"))){
            System.out.println("Read, Write permission is granted for the path "+str );
        }else {
            System.out.println("No Read, Write permission is granted for the path "+str);
        }
    }
}
