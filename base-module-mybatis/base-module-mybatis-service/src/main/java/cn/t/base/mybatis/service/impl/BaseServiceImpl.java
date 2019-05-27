package cn.t.base.mybatis.service.impl;


import cn.t.base.mybatis.dao.BaseMapper;
import cn.t.base.mybatis.entity.BaseEntity;
import cn.t.base.mybatis.service.BaseService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import java.io.Serializable;
import java.util.List;

public abstract class BaseServiceImpl<T extends BaseEntity, E, PK extends Serializable, M extends BaseMapper<T, E, PK>> implements BaseService<T, E, PK, M> {

    protected final M baseMapper;

    @Override
    public T queryById(PK id) {
        return baseMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<T> queryByExample(E e) {
        return baseMapper.selectByExample(e);
    }

    @Override
    public Page<T> queryPageByExample(E e) {
        return PageHelper.startPage(e).doSelectPage(() -> baseMapper.selectByExample(e));
    }

    @Override
    public List<T> queryAll() {
        return baseMapper.selectAll();
    }

    public long countByExample(E e) {
        return baseMapper.countByExample(e);
    }

    @Override
    public void removeById(PK id) {
        baseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void save(T t) {
        baseMapper.insert(t);
    }

    @Override
    public void saveSelective(T t) {
        baseMapper.insertSelective(t);
    }

    @Override
    public void modify(T t) {
        baseMapper.updateByPrimaryKey(t);
    }

    @Override
    public void modifyByPrimaryKeySelective(T t) {
        baseMapper.updateByPrimaryKeySelective(t);
    }

    public BaseServiceImpl(M baseMapper) {
        this.baseMapper = baseMapper;
    }
}
