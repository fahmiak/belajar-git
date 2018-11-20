package Logic3.Materi;

public class FiboKotak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//var
		Integer n = 9;
		String[][] pola = new String [n][n];
		
		//Fibo
		Integer [] bilFibo = new Integer[n];
		Integer a = 1;
		Integer b = 0;
		Integer c = 0;
		for (int i = 0; i < bilFibo.length; i++) {
			c = a + b;
			bilFibo[i] = c;
			a = b;
			b = c;
		}
		Integer idxFibo = 0;
		Integer nlayer = n;
		//pola
		for (int layer = 0; layer < nlayer; layer++) {
			Integer iAwal = layer;
			Integer jAwal = layer;
			Integer iAkhir = n-layer;
			Integer jAkhir = n-layer;
			for (int i = iAwal; i < iAkhir; i++) {
				for (int j = jAwal; j < jAkhir; j++) {				
					pola[i][j] = String.valueOf(bilFibo[idxFibo]);
				}
			//akhir kolom j	
			}
			//akhir baris i
			idxFibo++;
		}
		
		
		
		//print
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%3s", pola[i][j]);
			}
			System.out.println();
		}
	}

}
