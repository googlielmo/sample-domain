package googlielmo.executor;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.HazelcastInstanceAware;
import com.hazelcast.core.IMap;
import googlielmo.shape.Rectangle;

import java.io.Serializable;
import java.util.concurrent.Callable;

/**
 *
 */
public class Area implements Callable<Double>, Serializable, HazelcastInstanceAware {

    private transient HazelcastInstance hz;

    public void setHazelcastInstance(HazelcastInstance hz) {
        this.hz = hz;
    }

    public Double call() throws Exception {
        IMap<String, Rectangle> map = hz.getMap("native-map");
        double result = 0;
        for (String key : map.localKeySet()) {
            result += map.get(key).getArea();
        }
        return result;
    }
}
