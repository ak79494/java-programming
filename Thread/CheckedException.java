import java.io.*;
class CheckedException {
	public static void main(String[] args) {
		throws IOException
			FileReader file = new FileReader();
			BufferReader bf = new BufferReader();
			for(int counter = 0; counter<3; counter++)
				System.out.println(bf.readLine());
			bf.close();
			
	}
}