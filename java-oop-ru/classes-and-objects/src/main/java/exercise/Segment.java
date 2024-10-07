package exercise;

// BEGIN
public class Segment {
  private Point beginPoint;
  private Point endPoint;

  public Segment(Point start, Point end) {
    this.beginPoint = start;
    this.endPoint = end;
  }
  
  public Point getBeginPoint() {
    return beginPoint;
  }
  
  public Point getEndPoint() {
    return endPoint;
  }

  public Point getMidPoint() {
    int midX = (endPoint.getX() + beginPoint.getX()) / 2;
    int midY = (endPoint.getY() + beginPoint.getY()) / 2;

    return new Point(midX, midY);
  }
}
// END

