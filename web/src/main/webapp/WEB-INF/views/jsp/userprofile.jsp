<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html/>
<html>
<head>
    <title>My profile</title>
    <jsp:include page="generic.jsp"/>
	<link rel="stylesheet" href="resources/css/userprofile.css">
</head>
<body class="login-body">
<div class="wrapper">
  <div class="general">
    <h3 class="form-signin-heading">My profile</h3>
    <hr class="colorgraph">
          <div class="panel-body">
              <div class="row">
                <div class=" col-md-9 col-lg-9 "> 
                  <table class="table table-user-information">
                    <tbody>
                      <tr>
                        <td>First name:</td>
                        <td>Andriy</td>
                      </tr>
                      <tr>
                        <td>Last name:</td>
                        <td>Luchko</td>
                      </tr>
                      <tr>
                        <td>Display name:</td>
                        <td>aluchko96</td>
                      </tr>
                      <tr>
                        <td>Email:</td>
                        <td><a href="mailto:info@support.com">info@support.com</a></td>
                      </tr>
                      <tr>
                        <td>Password:</td>
                        <td>Xw158ref</td> 
                      </tr>
                     <td></td><td></td>
                    </tbody>
                  </table>
                  <a href="edituser.html" class="btn btn-primary">Edit Profile</a>
                </div>
              </div>
            </div>
    	<hr class="colorgraph">
    <hr>
  </div>
</div>
</body>
</html>