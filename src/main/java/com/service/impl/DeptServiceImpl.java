package com.service.impl;

import com.entity.Dept;
import com.dao.DeptDao;
import com.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Dept)表服务实现类
 *
 * @author makejava
 * @since 2020-05-15 01:27:02
 */
@Service("deptService")
public class DeptServiceImpl implements DeptService {
    @Resource
    private DeptDao deptDao;

    /**
     * 通过ID查询单条数据
     *
     * @param deptid 主键
     * @return 实例对象
     */
    @Override
    public Dept queryById(Integer deptid) {
        return this.deptDao.queryById(deptid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Dept> queryAllByLimit(int offset, int limit) {
        return this.deptDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param dept 实例对象
     * @return 实例对象
     */
    @Override
    public Dept insert(Dept dept) {
        this.deptDao.insert(dept);
        return dept;
    }

    /**
     * 修改数据
     *
     * @param dept 实例对象
     * @return 实例对象
     */
    @Override
    public Dept update(Dept dept) {
        this.deptDao.update(dept);
        return this.queryById(dept.getDeptid());
    }

    /**
     * 通过主键删除数据
     *
     * @param deptid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer deptid) {
        return this.deptDao.deleteById(deptid) > 0;
    }
}