/*
 * Copyright Lealone Database Group.
 * Licensed under the Server Side Public License, v 1.
 * Initial Developer: zhh
 */
package org.lealone.plugins.zookeeper.command;

import org.lealone.db.session.ServerSession;
import org.lealone.plugins.zookeeper.server.ZooKeeperServerEngine;
import org.lealone.sql.SQLEngineBase;

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
