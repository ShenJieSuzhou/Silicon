package silicon.ark.dao;

import silicon.common.util.StringUtil;

public class DAOQuery {
	
	public DAOQuery()
	{
		
	}
	
	public String getQueryString()
	{
		StringBuilder _query = new StringBuilder();
		String _whereClause = getWhereClause();
		if(StringUtil.isNullOrEmpty(_whereClause))
		{
			_query.append(" where ").append(_whereClause);
		}
		
		String _orderByClause = getOrderByClause();
		if(StringUtil.isNullOrEmpty(_orderByClause))
		{
			_query.append(" order by ").append(_orderByClause);
		}
		
		return _query.toString();
	}
	
	public DAOQuery(String m_whereClause)
	{
		_whereClause = m_whereClause;
	}
	
	private String _whereClause = null;
	public void setWhereClause(String m_whereClause)
	{
		_whereClause = m_whereClause;
	}
	
	public String getWhereClause()
	{
		return _whereClause;
	}
	
	private String _orderByClause = null;
	public void setOrderByClause(String m_orderByClause)
	{
		_orderByClause = m_orderByClause;
	}
	
	public String getOrderByClause()
	{
		return _orderByClause;
	}
	
	private int _pageIndex = 0;
	public void setPageIndex(int m_pageIndex)
	{
		_pageIndex = m_pageIndex;
	}
	
	public int getPageIndex()
	{
		return _pageIndex;
	}
	
	private int _pageSize = 0;
	public void setPageSize(int m_pageSize)
	{
		_pageSize = m_pageSize;
	}
	
	public int getPageSize()
	{
		return _pageSize;
	}
}
