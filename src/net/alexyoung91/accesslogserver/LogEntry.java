package net.alexyoung91.accesslogserver;

class LogEntry {
	private String raw;
	
	private String ip;
	private String time;
	private String request;
	private String response;
	private String bytesSent;

	public LogEntry(String logEntryLine) {
		raw = logEntryLine;
		
		ip = raw.split("\\s+")[0];
		time = raw.split("[")[1].split("]")[0];
		request = raw.split("\"")[1];
		response = raw.split("\\s+")[8];
		bytesSent = raw.split("\\s+")[9];
	}
	
	public String getRaw() {
		return raw;
	}
	
	public String getIP() {
		return ip;
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
}
