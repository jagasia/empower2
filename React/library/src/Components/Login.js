import { Component } from "react";
import UserService from "../Services/UserService";

class Login extends Component{
    constructor()
    {
        super();
        this.state={"username":"chenna","password":"chenna@123"}
        this.fnLogin=this.fnLogin.bind(this)
    }

    componentDidMount()
    {
        // AllService.getAllUsers()
        // .then((response)=>
        // {
        //     alert(JSON.stringify(response.data))
        // })
        // .catch((err)=>{
        //     alert(JSON.stringify(err.data))
        // })
    }

    fnLogin()
    {
        UserService.login(this.state)
        .then((response)=>{
            // alert(JSON.stringify(response.data))
           if(response.data.token=='Login failed')
           {
            alert("You login attempt is failed now...")
            localStorage.removeItem('token')
           } else{
            alert("Token received")
            console.log(response.data.token)
            localStorage.setItem('token',response.data.token);
            //find user object by username
            UserService.findUserByUsername(this.state.username)
            .then((response)=>{
                console.log(response.data);
                localStorage.setItem('user',JSON.stringify(response.data));
            })
            .catch((response)=>{
                console.log(response.data);
            })
           }
        })
        .catch((err)=>{
            alert(JSON.stringify(err))
        })
    }
    render(){
        return <div>
            User name:<input type="text" name="username" className="form-control" onChange={(event)=>this.setState({[event.target.name]:event.target.value})} />
            Password:<input type="password" name="password" className="form-control" onChange={(event)=>this.setState({[event.target.name]:event.target.value})} />
            <input type="button" className="btn btn-primary" value={"Login"} onClick={this.fnLogin} />
            <br/>
            {this.state.username}<br/>
            {this.state.password}
        </div>
    }
}
export default Login