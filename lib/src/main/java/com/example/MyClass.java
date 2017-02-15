package com.example;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

public class MyClass {


    public static void main(String[] arg0) {
        try {
            RSAUtil rsa = new RSAUtil();
            String str = "yanzi1225627";
            RSAPublicKey pubKey = rsa.getRSAPublicKey();

            RSAPrivateKey priKey = rsa.getRSAPrivateKey();
            byte[] enRsaBytes = rsa.encrypt(pubKey, str.getBytes());
            String enRsaStr = new String(enRsaBytes, "UTF-8");
            System.out.println("jiami==" + enRsaStr);
            System.out.println("jiemi==" + new String(rsa.decrypt(priKey, rsa.encrypt(pubKey, str.getBytes()))));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

}
