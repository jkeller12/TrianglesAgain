public class Point{
  public double x, y;



  //construct a point given coordinates



  public Point(double X, double Y)
  {
    x=X;
    y=Y;
  }

  public Point(Point p)
  {
    x = p.x;
    y= p.y;
  }

  public double getX()
  {

    return x;
  }

  public double getY()
  {
    return y;
  }


  public double distanceTo(Point other)
  {
    double Dx = Math.abs(other.x - getX());
    double Dy = Math.abs(other.y - getY());
    double Answer = Math.sqrt((Dx*Dx) + (Dy*Dy));
    return Answer;


  }

  public boolean equals(Point other)
  {
    if (other != null && (other.x == getX() && other.y == getY()))
    {
      return true;
    }
    return false;

  }




}
