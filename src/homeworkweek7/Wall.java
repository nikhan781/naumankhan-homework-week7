package homeworkweek7;
// Wall Area

public class Wall {
    double width;
    double height;

    public Wall() {

    }


    public Wall(double width1, double height1) {
        if (width1 < 0) {
            this.width = 0;
        } else {
            this.width = width1;
        }

        if (height1 < 0) {
            this.height = 0;
        } else {
            this.height = height1;
        }


    }

    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }

    double getWidth() {
        return width;
    }


    double getHeight() {
        return height;

    }

    void setWidth(double a) {
        if (a < 0) {
            this.width = 0;
        } else {
            this.width = a;
        }

    }


    void setHeight(double b){
        if (b<0) {
            this.height = 0;
        } else {
            this.height=b;

        }
    }
    double getArea(){
        double area1 = width*height;
        return area1;

    }


}
