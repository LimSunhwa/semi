<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<html><head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
    <script type="text/javascript" src="http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <link href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="http://pingendo.github.io/pingendo-bootstrap/themes/default/bootstrap.css" rel="stylesheet" type="text/css">
<style type="text/css">
a:link {text-decoration: none; color: #333333;}
a:visited {text-decoration: none; color: #333333;}
a:active {text-decoration: none; color: #333333;}
a:hover {text-decoration: underline; color: red;}


#home_banner{
width: 100%;
height: 11%;
background: #344d91;
margin: 0;
padding: 0;
}
#logo_wrapper{
position: absolute;
left: 250px;
z-index: 3;
}

#logo_banner{
display: inline;
margin : auto;
width: 100px;
height: 100px;
}
#Honey_comB{
display: inline;

font-size: 38pt;
color:#fff;
vertical-align: middle;
}
#logo_a{
text-decoration: none;
}

.container{
position: absolute;
left: 250px;
padding:0;
}
#signButton{
width:405;
}
#name{
width:200px;
height:30px;
text-align:center;
}
#phone input{
text-align:center;
width:60px;
height:30px;
}
#findEmail{
width:200;
}

</style>
  </head>
  <body>
  <div id = "home_banner">
  <div id = "logo_wrapper">
       <img id="logo_banner" src="/HoneyComb/page_layout/page_image/logo.png" width="100" height="100"onclick="location.href='/HoneyComb/index.jsp'">
 <a id="logo_a" href="/HoneyComb/index.jsp"><p id="Honey_comB" >HONEYCOMB</p></a>
  </div>
  </div>
      <div class="container" style="height:89%; width:80%;">
            <div class="cover">
              <div class="navbar navbar-default" >
              </div>
              <div class="cover-image" style="background-image : url('https://unsplash.imgix.net/reserve/jEs6K0y1SbK3DAvgrBe5_IMG_3410.jpg?w=1024&amp;q=50&amp;fm=jpg&amp;s=b02e0318fd02be9616e40e5928db8ddc')" ></div>
             <div class="container" style="width:70%;">
                <div class="row">
                  <div class="col-md-12 text-center">
             <form action="/HoneyComb/coin/FindEmailPro.coin">
	이름을 입력해주세요<br><br>
	<input type="text"  placeholder="Name" name="name" id="name"/><br><br>
	전화번호를 입력해주세요<br><br>
	<div id="phone">
		<input type="text"  placeholder="phone1" id='phone1'  name="phone1" maxlength="3"  onkeyup='{filter();return false}' onkeypress='javascript:if(event.keyCode==3){ filter(); return false;}'/> -
		<input	type="text"  placeholder="phone2" id='phone2' name="phone2" maxlength="4"  onkeyup='{filter1();return false}' onkeypress='javascript:if(event.keyCode==4){ filter1(); return false;}'/>  -
		<input type="text"  placeholder="phone3" id='phone3' name="phone3" maxlength="4"/><br><br>
</div>
	<input type="submit" class="btn btn-default" value="find Email" id="findEmail"/>
	</form>
                  </div>
                </div>
              </div>
            </div>
          </div>
</body>
</html>

