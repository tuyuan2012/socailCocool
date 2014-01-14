package org.cocool.social.dao.base;


/**
 * BaseMapper:提供基本接口方法
 * 
* */
public interface BaseMapper {
	//公共的业务逻辑
	
	//基本的业务逻辑包括：增、删、查、改
	/**
	 * 根据标识属性来删除某个实例
	 * @param aid 需要删除实例的标识属性值
	 */
	int deleteByPrimaryKey(Integer aid);

    int insert(Object record);

    int insertSelective(Object record);

    /**
	 * 根据实例的标识属性值来查询该实例
	 * @param aid 实例的标识属性值
	 * @return 返回符合条件的
	 */ 
    Object selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(Object record);

    int updateByPrimaryKey(Object record);
}
