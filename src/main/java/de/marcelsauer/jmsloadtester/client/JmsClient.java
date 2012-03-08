package de.marcelsauer.jmsloadtester.client;

import de.marcelsauer.jmsloadtester.handler.MessageHandler;
import de.marcelsauer.jmsloadtester.spring.SpringFactory;

/**
 * JMS Load Tester Copyright (C) 2008 Marcel Sauer
 * <marcel[underscore]sauer[at]gmx.de>
 * <p/>
 * This file is part of JMS Load Tester.
 * <p/>
 * JMS Load Tester is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 * <p/>
 * JMS Load Tester is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * <p/>
 * You should have received a copy of the GNU General Public License along with
 * JMS Load Tester. If not, see <http://www.gnu.org/licenses/>.
 */
public abstract class JmsClient implements Runnable {

    private MessageHandler messageHandler;

    protected MessageHandler getMessageHandler() {
        if (messageHandler == null) {
            this.messageHandler = SpringFactory.getBean("messageHandler");
        }
        return messageHandler;
    }

    public String getName() {
        return this.toString();
    }

    public void setMessageHandler(MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }
}
