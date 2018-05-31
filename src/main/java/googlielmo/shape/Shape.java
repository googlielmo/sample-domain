package googlielmo.shape;

import java.io.Serializable;

/**
 *
 */
public abstract class Shape implements Serializable {

    public abstract double getArea();

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
