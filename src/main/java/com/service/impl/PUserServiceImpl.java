package com.service.impl;

import com.entity.PUser;
import com.dao.PUserDao;
import com.service.PUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (PUser)表服务实现类
 *
 * @author makejava
 * @since 2020-05-15 01:29:14
 */
@Service("pUserService")
public class PUserServiceImpl implements PUserService {
    @Resource
    private PUserDao pUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param userid 主键
     * @return 实例对象
     */
    @Override
    public PUser queryById(Integer userid) {
        return this.pUserDao.queryById(userid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PUser> queryAllByLimit(int offset, int limit) {
        return this.pUserDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pUser 实例对象
     * @return 实例对象
     */
    @Override
    public PUser insert(PUser pUser) {
        this.pUserDao.insert(pUser);
        return pUser;
    }

    /**
     * 修改数据
     *
     * @param pUser 实例对象
     * @return 实例对象
     */
    @Override
    public PUser update(PUser pUser) {
        this.pUserDao.update(pUser);
        return this.queryById(pUser.getUserid());
    }

    /**
     * 通过主键删除数据
     *
     * @param userid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer userid) {
        return this.pUserDao.deleteById(userid) > 0;
    }
}