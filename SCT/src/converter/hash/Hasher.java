package converter.hash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hasher {
	private String string = "";
	
	/* Objects */
	
	/* Empty */
	public Hasher() {}
	
	public Hasher(String string) {
		this.string = string;
	}
	
	/* Setters and getters */
	public void setString(String string) { this.string = string; }
	
	public String getString() { return this.string; }
	
	/* Hashing methods */
	public String string2MD2() throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("MD2");
		md.update(this.string.getBytes());
		
		return md.digest().toString();
	}
	
	public String string2MD5() throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(this.string.getBytes());
		
		return md.digest().toString();
	}
	
	public String string2SHA() throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA");
		md.update(this.string.getBytes());
		
		return md.digest().toString();
	}
	
	public String string2SHA224() throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-224");
		md.update(this.string.getBytes());
		
		return md.digest().toString();
	}
	
	public String string2SHA256() throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(this.string.getBytes());
		
		return md.digest().toString();
	}
	
	public String string2SHA384() throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-384");
		md.update(this.string.getBytes());
		
		return md.digest().toString();
	}
	
	public String string2SHA512() throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-512");
		md.update(this.string.getBytes());
		
		return md.digest().toString();
	}
}
