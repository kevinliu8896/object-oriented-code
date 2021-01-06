import java.awt.Point;

public class Robot {
    int direction;
    Point location;

    public Robot(Point location, int direction) {
        this.location = location;
        this.direction = direction;
    }

    public void turnLeft() {

        if (direction <= 0) {
            direction = 3;
        } else {
            direction--;
        }

    }

    public void turnRight() {

        if (direction >= 3) {
            direction = 0;
        } else {
            direction++;
        }

    }

    public void move() {
        int direction = this.direction;
        int x = this.location.x;
        int y = this.location.y;
        switch (direction) {
            case 0:
                y--;
                break;
            case 1:
                x++;
                break;
            case 2:
                y++;
                break;
            case 3:
                x--;
                break;


        }
        this.location.move(x, y);

    }

    public Point getLocation() {
//        System.out.println("Location: " + location.x + ", " + location.y);
        return location;
    }

    public String getDirection() {
        if (direction == 0) {
            return "N";
        }
        if (direction == 1) {
            return "E";
        }
        if (direction == 2) {
            return "S";
        }
        if (direction == 3) {
            return "W";
        }

        return null;


    }


}
