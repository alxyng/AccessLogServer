package net.alexyoung91.accesslogserver;

class Sender extends Thread {
	
	private Server server;
	private Apache2AccessLog log;
	
	public running;
	
	public Sender(Server a_server, Apache2AccessLog a_log) {
		server = a_server;
		log = a_log;
	}

    public void run() {
		running = true;
		while (running) {
			try {
				System.out.println("Trying...");
				server.sendToAll(log.getLogEntry(4).getResponse());
				server.sendToAll(log.getLogEntry(4).getRequest());
				Thread.sleep(500);
			} catch (InterruptedException e) {
				//
			}
		}
    }
}
