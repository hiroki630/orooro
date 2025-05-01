public class TestData {

	private int Data[];

	void setData(int n) {
		Data = new int [n];
	}

	void dataInput() {
		for(int i=0;i<Data.length;i++) {
			Data[i]=new java.util.Scanner(System.in).nextInt();
		}
	}

	int dataMax() {
		int max = Data[0];
		for(int i=1;i<Data.length;i++) {
			if(max<Data[i]) {
				max = Data[i];
			}
		}
		return max;		
	}

	int dataMin() {
		int min = Data[0];
		for(int i=1;i<Data.length;i++) {
			if(min>Data[i]) {
				min = Data[i];
			}
		}
		return min;
	}























	void dataDESC() {
		int work;
		for(int i=0;i<Data.length;i++) {
			for(int j=i+1;j<Data.length;j++) {
				if(Data[i]<Data[j]) {
					work = Data[i];
					Data[i] = Data[j];
					Data[j] = work;
				}
			}
		}
	}

	void dataPrint() {
		for(int i=0;i<Data.length;i++) {
			System.out.println(""+i+"番目のデータ : "+Data[i]);
		}
		
	}

}
