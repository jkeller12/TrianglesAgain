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



  public double getArea()
  { double A = v1.distanceTo(v2);
    double B = v2.distanceTo(v3);
    double C = v3.distanceTo(v1);
    double semiP = getPerimeter()/2;
    double Herons_Area = Math.sqrt(semiP*(semiP-A)*(semiP-B)*(semiP-C));

    return Herons_Area;
  }

  public  String classify()
  {
    double A = Math.round(10000.0*(v1.distanceTo(v2)))/10000.0;

     double B =   Math.round(10000.0*(v2.distanceTo(v3)))/10000.0;

     double C =   Math.round(10000.0*(v3.distanceTo(v1)))/10000.0;

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

  public String toString()
  {
    return "v1(" + v1.getX() + ", " + v1.getY() +") "
    + "v2(" + v2.getX() + ", " + v2.getY() + ") "
    + "v3(" + v3.getX() + ", " + v3.getY()+")" ;
  }

  public void setVertex(int index, Point newP)
  {
    if (index == 0)
    {
      v1 = newP;
    }
    if (index == 1)
    {
      v2 = newP;
    }
    if (index == 2)
    {
      v3 = newP;
    }
  }




}
