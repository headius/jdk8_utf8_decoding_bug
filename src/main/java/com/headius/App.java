package com.headius;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws Exception {
        byte[] bytes = {(byte)0xEF, 0x40};
        CharsetDecoder decoder = Charset.forName("Shift-JIS").newDecoder();
        System.out.println(decoder.decode(ByteBuffer.wrap(bytes), CharBuffer.allocate(20), false));
    }
}
