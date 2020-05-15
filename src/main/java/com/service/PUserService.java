package com.service;

import com.entity.PUser;
import java.util.List;

/**
 * (PUser)表服务接口
 *
 * @author makejava
 * @since 2020-05-15 01:29:14
 */
public interface PUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param userid 主键
     * @return 实例对象
     */
    PUser queryById(Integer userid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PUser> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param pUser 实例对象
     * @return 实例对象
     */
    PUser insert(PUser pUser);

    /**
     * 修改数据
     *
     * @param pUser 实例对象
     * @return 实例对象
     */
    PUser update(PUser pUser);

    /**
     * 通过主键删除数据
     *
     * @param userid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer userid);

}