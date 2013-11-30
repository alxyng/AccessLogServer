import java.util.regex.*;

class LogEntry {
	private String raw;
	
	private String ip;
	private String time;
	private String request;
	private String response;
	private String bytesSent;
	private String referer;
	private String browser;
	
	public static final int NUM_FIELDS = 9;
	String logEntryPattern = "^([\\d.]+) (\\S+) (\\S+) \\[([\\w:/]+\\s[+\\-]\\d{4})\\] \"(.+?)\" (\\d{3}) (\\d+) \"([^\"]+)\" \"([^\"]+)\"";

	public LogEntry(String logEntryLine) {
		raw = logEntryLine;
		Pattern p = Pattern.compile(logEntryPattern);
		Matcher matcher = p.matcher(logEntryLine);
		//if (!matcher.matches() || NUM_FIELDS != matcher.groupCount()) {
		//  System.err.println("Bad log entry (or problem with RE?):");
		//  System.err.println(logEntryLine);
		//  return;
		//}
		
		//ip = matcher.group(1);
		//time = matcher.group(4);
		//request = matcher.group(5);
		//response = matcher.group(6);
		//bytesSent = matcher.group(7);
		//referer = matcher.group(8);
		//if (!matcher.group(8).equals("-"))
		//	System.out.println("Referer: " + matcher.group(8));
		//browser = matcher.group(9);
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
	
	public String getReferer() {
		return referer;
	}
	
	public String getBrowser() {
		return browser;
	}
}
