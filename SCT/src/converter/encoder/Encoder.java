package converter.encoder;

import java.util.Base64;

public class Encoder {
	private String string = "";
	
	/* Objects */
	private StringBuilder builder;
	
	/* Empty */
	public Encoder() {}
	
	public Encoder(String string) {
		this.string = string;
	}
	
	/* Setters and getters */
	public void setString(String string) { this.string = string; }
	public String getString() { return this.string; }
	
	/* Encoding methods -- 01 */
	public String string2Hexadecimal() {
		builder = new StringBuilder();
		
		for (int x = 0; x < this.string.getBytes().length; x++)
			builder.append(String.format("%x", this.string.getBytes()[x]));
		
		return builder.toString();
	}
	
	public String string2Binary() {
		builder = new StringBuilder();
		
		for (byte b: this.string.getBytes()) {
			int value = b;
			
			for (int x = 0; x < 8; x++) {
				builder.append((value & 128) == 0 ? 0 : 1);
				value <<= 1;
			}
			builder.append(' ');
		}
		
		return builder.toString();
	}
	
	public String string2Base64() {
		return Base64.getEncoder().encodeToString(this.string.getBytes());
	}
}
