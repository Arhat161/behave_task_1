import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.Random;
import java.util.stream.IntStream;

public class Randoms implements Iterable<Integer> {

    protected Random random; // for random generator
    protected IntStream randomStream; // for Stream of integers
    protected PrimitiveIterator.OfInt randomStreamIterator; // for iterator of Stream of integers
    protected final int min, max; // limit of minimum and maximum values

    public Randoms(int min, int max) {

        random = new Random(); // create new object of 'Random' class
        randomStream = random.ints(min, max + 1); // make stream of randoms integers values
        randomStreamIterator = randomStream.iterator(); // make iterator of stream of randoms integers values

        this.max = max;
        this.min = min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true; // always return true, because we need unlimited int values
            }

            @Override
            public Integer next() {
                return randomStreamIterator.nextInt(); // when call next() method on iterator, return next random int value
            }
        };
    }
}