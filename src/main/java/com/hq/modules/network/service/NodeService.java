package com.hq.modules.network.service;

import com.baomidou.mybatisplus.service.IService;
import com.hq.modules.network.entity.NodeEntity;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

//extends IService<NodeEntity>
@Service
public interface NodeService{
        List<NodeEntity> getNodes(Element node);
}