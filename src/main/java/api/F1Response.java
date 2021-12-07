package api;

import java.util.Map;

public class F1Response {
	private String Responsebody;
	private int Responsecode;
	private Map<String,String>Responseheaders;
	public String getResponsebody() {
		return Responsebody;
	}

	public int getResponsecode() {
		return Responsecode;
	}

	public Map<String, String> getResponseheaders() {
		return Responseheaders;
	}

	

	public F1Response(String Responsebody, int Responsecode) {
		this.Responsebody=Responsebody;
		this.Responsecode=Responsecode;
		// TODO Auto-generated constructor stub
	}
	
}
