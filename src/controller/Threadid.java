package controller;

	public class Threadid extends Thread {
		
		private int idThread;
		public Threadid(int idThread) {
			this.idThread = idThread;
			
	}
		@Override
		public void run() {
			System.out.println(idThread);
		}
}
