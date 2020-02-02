<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>  
<html>  
<head>  
<meta charset="ISO-8859-1">  
<title>Football Session Game Result</title>  
 
	<link href="bootstrap.min.css" rel="stylesheet">
 <!--    <script src="/jquery-2.2.1.min.js"></script>   -->
    <script src="bootstrap.min.js"></script>
 
</head>  
<body>

<div>
<div class="container" style="margin:50px">
    <div class="row text-center"><strong> Session Result</strong></div>
    <div class="row" style="border:1px solid green;padding:10px">
        <div class="col-md-3 text-center"><strong>Date</strong></div>
        <div class="col-md-3 text-center"><strong>Home</strong></div>
        <div class="col-md-3 text-center"><strong>Score</strong></div>
        <div class="col-md-3 text-center"><strong>Away</strong></div>
    </div>
        <c:forEach var="gameResult" items="${results}">
            <div class="row" style="border:1px solid green;padding:10px">
            	<div class="col-md-3 text-center"><fmt:formatDate value="${gameResult.gameDate}" pattern="dd MMM" /></div>
            	<div class="col-md-3 text-center" >${gameResult.homeTeam}</div>
                <div class="col-md-3 text-center">${gameResult.homeScore} : ${gameResult.awayScore}</div>
                <div class="col-md-3 text-center">${gameResult.awayTeam}</div>
            </div>
        </c:forEach>

</div>
</div>

</body>  
</html>  