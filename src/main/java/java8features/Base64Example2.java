package main.java.java8features;

import java.util.Base64;

public class Base64Example2 {

    public static void main(String[] args) {

        Base64.Encoder encoder = Base64.getUrlEncoder();
        String url = encoder.encodeToString("http://www.example.com".getBytes());
        System.out.println("Encoded url: " + url);

        Base64.Decoder decoder = Base64.getUrlDecoder();
        String decodedUrl = new String(decoder.decode(url));
        System.out.println("Decoded url: " + decodedUrl);

    }

}
