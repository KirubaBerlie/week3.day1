package org.system;


public class Desktop extends Computer
{

	public void desktopSize(int a, int b)

	{
		System.out.println("My desktop size is :" +a +"x" +b);
		}


public static void main(String[] args) {
	Desktop desk =  new Desktop();
	desk.computerModel("Dell Inspiron 3268");
	desk.desktopSize(1600, 1200);

}
}