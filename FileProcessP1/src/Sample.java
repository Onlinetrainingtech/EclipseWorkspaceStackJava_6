import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

class Demo
{
	void writeProcess() throws IOException
	{
		try
		{
			FileOutputStream fos=new FileOutputStream("D:\\f1.txt");
			String s1="mohamed";
			byte b[]=s1.getBytes();
			fos.write(b);
			System.out.println("Inserted..");
		}
		catch(FileNotFoundException t)
		{
			System.out.println(t);
		}
	}
	void readProcess() throws IOException
	{
		try
		{
			FileInputStream fis=new FileInputStream("D:\\f1.txt");
			FileOutputStream f1=new FileOutputStream("D:\\f2.txt");
			int i;
			while((i=fis.read())!=-1)
			{
				f1.write((byte)i);
				//System.out.print((char)i);
			}
		}
		catch(FileNotFoundException t)
		{
			System.out.println(t);
		}
	}
	void sequenceRead() throws IOException
	{
		try
		{
			FileInputStream f1=new FileInputStream("D:\\f1.txt");
			FileInputStream f2=new FileInputStream("D:\\f2.txt");
			SequenceInputStream sis=new SequenceInputStream(f1,f2);
			FileOutputStream f3=new FileOutputStream("D:\\f3.txt");
			int i;
			while((i=sis.read())!=-1)
			{
				 f3.write((byte)i);
				//System.out.print((char)i);
			}
		}
		catch(FileNotFoundException t)
		{
			System.out.println(t);
		}
	}
}
public class Sample {

	public static void main(String[] args) throws IOException {
		
		Demo f1=new Demo();
		//f1.writeProcess();
		//f1.readProcess();
		f1.sequenceRead();

	}

}
