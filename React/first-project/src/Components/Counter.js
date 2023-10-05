const { Component } = require("react");

class Counter extends Component
{
    constructor(props)
    {
        super(props);

        this.state={"counter":0}
        this.fnUpdate=this.fnUpdate.bind(this);
    }

    fnUpdate()
    {
        this.setState({"counter":this.state.counter+1})
    }

    render()
    {
        // const {counter}=this.state
        return <div>
            You are #{this.state.counter} visitor
            <button onClick={ this.fnUpdate }>Click Me!</button>
            </div>
    }
}
export default Counter;