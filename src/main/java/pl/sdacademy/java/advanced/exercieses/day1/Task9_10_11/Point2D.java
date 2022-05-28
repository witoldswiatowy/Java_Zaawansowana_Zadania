package pl.sdacademy.java.advanced.exercieses.day1.Task9_10_11;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
public class Point2D implements Movable, Resizable {
    double x;
    double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point2D point2D = (Point2D) o;
        return Double.compare(point2D.x, x) == 0 && Double.compare(point2D.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public void move(MoveDirection moveDirection) {
        x += moveDirection.getX();
        y += moveDirection.getY();
    }

    @Override
    public void resize(double resizeFactor) {
        x += resizeFactor;
        y += resizeFactor;
    }
}
