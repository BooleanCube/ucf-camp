import java.io.*;
import java.util.*;

public class error {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		while(t-- > 0) {
			int n = Integer.parseInt(bf.readLine());
			HashSet<String> ids = new HashSet<>();
			boolean passed = true;
			for(int i=0; i<n; i++) {
				StringTokenizer st = new StringTokenizer(bf.readLine());
				String id = st.nextToken();
				int tle = Integer.parseInt(st.nextToken());
				int fb = Integer.parseInt(st.nextToken());
				int sb = Integer.parseInt(st.nextToken());
				if(fb%10 != 0 || sb%10 != 0) passed = false;
				if(fb<=0 || sb<=0) passed = false;
				if(fb+sb != 100) passed = false;
				if(tle <= 0 || tle > 30) passed = false;
				if(ids.contains(id)) passed = false;
				ids.add(id);
			}
			if(passed) System.out.println("Correct!");
			else System.out.println("Internal Error (response 0)");
		}
	}

}
