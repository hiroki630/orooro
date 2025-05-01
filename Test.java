import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException{
		TestData testdata = new TestData();
		System.out.println("Test データを入力してください");
		testdata.setData(5);
		testdata.dataInput();
		System.out.println("最大値："+ testdata. dataMax());
		System.out.println("最小値："+ testdata. dataMin());
		testdata.dataDESC();
		testdata.dataPrint();
	}
}
