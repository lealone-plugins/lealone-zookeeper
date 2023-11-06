/*
 * Copyright Lealone Database Group.
 * Licensed under the Server Side Public License, v 1.
 * Initial Developer: zhh
 */
package org.lealone.plugins.zookeeper.server;

import java.util.Map;

import org.lealone.common.logging.Logger;
import org.lealone.common.logging.LoggerFactory;
import org.lealone.net.WritableChannel;
import org.lealone.server.AsyncServer;
import org.lealone.server.Scheduler;

public class ZooKeeperServer extends AsyncServer<ZooKeeperServerConnection> {

    @SuppressWarnings("unused")
    private static final Logger logger = LoggerFactory.getLogger(ZooKeeperServer.class);

    public static final String VERSION = "3.9.1";
    public static final int DEFAULT_PORT = 8080;

    @Override
    public String getType() {
        return ZooKeeperServerEngine.NAME;
    }

    @Override
    public void init(Map<String, String> config) {
        super.init(config);
    }

    @Override
    public synchronized void start() {
        super.start();
    }

    @Override
    protected int getDefaultPort() {
        return DEFAULT_PORT;
    }

    @Override
    protected ZooKeeperServerConnection createConnection(WritableChannel writableChannel,
            Scheduler scheduler) {
        return new ZooKeeperServerConnection(this, writableChannel, scheduler);
    }

    @Override
    protected void beforeRegister(ZooKeeperServerConnection conn, Scheduler scheduler) {
    }
}
