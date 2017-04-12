package rmuti.lab02;

import rmuti.lab02.App;
import rmuti.lab02.ArraysList;

/**
 * Hello world!
 *
 */
public class App 
{
	int num1 = 1;
	int num2 = 2;
	char ch1 = 'a';
	char ch2 = 'b';

	char insert = 'c';

	public static void main(String[] args) {
		App app = new App();
		ArraysList testArr = new ArraysList();

	
		testArr.add(app.num1);
		testArr.add(app.num2);
		testArr.add(app.ch1);
		testArr.add(app.ch2);
		System.out.print(testArr.elementData[0]);
		System.out.print(testArr.elementData[1]);
		System.out.print(testArr.elementData[2]);
		System.out.print(testArr.elementData[3]);

		System.out.println();
	
		testArr.add(2, app.insert); 
									
		System.out.print(testArr.elementData[0]);
		System.out.print(testArr.elementData[1]);
		System.out.print(testArr.elementData[2]);
		System.out.print(testArr.elementData[3]);
		System.out.print(testArr.elementData[4]);

		System.out.println();

		System.out.print(testArr.elementData.length);
	}
}