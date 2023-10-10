import { Component } from "react";

class Book extends Component{
    constructor()
    {
        super();
        
    }

    componentDidMount(props)
    {
        var str=localStorage.getItem('user');
        if(str==null || str=='')
        {
            alert("you have not logged in")
        }else{
            var user=JSON.parse(str);
            if(user.role!='admin')
            {
                alert('You are not admin to access this page')
                // const navigate=useNavigate();
                // this.props.navigate("/error")
            }else{
                alert("Welcome admin.. You name is "+user.fullName)
            }
        }
    }

    render(){
        return <div>
            Book Component
        </div>
    }
}
export default Book