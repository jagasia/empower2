const { Component } = require("react");

class Login extends Component
{
    constructor(props)
    {
        super(props)
        this.state={
            "username":"Sumanth",
            "password":"abcd",
            "status":""
        }
        this.fnValidateLogin=this.fnValidateLogin.bind(this);
        this.fn1=this.fn1.bind(this)
    }

    fnValidateLogin()
    {
        if(this.state.username==this.state.password)
        {
            this.setState({'status':'Failure'})
        }else
            this.setState({'status':'Success'})
    }

    fn1(event)
    {
        // alert(event.target.name)
        this.setState({[event.target.name]:event.target.value});
    }

    render()
    {
        return <div>
            
            Username:<input type="text" name="username" class="form-control" onChange={ this.fn1 } />
            Password:<input type="password" name="password" className="form-control" onChange={ this.fn1 }  />
            <br/>
            <input type="button" value="Login" class="btn btn-info" onClick={this.fnValidateLogin} />
            <br/>
            {/* <div>
                {this.state.username}<br/>
                {this.state.password}
            </div> */}
            {this.state.status}

        </div>
    }
}

export default Login