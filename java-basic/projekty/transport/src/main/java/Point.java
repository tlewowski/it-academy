import java.util.Comparator;
import java.util.List;

public class Point {
    String name;
    int x;
    int y;
    public Point(int i, int i1, String p2) {
        this.name = p2;
        this.x = i;
        this.y = i1;
    }

    public Point(String s) {
        String [] Parts = s.split(" ");
        this.name = Parts[0];
        this.x = Integer.parseInt(Parts[1]);
        this.y = Integer.parseInt(Parts[2]);



    }

    public int getX() {
        return x;

    }

    public int getY() {
        return y;
    }

    public String getName() {
        return name;
    }

    public int odleglosc(Point b) {
        //x -x + y - y;
      return  Math.abs((this.x - b.getX()))+Math.abs(this.y - b.getY());
    }

    public int closest(List<Point> list) {
        return list.stream().map(p-> p.odleglosc(this))
                .min(Integer::compareTo).get();

    }
}
