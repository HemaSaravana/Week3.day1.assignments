package org.system;

public class Desktop extends Computer {
	
public void	desktopSize()	{
System.out.println("desktop size");	
}

public static void main(String[] args){
	Desktop desobj=new Desktop();
	desobj.computerModel();
	desobj.desktopSize();
}
}
