var vm=new Vue({
    el:"#login",
    data:{
        user:{
            name:"",
            psw:""
        }
    },
    methods:{
      log:function () {
          axios.post("/login",this.user).then(function (response) {
              if(response.data!=""&response.data!=null&response.data!="null"){
                  console.log(response);
                  alert(response);
                  location.href="/success.html";
              }else{
                  console.log(response);
                  alert(response);
                  location.href="/failed.html";
              }
          })
      }  
    }
});