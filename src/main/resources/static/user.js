$(document).ready(function (){
   $.ajax({
       url : "user"
   }).then(function (data){
       $('.firstName').append(data.firstName);
       $('.lastName').append(data.lastName);
       $('.age').append(data.age);
   })
});