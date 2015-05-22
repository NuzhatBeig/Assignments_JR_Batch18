public class PerformanceTestingIfSwitch {
		public static void main(String[] args) {
        int age = 19;
		String name = (age > 18) ? "Adult" : "Child";
        long startTime , endTime = 0;
        
        startTime = System.currentTimeMillis();
        for(int i = 0 ; i < 50000; i++){
		if (age == 10) {
			name = "10";
		} else if (age == 11) {
			name = "11";
		} else if (age == 12) {
			name = "12";
		} else if (age == 13) {
			name = "13";
		} else if (age == 14) {
			name = "14";
		} else if (age == 15) {
			name = "15";
		} else if (age == 16) {
			name = "16";
		} else if (age == 17) {
			name = "17";
		} else if (age == 18) {
			name = "18";
		} else if (age == 19) {
			name = "19";
		} else if (age == 20) {
			name = "20";
		} else {
			name = "nothing";
		}
        }
   
		 endTime = System.currentTimeMillis();
		 System.out.println("If Else Performance "  + (endTime - startTime));
		 
		 
		 startTime = System.currentTimeMillis();
		 for( int i = 0 ; i < 50000; i++){
				switch (age) {
				case 12: {
					name = "12";
					break;
				}
				case 13: {
					name = "13";
					break;
				}
				case 14: {
					name = "14";
					break;
				}
				case 15: {
					name = "15";
					break;
				}
				case 16: {
					name = "16";
					break;
				}
				case 17: {
					name = "17";
					break;
				}
				case 18: {
					name = "18";
					break;
				}
				case 19: {
					name = "19";
					break;
				}
				case 20: {
					name = "20";
					break;
				}
				default: {
					name = "nothing";
					break;
				}
				}
		 }

				endTime = System.currentTimeMillis();
				System.out.println("Switch Performance"   +  (endTime - startTime));
		 
	}
		}

