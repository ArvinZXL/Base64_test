package a.b.c;

import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;

public class BaseCode {

	public static void main(String[] args) {
		Base64 bs = new Base64();
		try {
			String result = new String(bs.encode("20140324171017839603".getBytes("ASCII")),
					"ASCII");
			System.out.println(result);
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
