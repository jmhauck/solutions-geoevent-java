package com.esri.geoevent.solutions.transport.irc.jerklib.events.impl;

import com.esri.geoevent.solutions.transport.irc.jerklib.Session;
import com.esri.geoevent.solutions.transport.irc.jerklib.events.IRCEvent;
import com.esri.geoevent.solutions.transport.irc.jerklib.events.MotdEvent;

/**
 * @author mohadib
 * @see MotdEvent
 *
 */
public class MotdEventImpl implements MotdEvent
{

	private final String rawEventData, motdLine, hostName;
	private final Type type = IRCEvent.Type.MOTD;
	private Session session;

	public MotdEventImpl(String rawEventData, Session session, String motdLine, String hostName)
	{
		this.rawEventData = rawEventData;
		this.session = session;
		this.motdLine = motdLine;
		this.hostName = hostName;
	}

	/* (non-Javadoc)
	 * @see com.esri.ges.transport.Irc.jerklib.events.MotdEvent#getMotdLine()
	 */
	public String getMotdLine()
	{
		return motdLine;
	}

	/* (non-Javadoc)
	 * @see com.esri.ges.transport.Irc.jerklib.events.IRCEvent#getType()
	 */
	public Type getType()
	{
		return type;
	}

	/* (non-Javadoc)
	 * @see com.esri.ges.transport.Irc.jerklib.events.IRCEvent#getRawEventData()
	 */
	public String getRawEventData()
	{
		return rawEventData;
	}

	/* (non-Javadoc)
	 * @see com.esri.ges.transport.Irc.jerklib.events.IRCEvent#getSession()
	 */
	public Session getSession()
	{
		return session;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return rawEventData;
	}

	/* (non-Javadoc)
	 * @see com.esri.ges.transport.Irc.jerklib.events.MotdEvent#getHostName()
	 */
	public String getHostName()
	{
		return hostName;
	}
}
