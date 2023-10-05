import { Component } from "react";

class Welcome extends Component
{
    constructor(props)
    {
        super(props)
    }
    render()
    {
        return <div><h2>Welcome {this.props.name} </h2>
        </div>
    }
}

export default Welcome
