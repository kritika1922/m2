import java.util.Scanner;

class CircleCalculation {
	double area;
	double perimeter;

	void circle(double r) {

		area = (22 * r * r) / 7;
		perimeter = (22 * 2 * r) / 7;

	}
}

interface RectaangleCalculation {
	void rectangle(double l, double b);
}

class AreaOfCircle extends CircleCalculation implements RectaangleCalculation {
	double ar, per;

	public void rectangle(double l, double b) {

		ar = l * b;
		per = 2 * (l + b);
	}

	public static void main(String args[]) {
		try {
			Scanner s = new Scanner(System.in);
			String shape;
			System.out.println("Enter Shape");
			shape = s.nextLine();
			 
			
			if (shape.isEmpty()) {
				String mess = "shape can not be Empty";
				OwnException ow = new OwnException(mess);
				throw ow;
			}
			AreaOfCircle a = new AreaOfCircle();

			while (true) {

				switch (shape) {
				case "Circle":
					System.out.println("Enter the radius:");
					double rad = s.nextDouble();
					a.circle(rad);
					System.out.println("Area of Circle is: " + a.area);
					System.out.println("Perimeter of Circle] is: " + a.perimeter);

					break;
				case "Rectangle":
					System.out.println("Enter the height and weight:");
					double lb = s.nextDouble();
					double hb = s.nextDouble();
					a.rectangle(lb, hb);
					System.out.println("Area of Circle is: " + a.ar);
					System.out.println("Perimeter of Circle] is: " + a.per);
					break;
				// case 3: continue;
				case "NO":
					System.exit(0);
				default:
					System.out.println("Invalid grade\n");
					break;

				}

				System.out.println("do you want to again press whatever you want");
				shape = s.nextLine();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

