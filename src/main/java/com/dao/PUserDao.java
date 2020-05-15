package com.dao;

import com.entity.PUser;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (PUser)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-15 01:29:14
 */
public interface PUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param userid 主键
     * @return 实例对象
     */
    PUser queryById(Integer userid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PUser> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param pUser 实例对象
     * @return 对象列表
     */
    List<PUser> queryAll(PUser pUser);

    /**
     * 新增数据
     *
     * @param pUser 实例对象
     * @return 影响行数
     */
    int insert(PUser pUser);

    /**
     * 修改数据
     *
     * @param pUser 实例对象
     * @return 影响行数
     */
    int update(PUser pUser);

    /**
     * 通过主键删除数据
     *
     * @param userid 主键
     * @return 影响行数
     */
    int deleteById(Integer userid);

}