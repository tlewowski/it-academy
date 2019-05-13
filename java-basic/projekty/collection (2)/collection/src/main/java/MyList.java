import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MyList<T, Ex extends Exception> {
    Ex e;
    T head;
    MyList<T, Ex> tail;

    public int size() {
        if (tail == null) {
            return 1;}
            return 1 + tail.size();
    }
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
    public <R> MyList<R, Ex> map(Function<T, R>f){
        return new MyList<> (
                f.apply(head),
                (tail == null) ? null : tail.map(f),
                e
        );
    }
    public MyList<T,Exception> filter(Function<T,Boolean> pred){

       if(pred.apply(head))
       {
           return new MyList<> (
                   head,
                   (tail == null) ? null : tail.filter(pred),
                   e
           );
       }
       else
       {
           return (tail == null) ? null : tail.filter(pred);


       }
    }
    public MyList<T, Ex> getTail() throws Ex {

        if (tail == null)
            throw e;
        return tail;


    }

    public <R> R fold(R init, BiFunction<T,R,R> calc) {
        if(tail==null)
        {
            return calc.apply(head,init);
        }
        return calc.apply(head,tail.fold(init,calc));
    }
}
