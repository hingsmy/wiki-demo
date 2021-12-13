package com.hingsmy.wiki.mapper;

import com.hingsmy.wiki.domain.Test;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestMapper {

    public List<Test> list();
}
