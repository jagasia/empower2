import { Component } from "react";
import ProductService from "../Services/ProductService";

export class ProductForm extends Component
{
    constructor(props)
    {
        super(props)
        this.state={
            "id":"","name":"","price":""
        }

        this.fnAdd=this.fnAdd.bind(this);
        this.fnUpdate=this.fnUpdate.bind(this);
        this.fnDelete=this.fnDelete.bind(this)
    }

    fnAdd()
    {
        ProductService.addProduct(this.state).then((response)=>{
            console.log(response.data);
        })
    }

    fnUpdate()
    {
        ProductService.updateProduct(this.state).then(response=>{
            console.log(response.data);
        })
    }

    fnDelete()
    {
        ProductService.deleteProduct(this.state.id).then(response=>{
            console.log(response.data);
        })
    }

    render(){
        return <div>
            Id:<input type="number" name="id" className="form-control" onChange={(event)=>this.setState({[event.target.name]:event.target.value})} />
            Name:<input type="text" name="name" className="form-control" onChange={(event)=>this.setState({[event.target.name]:event.target.value})} />
            Price:<input type="number" name="price" className="form-control" onChange={(event)=>this.setState({[event.target.name]:event.target.value})} />
            <br/>
            <input type="button" value="Add" className="btn btn-info" onClick={this.fnAdd} />&nbsp;
            <input type="button" value="Update" className="btn btn-warning" onClick={this.fnUpdate} />&nbsp;
            <input type="button" value="Delete" className="btn btn-danger" onClick={this.fnDelete} />&nbsp;            
            <br/>
            { this.state.id }<br/>
            {   this.state.name }<br/>
            {   this.state.price}<br/>
        </div>
    }
}