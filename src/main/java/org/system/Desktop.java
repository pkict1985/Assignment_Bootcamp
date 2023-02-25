/**
 * 
 */
package org.system;

/**
 * @author jayar
 *
 */
public class Desktop extends Computer{
	private void desktopSize() {
		System.out.println("Size of the Desktop");
	}
	public static void main(String[] args) {
		//Computer objC=new Computer();
		//objC.computerModel();
		
		//Single inheritance
		Desktop objD=new Desktop();
		objD.desktopSize();
		objD.computerModel();
		
	}
}
