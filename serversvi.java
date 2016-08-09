import java.io.*;

import java.net.*;

class serversvi

{

public static void main(String svi[])throws IOException

{

try

{

ServerSocket servsock=new ServerSocket(105);

DataInputStream dis=new DataInputStream(System.in);

System.out.println("enter the file name");

String fil=dis.readLine();

System.out.println(fil+" :is file transfer");

File myfile=new File(fil);

while(true)

{

Socket sock=servsock.accept();

byte[] mybytearray=new byte[(int)myfile.length()];

BufferedInputStream bis=new BufferedInputStream(new FileInputStream(myfile));

bis.read(mybytearray,0,mybytearray.length);

OutputStream os=sock.getOutputStream();

os.write(mybytearray,0,mybytearray.length);

os.flush();

sock.close();

}

}


catch(Exception saranvi)

{

System.out.print(saranvi);

}

}

}
