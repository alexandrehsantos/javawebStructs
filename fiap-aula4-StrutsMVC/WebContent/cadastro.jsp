<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-dojo-tags" prefix="sx"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<sx:head />
</head>
<body>
	<s:form action="/cadastrar" namespace="/pessoa" method="post"
		enctype="multipart/form-data">
		<s:textfield name="pessoa.nome" label="Nome" />
		<sx:datetimepicker name="pessoa.dataNasc" 
		label="dd-MMM-yyyy" />
		<s:submit />
	</s:form>
</body>
</html>