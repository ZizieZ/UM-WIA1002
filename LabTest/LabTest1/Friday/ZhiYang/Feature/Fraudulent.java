package Friday.Feature;

import java.util.*;
import Friday.Utils.*;
import Friday.Data.Data;

public class Fraudulent<E extends Comparable<E>> extends Feature<E> {
    public Fraudulent(List<Data<E>> data) {
        super(data);
    }

    @Override
    public Fraudulent<E> dataCleaning() {
        List<Data<E>> data = this.dataList();
        data.removeIf(val -> val == null
                || val.getData() instanceof Double && ((Double) val.getData() > 1 || (Double) val.getData() < 0));
        return (Fraudulent<E>) this;
    }

    @Override
    public <U extends Comparable<U>> Fraudulent<E> merge(Feature<U> other, Transformer<U, E> converter) {
        return (Fraudulent<E>) super.merge(other, converter);
    }

    public Fraudulent<E> transformation(Transformer<E, E> transformer) {
        List<Data<E>> data = this.dataList();
        data.forEach(val -> val.setData(transformer.transform(val.getData())));
        return this;
    }
}