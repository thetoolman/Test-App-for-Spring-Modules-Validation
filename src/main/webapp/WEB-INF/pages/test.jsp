<%@ include file="/common/taglibs.jsp"%>

<%@taglib uri="/WEB-INF/tlds/valang.tld" prefix="vl" %>
 <script type="text/javascript" src="/scripts/valang_codebase.js"></script> 



<script type="text/javascript">
ValangValidator.prototype.fieldValidationCallback = function(field, isValid, ruleCount) {
    if(ruleCount == 0) return;
	if(!isValid){
		field.setAttribute("className", "invalid");
        field.setAttribute("class", "invalid");
	} else {
        field.setAttribute("className", "valid");
        field.setAttribute("class", "valid");
	} 
}

ValangValidator.prototype.formValidationCallback = function(field, isValid) {
    if(!isValid){
        alert("Please correct the errors");
    } else {
    } 
    return isValid;
}


</script>


<h1>TEST</h1>

<form:form commandName="testBean">

    <div id="global_errors"></div>


	<spring:bind path="testBean">
	<ul>
	   <c:forEach items="${testBean.fields}" var="field">
       <li><label for="${field.name}">${field.name}</label><form:input path="${field.name}" /><div id="${field.name}_error"/></li>
	   </c:forEach>
    </ul>
		<spring:hasBindErrors name="testBean">
			<ul>
				<c:forEach var="errMsgObj" items="${errors.allErrors}">
					<li><spring:message code="${errMsgObj.code}" text="${errMsgObj.defaultMessage}" /></li>
				</c:forEach>
			</ul>
		</spring:hasBindErrors>
	</spring:bind>

    <input type="submit"/>

 <vl:beanValidate commandName="testBean" />
 
 
 <!-- 
  <vl:validate >
{ testNull :  email(?) is true : 'This ' }
</vl:validate>
 -->
 <div id="valangLogDiv"></div>

 
</form:form>
