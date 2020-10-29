public class Triangle
{

  // Instance variables
  private Point v1, v2, v3;


  // Constructors

  public Triangle(Point a, Point b, Point c)
  {
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3)
  {
    // UM IDK
    v1 = new Point(x1, y1);
    v2= new Point(x2, y2);
    v3= new Point(x3, y3);


  }

  // Accessors


  public double getPerimeter()
  {
    double A = v1.distanceTo(v2);
    double B = v2.distanceTo(v3);
    double C = v3.distanceTo(v1);
    double PMeter = A + B + C;

    return PMeter;
  }
public static void main(String[] args) {
      double A = 0.0;
      Point p1 = new Point(1, 2);
      Point p2 = new Point(p1);
      Point p3 = new Point(8, 3);
      Point p4 = new Point(15, -3);

      Triangle t1 = new Triangle(p1, p3, p4);

      A = t1.getPerimeter();
      boolean ABC = (A== 31.156681016476867);
      System.out.println(ABC) ;
  }


/*
  public double getArea()
  { double A = distance(x1,y1,x2,y2);
    double B = distance(x2,y2,x3,y3);
    double C= distance(x3,y3,x1,y1);
    double semiP = perimeter(x1, y1, x2, y2, x3, y3)/2;
    double Herons_Area = Math.sqrt(semiP*(semiP-A)*(semiP-B)*(semiP-C));

    return Herons_Area;
  }
  public  String classify()
  {
    double A = distance(x1,y1,x2,y2);
    double B = distance(x2,y2,x3,y3);
    double C= distance(x3,y3,x1,y1);

    if (A==B && B == C)
    {
      return "equilateral";
    }
    if (A==B || B==C || C==A)
    {
      return "isosceles";
    }
    else
    {
      return "scalene";
    }

  }


*/
}
