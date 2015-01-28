package shinzen;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class skxSolution {
	public static void main(String[] args) {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(
				System.in));
		String line;
		int count = 0;
		int t = 0;
		String[] A = null;
		try {
			while ((line = stdin.readLine()) != null && line.length() != 0) {
				if (count == 0) {
					// not of any use
					t = Integer.parseInt(line);
					
				} else if (1== count) {
					A = line.split(" ");
				}
				else if(2 == count){
					
				}
				else{
					// main logic will go here
					String [] query = line.split(" ");
					int src=Integer.parseInt(query[0])-1;
					int length=Integer.parseInt(query[1])-(Integer.parseInt(query[0])-1);
					int countE=0;
					int countN=0;
					int max=0;
					boolean isEqual=false;
					for (int i = src; i < src+length; i++) {
						if (A[i].equals(query[2])) {
							countE++;
							isEqual=true;
						} else {
							if(Integer.parseInt(A[i])>max)
								max=Integer.parseInt(A[i]);
						}
					}
					if(isEqual){
						System.out.println(query[2]+" "+countE);	
					}
					
					else{
						for (int i = src; i < src+length; i++) {
							if (A[i].equals(Integer.toString(max))) {
								countN++;
							} 
						}
						System.out.println(max+" "+countN);	
					}
				}
				count++;
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
