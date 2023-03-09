const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot333w4/",
            name: "springboot333w4",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot333w4/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "扶贫助农与产品合作系统"
        } 
    }
}
export default base
