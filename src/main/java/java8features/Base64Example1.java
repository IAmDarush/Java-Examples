package main.java.java8features;

import java.util.Base64;

public class Base64Example1 {

    public static void main(String[] args) {

        Base64.Encoder encoder = Base64.getEncoder();

        // Encode byte array
        byte byteArray1[] = {1, 2};
        byte byteArray1Encoded[] = encoder.encode(byteArray1);
        System.out.println("Encoded byte array: " + byteArray1Encoded);

        byte byteArray3[] = new byte[5];
        int bytesWritten = encoder.encode(byteArray1, byteArray3);
        System.out.println("Encoded byte array written to another array: " + byteArray3);
        System.out.println("Number of bytes written: " + bytesWritten);

        // Encode String
        String str = encoder.encodeToString("Hello, World!".getBytes());
        System.out.println("Encoded string: " + str);

        // Decoder
        Base64.Decoder decoder = Base64.getDecoder();

        // Decode String
        String strDecoded = new String(decoder.decode(str));
        System.out.println("Decoded string: " + strDecoded);

    }

}
