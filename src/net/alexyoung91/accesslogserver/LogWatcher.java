package net.alexyoung91.accesslogserver;

class LogWatcher extends Thread {
	
	private Apache2AccessLog log;
	
	public running;
	
	public LogWatcher(Apache2AccessLog a_log) {
		log = a_log;
	}

    public void run() {
		running = true;
		while (running) {
			try {
				System.out.println("Watching...");
				log.read();
				Thread.sleep(100);
			} catch (InterruptedException e) {
				//
			}
		}
    }
}
