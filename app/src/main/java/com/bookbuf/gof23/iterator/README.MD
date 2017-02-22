# JDK中 迭代器模式的应用

```
// 定义迭代器接口
public interface Iterable<T> {
    Iterator<T> iterator();
}

public interface Collection<E> extends Iterable<E> {
// 集合接口继承自迭代器接口
}
```