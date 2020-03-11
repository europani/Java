package practice;

public class RankAlgorithm {

	public static void main(String[] args) {
		
		int[] scores = { 50, 34, 57, 100, 94 };
		int[] Rank = new int[scores.length];
		
		for (int i = 0; i < Rank.length; i++) {
			Rank[i] = 1;
			for (int j = 0; j < Rank.length; j++) {
				if (scores[i]< scores[j]) {
					Rank[i]++;
				}
			}
		}
		
		for (int i = 0; i < Rank.length; i++) {
			System.out.println(scores[i] + "점의 순위는 : " + Rank[i] + "등 입니다.");
		}
	
	
	}
}
