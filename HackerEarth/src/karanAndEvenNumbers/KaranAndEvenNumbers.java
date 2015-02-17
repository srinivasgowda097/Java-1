package karanAndEvenNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KaranAndEvenNumbers {
	public static void main(String[] args) {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(
				System.in));
		String line;
		int count = 0;
		int t = 0;
		String[] A = null;
		try {
			while ((line = stdin.readLine()) != null && line.length() != 0 && !line.equals("-1")) {

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
