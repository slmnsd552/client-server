import java.io.*;

import java.net.*;

class clientsvi

{

public static void main(String svi[])throws IOException

{

try

{

Socket sock=new Socket("localhost",105);

byte[] bytearray=new byte[1024];

InputStream is=sock.getInputStream();

DataInputStream dis=new DataInputStream(System.in);

System.out.println("enter the file name");

String fil=dis.readLine();

FileOutputStream fos=new FileOutputStream(fil);

BufferedOutputStream bos=new  BufferedOutputStream(fos);

int bytesread=is.read(bytearray,0,bytearray.length);

bos.write(bytearray,0,bytesread);

System.out.println("out.txt file is received");

bos.close();

sock.close();

}

catch(Exception SVI)

{

System.out.print(SVI);

}

}

}