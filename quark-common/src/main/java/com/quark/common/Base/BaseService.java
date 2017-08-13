package com.quark.common.Base;

import java.util.List;

/**
 * Created by lhr on 17-8-1.
 * Service通用接口
 */
public interface BaseService<T> {

    T findOne(int key);
    T save(T entity);
    void delete(Object key);
    List<T> findAll();

    /**
     * 批量删除
     * @param iterable
     */
    void deleteInBatch(Iterable<T> iterable);

    /**
     * 批量保存
     * @param iterable
     * @return
     */
    List<T> save(Iterable<T> iterable);

}
