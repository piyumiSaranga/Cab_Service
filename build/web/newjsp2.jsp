<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>
$(document).ready(function() {
    $(".flip").click(function() {
        $(this).parent().nextAll('#panel').first().toggle('slow');
    });
});
</script>
 
<style>
#panel, #flip {
    padding: 5px;
    text-align: center;
    background-color: #e5eecc;
    border: solid 1px #c3c3c3;
}

#panel {
    padding: 50px;
    display: none;
}
</style>
</head>
<body>
 
<p><a class="toggle-trigger">Click to toggle</a><p>
<div class="toggle-wrap">
    <div class="style-single">
        Random Text
    </div>
</div>


<p><a class="toggle-trigger">Click to toggle 2</a><p>
<div class="toggle-wrap">
    <div class="style-single">
        This doesn't work :(
    </div>
</div>
<p><a class="flip">Click to slide down panel</a></p>
<div id="panel">
    <div class="yu">
    Hello world!</div>
</div>
<p><a class="flip">Click to slide down panel</a></p>
<div id="panel">
    <div class="yu">
    Hello world1!</div>
</div>

</body>
</html>

