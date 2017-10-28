
public class StatsHome<T extends Number> implements Stats<T> {

    private T[] array;

    StatsHome(T[] array){
        this.array = array;
    }

    @Override
    public double mean() {
        double sum = 0.0;
        int j = 0;
        for (T m : array){
            sum = sum + m.doubleValue();
            j++;
        }
        return sum/j;
    }

    @Override
    public T max() {
        T max = array[0];
        for (T m : array){
            if (m.doubleValue() > max.doubleValue()){
                max = m;
            }
        }
        return max;
    }

    @Override
    public T min() {
        T min = array[0];
        for (T m : array){
            if (m.doubleValue() < min.doubleValue()){
                min = m;
            }
        }
        return min;
    }

    private T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }
}
