<!DOCTYPE html>
<html lang="en">
<head>
    <link href="webjars/bootstrap/2.2.2/css/bootstrap.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" media="screen"
          href="resources/css/bootstrap-datetimepicker.min.css">
</head>
<body>
<h2>Wiseplan</h2>

<script type="text/javascript"
        src="webjars/jquery/1.8.3/jquery.min.js">
</script>
<script type="text/javascript"
        src="webjars/bootstrap/2.2.2/js/bootstrap.min.js">
</script>
<script type="text/javascript"
        src="resources/js/bootstrap-datetimepicker.min.js">
</script>

<div class="well">
    <div id="datetimepicker1" class="input-append">
        <input class="input-mini" data-format="hh:mm" type="text" width="5px"/>
        <span class="add-on"><i data-time-icon="icon-time"></i></span>
    </div>

    <div id="datetimepicker2" class="input-append">
        <input class="input-mini" data-format="hh:mm" type="text" width="5px"/>
        <span class="add-on"><i data-time-icon="icon-time"></i></span>
    </div>
</div>

<script type="text/javascript">
    $(function () {
        $('#datetimepicker1').datetimepicker({
            maskInput: true,
            pickDate: false,
            pickTime: true,
            pick12HourFormat: false,
            pickSeconds: false
        });
    });
    $(function () {
        $('#datetimepicker2').datetimepicker({
            maskInput: true,
            pickDate: false,
            pickTime: true,
            pick12HourFormat: false,
            pickSeconds: false
        });
    });
</script>
</body>
</html>
