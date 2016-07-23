

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
                
                <link rel="stylesheet" href="home.css" type="text/css" />
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

        <script src="http://code.jquery.com/jquery-1.10.2.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.cycle/3.0.3/jquery.cycle.all.js"></script>
         <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

    
    <style type="text/css">
/*bottem*/
body{
           //background-image: url("sign.jpg");

}
#botbar{
	width:100%;
	height:150px;
	position:absolute;
	top:560px;
	left:0px;
	z-index:0;
}

.bot{
	position:absolute;
	top:580px;
	}

#set1{
	position:absolute;
	top:580px;
	left:225px;
	width:300px;
	z-index:2;
	}
	
#set2{
	position:absolute;
	top:580px;
	left:550px;
	width:300px;
	z-index:2
	}
	
#set3{
	position:absolute;
	top:580px;
	left:875px;
	width:300px;
	z-index:2
	}

.sethead{
	font-family:Verdana, Geneva, sans-serif;
	font-size:12pt;
	color:#FFF;
	}

.pbody{
	font-family:Verdana, Geneva, sans-serif;
	font-size:10pt;
	color:#999;
	}
	
.list2{
	font-family:Verdana, Geneva, sans-serif;
	font-size:10pt;
	color:#999;
	}
    </style> 
    
    </head>
    <body>
        <div id="header">
		<div id="left">
    		<label>
            	QCabs Taxi Service
            </label>
    	</div>
        </div>
        <div class="container">    
        <div id="loginbox" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2"> 
             <div class="panel panel-info" >
                    <div class="panel-heading">
                        <div class="panel-title">Customer Sign In</div>
                        <div style="float:right; font-size: 80%; position: relative; top:-10px"><a href="#">Forgot password?</a></div>
                    </div>     

                    <div style="padding-top:30px" class="panel-body" >

                        <div style="display:none" id="login-alert" class="alert alert-danger col-sm-12"></div>
                            
                        <form id="loginform" class="form-horizontal"  role="form" action="LoginServt" method="POST">
                                    
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                        <input id="login-username" type="text" class="form-control" name="user" value="" placeholder="username">                                        
                                    </div>
                                
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                        <input id="login-password" type="password" class="form-control" name="pwd" placeholder="password">
                                    </div>
                                    

                                
                            <div class="input-group">
                                      <div class="checkbox">
                                        <label>
                                          <input id="login-remember" type="checkbox" name="remember" value="1"> Remember me
                                        </label>
                                      </div>
                                    </div>


                                <div style="margin-top:10px" class="form-group">
                                    <!-- Button -->

                                    <div class="col-sm-12 controls">
                                        <button type="submit" name="login" class="btn btn-success">Login</button>
                                     </div>
                                </div>


                                <div class="form-group">
                                    <div class="col-md-12 control">
                                        <div style="border-top: 1px solid#888; padding-top:15px; font-size:85%" >
                                            Don't have an account! 
                                        <a href="CusReg.jsp" >
                                            Sign Up Here
                                        </a>
                                        </div>
                                    </div>
                                </div>    
                            </form>     
                    </div>
             </div>
        </div>
      
    </body>
</html>

