// 문제 : 구구단을 만들어주세요
// 출력양식
/*
== 2단 ==
2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
...
== 9단 ==
9 * 1 = 9
...
9 * 9 = 81
*/

class Main {
  public static void main(String[] args) {
    new 구구단출력기().작동();
  }
}

class 구구단출력기 {

	// 구현시작
	public void 작동() {
		
		
		for(int i = 2; i < 10; i++ ){
//			System.out.println("==" + i +"단 ==");
			System.out.printf("==%s 단==\n", i);
//		} 여기에 하면 밑에서 i를 쓸수가 없음. i 선언 유효가 끝나니까.
		
		
		for(int j = 1; j < 10; j++ ) {
		System.out.println( i + "*" + j + " = " + i * j);
		
	}
		}
  // 구현끝
}
}

//답
//class 구구단출력기 {
//	  void 작동() {
//	    int dan = 2;
//
//	    while ( dan <= 9 ) {
//	      System.out.println("== " + dan + "단 ==");
//	      
//
//	      int i = 1;
//
//	      while ( i <= 9 ) {
//	        System.out.println(dan + " * " + i + " = " + dan * i);
//	        i++;
//	      }
//
//	      dan++;
//	    }
//	  }
//	}
//
//
