package com.service;

import com.entity.Emp;
import java.util.List;

/**
 * (Emp)表服务接口
 *
 * @author makejava
 * @since 2020-05-14 16:22:56
 */
public interface EmpService {

    /**
     * 通过ID查询单条数据
     *
     * @param empid 主键
     * @return 实例对象
     */
    Emp queryById(Integer empid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Emp> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param emp 实例对象
     * @return 实例对象
     */
    Emp insert(Emp emp);

    /**
     * 修改数据
     *
     * @param emp 实例对象
     * @return 实例对象
     */
    Emp update(Emp emp);

    /**
     * 通过主键删除数据
     *
     * @param empid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer empid);

}