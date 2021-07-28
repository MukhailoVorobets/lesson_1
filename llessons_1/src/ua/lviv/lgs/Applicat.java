package ua.lviv.lgs;

public class Applicat {
	public static void main(String[] args) {
	boolean t = true;
	char c = 'c';
	byte b = 2;
	short s = 2;
	int in = 2;
	long l = 2l;
	float f = 2.2f;
	double d = 2.2;
	System.out.println("Максималтьне значення типу Imteger = " + Integer.MAX_VALUE);
	System.out.println("Мінімальне значення типу Imteger = " + Integer.MIN_VALUE);
	System.out.println("Максималтьне значення типу Byte = " + Byte.MAX_VALUE);
	System.out.println("Мінімальне значення типу Byte = " + Byte.MIN_VALUE);
	System.out.println("Максималтьне значення типу Short = " + Short.MAX_VALUE);
	System.out.println("Мінімальне значення типу Short = " + Short.MIN_VALUE);
	System.out.println("Максималтьне значення типу Long = " + Long.MAX_VALUE);
	System.out.println("Мінімальне значення типу Long = " + Long.MIN_VALUE);
	System.out.println("Максималтьне значення типу Float = " + Float.MAX_VALUE);
	System.out.println("Мінімальне значення типу Float = " + Float.MIN_VALUE);
	System.out.println("Максималтьне значення типу Double = " + Double.MAX_VALUE);
	System.out.println("Мінімальне значення типу Double = " + Double.MIN_VALUE);
    int x = 0;
    boolean isSorted = false;
    int[] numbers = new int[] {345,5345,3452,654,3452,32556,243556,23546,24567,876};
    while(!isSorted) {
        isSorted = true;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                isSorted = false;
                x = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = x;
            }
        }
    }
        System.out.println(numbers[0]+" найменше число");
        System.out.println(numbers[9]+" найбільше число");
	}

}
