        function submit(){
            var form = new FormData(document.getElementById("tf"));
            form["sponsor_plan"] = ue.getPlainTxt();
            console.log("!!!!");
            console.log(form);
//             var req = new XMLHttpRequest();
//             req.open("post", "${pageContext.request.contextPath}/public/testupload", false);
//             req.send(form);
            $.ajax({
                url:"http://localhost:8080/sponsorPub",
                type:"post",
                data:form,
                processData:false,
                contentType:false,
                success:function(data){
                    window.clearInterval(timer);
                    console.log("over..");
                    var success_message = document.getELementById("pub_success");
                    success_message.css.display="block";
                },
                error:function(e){
                    alert("上传发生错误！！");
                    window.clearInterval(timer);
                    var fail_message = document.getELementById("pub_fail");
                    fail_message.css.display="block";
                }
            });        
            //get();//此处为上传文件的进度条
            
        }