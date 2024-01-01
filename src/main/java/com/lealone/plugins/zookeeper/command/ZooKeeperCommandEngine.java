/*
 * Copyright Lealone Database Group.
 * Licensed under the Server Side Public License, v 1.
 * Initial Developer: zhh
 */
package com.lealone.plugins.zookeeper.command;

import com.lealone.db.session.ServerSession;
import com.lealone.sql.SQLEngineBase;

import com.lealone.plugins.zookeeper.server.ZooKeeperServerEngine;

public class ZooKeeperCommandEngine extends SQLEngineBase {

    public ZooKeeperCommandEngine() {
        super(ZooKeeperServerEngine.NAME);
    }

    @Override
    public String quoteIdentifier(String identifier) {
        return ZooKeeperCommandParser.quoteIdentifier(identifier);
    }

    @Override
    public ZooKeeperCommandParser createParser(ServerSession session) {
        return new ZooKeeperCommandParser(session);
    }
}
