package Colas;

import java.security.Key;

public class CodigoCesar {
    public static void main(String[] args) {
        int[] key={5, 12, -3, 8, -9, 10};
        Integer keyValue;
        String enconded="";
        String decoded="";
        String message="This message will be Encripted";

        ArrayQueue<Integer> keyQueue1= new ArrayQueue<>();

        System.out.println("Original Message:"+message);
        for (int scan=0; scan<key.length; scan++) {
            keyQueue1.enqueue(new Integer(key[scan]));
        }
        for (int scan=0; scan<key.length; scan++){
            keyValue=keyQueue1.dequeue();
            enconded+=(char)((int) message.charAt(scan)+keyValue.intValue());
            keyQueue1.enqueue(keyValue);
        }
        System.out.println("Encode Message: "+ enconded);
    }
    }