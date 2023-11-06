/*
 * Copyright Lealone Database Group.
 * Licensed under the Server Side Public License, v 1.
 * Initial Developer: zhh
 */
package org.lealone.plugins.zookeeper.server;

import java.util.Map;

import org.lealone.server.ProtocolServer;
import org.lealone.server.ProtocolServerEngineBase;

public class ZooKeeperServerEngine extends ProtocolServerEngineBase {

    public static final String NAME = "ZooKeeper";
    private final ZooKeeperServer server = new ZooKeeperServer();

    public ZooKeeperServerEngine() {
        super(NAME);
    }

    @Override
    public ProtocolServer getProtocolServer() {
        return server;
    }

    @Override
    public void init(Map<String, String> config) {
        server.init(config);
    }

    @Override
    public void close() {
        server.stop();
    }
}
