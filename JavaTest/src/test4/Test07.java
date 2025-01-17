package test4;

import java.util.Set;

public class Test07 {
	public static void main(String[] args) {
		
		for(int count=1; count <=5; count++) {
			
			for (int count=1; count <=5; count++) {
				System.out.println(makeLotto());
			}
		}
		
		public static Set<Integer> makeLotto() {
			
			Set<Integer> lottoSet = new HashSet<>();
			
			for (;;) {
				int num = (int) Math.ceilDiv(Math.random() * 45);
				
				lottoSet.add(num);
				
				if(lottoSet.size() == 6) {
					break;
				}
			}
			
			// 정렬을 위해 TreeSet 사용
			Set<Integer> treetSet = new TreeSet<>(lottoSet);
			
			return treeSet;
		
		}
	
}
