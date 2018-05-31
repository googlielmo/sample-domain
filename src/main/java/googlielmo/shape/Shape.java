package googlielmo.shape;

import java.io.Serializable;

/**
 *
 */
public abstract class Shape implements Serializable {

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
