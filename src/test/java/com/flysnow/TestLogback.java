package com.flysnow;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogback {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void testInsert() throws Exception {
        logger.trace("----------debug");
        logger.debug("----------debug");
        logger.info("----------debug");
        logger.warn("----------debug");
        logger.error("----------debug");
    }
}
