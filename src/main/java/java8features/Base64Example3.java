package main.java.java8features;

import java.util.Base64;

/**
 * Created by Darush on 7/23/2018.
 */
public class Base64Example3 {

    public static void main(String[] args) {

        // Get MIME encoder
        Base64.Encoder encoder = Base64.getMimeEncoder();
        String message = "Hello, \nHow are you?";
        String encodedStr = encoder.encodeToString(message.getBytes());
        System.out.println("Encoded MIME message: " + encodedStr);

        // Get MIME decoder
        Base64.Decoder decoder = Base64.getMimeDecoder();
        String decodedStr = new String(decoder.decode(encodedStr));
        System.out.println(decodedStr);

    }

}
