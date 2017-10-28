/*
 * Class box for everything
 */
package generics1;

/**
 *
 * @author gheor
 * class Box<T>
 * @param <T> will be specified in run-time
 */
public class Box<T> {
    
    T volume;

    public T getVolume() {
        return volume;
    }

    public void setVolume(T volume) {
        this.volume = volume;
    }
}
