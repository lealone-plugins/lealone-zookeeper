/*
 * Copyright Lealone Database Group.
 * Licensed under the Server Side Public License, v 1.
 * Initial Developer: zhh
 */
package com.lealone.plugins.zookeeper.server;

import com.lealone.server.ProtocolServer;
import com.lealone.server.ProtocolServerEngineBase;

public class ZooKeeperServerEngine extends ProtocolServerEngineBase {

    public static final String NAME = "ZooKeeper";

    public ZooKeeperServerEngine() {
        super(NAME);
    }

    @Override
    protected ProtocolServer createProtocolServer() {
        return new ZooKeeperServer();
    }
}
