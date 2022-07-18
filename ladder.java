import java.io.*; 	
import java.util.*;
import java.util.stream.Collectors;


public class ladder {
	
	public static ArrayList<word> words = new ArrayList<>();
	public static HashMap<String, word> wordMap = new HashMap<>();

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		while(t-- > 0) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			ArrayList<String> strs = new ArrayList<String>();
			words = new ArrayList<>();
			int d = Integer.parseInt(st.nextToken());
			int q = Integer.parseInt(st.nextToken());
			for(int i=0; i<d; i++) strs.add(bf.readLine());
			initWords(strs);
			for(int i=0; i<q; i++) {
				st = new StringTokenizer(bf.readLine());
				word start = wordMap.get(st.nextToken());
				word end = wordMap.get(st.nextToken());
				System.out.println(bfs(start, end));
			}
		}
	}
	
	public static void initWords(ArrayList<String> strs) {
		for(String str : strs) {
			word word = new word(str);
			words.add(word);
			wordMap.put(str, word);
		}
		for(word cur : words) cur.moves = getMoves(cur);
	}
	
	public static int bfs(word start, word end) {
		ArrayDeque<word> possible = new ArrayDeque<>();
		HashSet<word> visited = new HashSet<>();
		possible.add(start);
		start.path = 0;
		while(!possible.isEmpty()) {
			word word = possible.removeFirst();
			if(word.word.equals(end.word)) return word.path;
			for(word m : word.moves) {
				int p = word.path+1;
				if(!visited.contains(m)) {
					m.path = p;
					possible.addLast(m);
					visited.add(m);
				}
			}
		}
		return -1;
	}
	
	public static List<word> getMoves(word word) {
		return words.stream()
				.filter(s -> canMove(s.word, word.word))
				.collect(Collectors.toList());
	}
	
	public static boolean canMove(String f, String s) {
		int c=0;
		for(int i=0; i<f.length(); i++) {
			if(f.charAt(i) != s.charAt(i)) c++;
			if(c>1) return false;
		}
		if(c==0) return false;
		return true;
	}

}

class word {
	public String word;
	public int path;
	public List<word> moves;
	public word(String w) {
		this.word = w;
		this.path = -1;
		this.moves = new ArrayList<word>();
	}
}