<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ tag import="silicon.common.SCEnvironment" %>
<%@ tag import="silicon.common.util.FileSystemUtil" %>
<%@ attribute name="path" rtexprvalue="true" %>
<%
if(path == null)
{
	path = "commmon";	
}

String page = null;
if(FileSystemUtil.hasFile(request.getServletContext().getRealPath(path + "/sideNavi.jsp")))
{
	page = "/" + path + "/sideNavi.jsp";
}
else
{
	page = "/common/sideNavi.jsp";
}
%>

<jsp:include page='<%= page%>'>
	<jsp:param value='<%= path%>' name="path"/>
</jsp:include>