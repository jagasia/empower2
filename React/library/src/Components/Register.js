import { Component } from "react";
import UserService from "../Services/UserService";

class Register extends Component
{
    constructor()
    {
        super();
        this.state={"username":"chenna","password":"chenna@123","fullName":"Chenna Keshav Reddy","role":"admin"};
        this.fnSignup=this.fnSignup.bind(this)
    }

    fnSignup()
    {
        UserService.signup(this.state).then((response)=>{
            alert(response.data.username)
        }).catch((err)=>{
            alert('Error')
        })
    }
    render(){
        return <div>
        User name:<input type="text" name="username" className="form-control" onChange={ (event)=> this.setState({[event.target.name]:event.target.value})   } />
        Password:<input type="password" name="password" className="form-control" onChange={ (event)=> this.setState({[event.target.name]:event.target.value})   } />
        Confirm password:<input type="password" name="cpassword" className="form-control" />
        Full Name:<input type="text" name="fullName" className="form-control" onChange={ (event)=> this.setState({[event.target.name]:event.target.value})   } />
        Role:<select className="form-control" name="role"  onChange={ (event)=> this.setState({[event.target.name]:event.target.value})   }>
            <option value="customer">Customer</option>
            <option value="admin">Admin</option>
        </select>
        <br/>
        <input type="button" className="btn btn-info" value="Sign up" onClick={this.fnSignup} />
        <br/>
        User name : {this.state.username}<br/>
        Password: {this.state.password}<br/>
        Full name: {this.state.fullName}<br/>
        Role: {this.state.role}<br/>
    </div>
    }
}

export default Register