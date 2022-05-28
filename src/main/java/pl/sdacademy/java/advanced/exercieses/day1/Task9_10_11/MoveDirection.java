package pl.sdacademy.java.advanced.exercieses.day1.Task9_10_11;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
public class MoveDirection {
    double x;
    double y;

    public MoveDirection(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MoveDirection that = (MoveDirection) o;
        return Double.compare(that.x, x) == 0 && Double.compare(that.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
