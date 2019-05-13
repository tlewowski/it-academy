import java.util.List;
import java.util.function.Function;

public class MyList<T, Ex extends Exception> {
    Ex e;
    T head;
    MyList<T, Ex> tail;
    public MyList<T, Ex> prepend(T a)
    {
        return new MyList(a,this, this.e);
    }
    MyList(T head,MyList<T, Ex> tail, Ex e)
    {
        this.head=head;
        this.tail = tail;
        this.e = e;

    }
    public T getHead()
    {
        return head;
    }
    public MyList<T, Ex> map(Function<T, T>f){
        return new MyList<> (
                f.apply(head),
                (tail == null) ? null : tail.map(f),
                e
        );
    }
    public MyList<T, Ex> getTail() throws Ex {

        if (tail == null)
            throw e;
        return tail;


    }
}
