class LogEntry {
	private String ip;
	private String time;
	private String request;
	private String response;
	private String bytesSent;
	private String referer;

	public LogEntry(String line) {

	}
	
	public String getIP() {
		return ip
	}
	
	public String getTime() {
		return time;
	}
	
	public String getRequest() {
		return request;
	}
	
	public String getResponse() {
		return response;
	}
	
	public String getBytesSent() {
		return bytesSent;
	}
	
	public String getReferer() {
		return referer;
	}
}
