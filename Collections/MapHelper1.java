package Collections;

import java.util.Map;

public class MapHelper1 implements Runnable {
    Map<String, Integer> map;

    MapHelper1(Map<String, Integer> map) {
        this.map = map;
        new Thread(this, "MapHelper1").start();
    }

    @Override
    public void run() {
        map.put("One", 1);
        try {
            System.out.println("MapHelper1 Sleeping");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class MapHelper2 implements Runnable {
    Map<String, Integer> map;

    MapHelper2(Map<String, Integer> map) {
        this.map = map;
        new Thread(this, "MapHelper2").start();
    }

    @Override
    public void run() {
        map.put("Two", 2);
        try {
            System.out.println("MapHelper2 Sleeping");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class MapHelper3 implements Runnable {
    Map<String, Integer> map;

    MapHelper3(Map<String, Integer> map) {
        this.map = map;
        new Thread(this, "MapHelper3").start();
    }

    @Override
    public void run() {
        map.put("Three", 3);
        try {
            System.out.println("MapHelper3 Sleeping");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
