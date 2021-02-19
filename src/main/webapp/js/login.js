$(document).ready(function(){
   $('.message a').click(function(){
      $('form').animate({height: "toggle", opacity: "toggle"}, "slow");
   });

   function submitEncryptedForm(username, password, rsaPublicKeyModulus, rsaPpublicKeyExponent) {
      var rsa = new RSAKey();
      rsa.setPublic(rsaPublicKeyModulus, rsaPpublicKeyExponent);
      

      $("#securedid").val(rsa.encrypt(username));
      $("#securedpassword").val(rsa.encrypt(password));
      
      $(".login-form").submit();
   }

   $('#loginbtn').click(function(){
      var username = $("#username").val();
      var password = $("#password").val();

      if (!username || !password) {
         alert("ID/비밀번호를 입력해주세요.");
         return false;
      }
      
      try {
         submitEncryptedForm(username,password, $("#rsaPublicKeyModulus").val(), $("#rsaPublicKeyExponent").val());
      } catch(err) {
         alert(err);
      }
      return false;
   });


   
})