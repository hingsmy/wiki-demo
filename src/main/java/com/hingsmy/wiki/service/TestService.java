package com.hingsmy.wiki.service;

import com.hingsmy.wiki.domain.Test;
import com.hingsmy.wiki.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;

    public List<Test> list() {
        return testMapper.list();
    }
}
