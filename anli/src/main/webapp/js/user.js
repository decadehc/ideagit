new Vue({
    el:"#app",
    data:{
        user:{
            id:"",
            username:"",
            password:"",
            email:"",
            age:"",
            sex:"",
        },
        userList:[]
    },
    methods:{
        findAll:function(){
            // 在当前方法中定义一个变量 表明是vue的对象
            // vue和 axios是两种不同的技术 所以要将this区分开来进行分别
            var _this = this;
            axios.get("/anli/user/findAll.do")
                .then(function (response) {
                    _this.userList = response.data; // 响应数据给userList赋值
                    console.log(response);
                })
                .catch(function (error) {
                    console.log(error);
                })
        },

        findById:function (userid) {
        },

        update:function (user) {
        }
    },

    // 勾子函数的使用
   created:function(){ // 页面加载的时候触发请求 查询所有
        this.findAll();
   }

});