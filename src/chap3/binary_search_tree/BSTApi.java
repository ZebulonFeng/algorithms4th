package chap3.binary_search_tree;

/**
 * 二叉查找树API，等待具体实现
 *
 * @param <Key>   泛型键
 * @param <Value> 泛型值
 */
public interface BSTApi<Key extends Comparable<Key>, Value> {


    Value get(Key key);

    void put(Key key, Value value) throws Exception;

    Key min();

    Key max();

    Key floor(Key key);

    Key ceiling(Key key);

    Key select(int k);

    void delete(Key key);
}
