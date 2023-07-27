public class Point {
    private int x;
    private int y;

    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX(){return x;}
    public void setX(int x){this.x=x;}
    public int getY(){return y;}
    public void setY(int y){this.y=y;}

    public double distance(){
        return Math.sqrt(Math.pow((this.x-0),2)+Math.pow((this.y-0),2));
    }
    public double distance(int secondX,int secondY){
        return Math.sqrt(Math.pow((this.x-secondX),2)+Math.pow((this.y-secondY),2));
    }
    public double distance(Point s){
        if( s!=null) {
            return Math.sqrt(Math.pow((this.x - s.x), 2) + Math.pow((this.y - s.y), 2));
        }
        return distance();
    }


@Override
    public String toString() {
    return String.format("x: %d, y: %d",x,y);
}



}
