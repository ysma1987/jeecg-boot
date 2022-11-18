package org.jeecg.config.activiti;

import cn.hutool.core.util.IdUtil;
import org.activiti.engine.impl.cfg.IdGenerator;

public class MyUUIDgenerator implements IdGenerator {
    @Override
    public String getNextId() {
        return String.format("act-%s", IdUtil.randomUUID());
    }
}
