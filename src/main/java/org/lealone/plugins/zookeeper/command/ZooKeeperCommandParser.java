/*
 * Copyright Lealone Database Group.
 * Licensed under the Server Side Public License, v 1.
 * Initial Developer: zhh
 */
package org.lealone.plugins.zookeeper.command;

import org.lealone.db.session.ServerSession;
import org.lealone.sql.SQLParserBase;
import org.lealone.sql.StatementBase;
import org.lealone.sql.expression.Expression;

public class ZooKeeperCommandParser extends SQLParserBase {

    public ZooKeeperCommandParser(ServerSession session) {
        super(session);
    }

    @Override
    protected StatementBase parseStatement(char first) {
        StatementBase s = null;
        return s;
    }

    @Override
    protected Expression parseVariable() {
        return super.parseVariable();
    }
}
