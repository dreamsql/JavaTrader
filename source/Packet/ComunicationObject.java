package Packet;

import nu.xom.Element;

public class ComunicationObject
{
	private boolean isPrice;
	private String session;
	private String invokeID;
	private Element content;
	private byte[] price;
	private String rawContent;

	public ComunicationObject(String session, byte[] price)
	{
		this(true, session, "", null, price);
	}

	public ComunicationObject(String session, Element content)
	{
		this(false, session, "", content, null);
	}

	public ComunicationObject(String session, String invokeID, Element content)
	{
		this(false, session, invokeID, content, null);
	}

	public ComunicationObject(boolean isPrice, String session, String invokeID,
							  Element content, byte[] price)
	{
		this.isPrice = isPrice;
		this.session = session;
		this.invokeID = invokeID;
		this.content = content;
		this.price = price;
	}

	public void setRawContent(String rawContent)
	{
		this.rawContent=rawContent;
	}

	public String getRawContent()
	{
		return this.rawContent;
	}


	public boolean getIsPrice()
	{
		return this.isPrice;
	}

	public String getSession()
	{
		return this.session;
	}

	public String getInvokeID()
	{
		return this.invokeID;
	}

	public Element getContent()
	{
		return this.content;
	}

	public byte[] getPrice()
	{
		return this.price;
	}

}