
export const Status=()=>{
    function fnCheckStatus(){
        // localStorage.setItem("username","jag")
        // localStorage.removeItem("username")
        var user=localStorage.getItem("username");
        if(user==null)
            return "Login"
        else
            return "Logout";
    }
    return <div>
        {fnCheckStatus()}
    </div>
}