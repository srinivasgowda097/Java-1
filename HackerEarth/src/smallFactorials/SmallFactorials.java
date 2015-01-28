package smallFactorials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmallFactorials {

	public static void main(String[] args) {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(
				System.in));
		String line;
		int count=0;
		try {
			while ((line = stdin.readLine()) != null && line.length() != 0) {
				if(count==0)
				if(Integer.parseInt(line)%2 == 0)
					System.out.println(line);
			
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
