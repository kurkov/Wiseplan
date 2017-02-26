<!DOCTYPE html>
<html lang="en">
<head>
    <link href="webjars/bootstrap/4.0.0-alpha.6/css/bootstrap.css" rel="stylesheet">
    <script src="webjars/jquery/3.1.1-1/jquery.min.js"></script>
    <%--<script src="webjars/jquery-ui/1.12.1/jquery-ui.min.js"></script>--%>
</head>
<body>

<h2>Wiseplan</h2>
<div class="container-fluid">
    <form class="form-inline">
        <div class="form-group">
            <label for="mydate">Date:</label>
            <input type="date" class="form-control" id="mydate">
        </div>
        <script>
            $("#mydate").val("2017-01-01");
        </script>
        <div class="form-group">
            <label for="timeFrom">TimeFrom</label>
            <input type="time" class="form-control" id="timeFrom" value="08:00">
        </div>
        <div class="form-group">
            <label for="timeTo">TimeTo</label>
            <input type="time" class="form-control" id="timeTo" value="12:00">
        </div>
    </form>
</div>
</body>
</html>
