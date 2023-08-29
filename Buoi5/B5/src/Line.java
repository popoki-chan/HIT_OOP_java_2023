
public class Line {
    private Point begin;
    private Point end;

    public Line(){

    }

    public Line(Point begin, Point end){
        this.begin = begin;
        this.end = end;
    }

    public Line(int x1, int y1, int x2, int y2){
        begin = new Point();
        this.begin.setX(x1);
        this.begin.setY(y1);
        end = new Point();
        this.end.setX(x2);
        this.end.setY(y2);
    }

    public void setBegin(Point begin){
        this.begin = begin;
    }
    public Point getBegin(){
        return begin;
    }

    public void setEnd(Point end){
        this.end = end;
    }
    public Point getEnd(){
        return end;
    }

    public double getLength(){
        return Math.sqrt(Math.pow(this.begin.getX() - (this.end.getX()),2) + Math.pow(this.begin.getY() - (this.end.getY()),2));
    }
    public static void main(String[] args) {

        Line a = new Line(1, 1, 2, 2);
        System.out.println("length: " + a.getLength());

        Point p1 = new Point();
        
    }
}


