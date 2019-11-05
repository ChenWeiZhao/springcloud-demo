package com.imooc.homepage.dao;

import com.imooc.homepage.entity.HomepageCourse;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JPA接口
 * <实体表类，主键类型>
 */
public interface HomepageCourseDao extends JpaRepository<HomepageCourse, Long> {
}
