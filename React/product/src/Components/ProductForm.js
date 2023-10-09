import { Component } from "react";
import ProductService from "../Services/ProductService";

export class ProductForm extends Component
{
    constructor(props)
    {
        super(props)
        this.state={
            "id":"","name":"","price":"", "isFirst":true
        }

        this.fnAdd=this.fnAdd.bind(this);
        this.fnUpdate=this.fnUpdate.bind(this);
        this.fnDelete=this.fnDelete.bind(this)
    }

    fnAdd()
    {
        ProductService.addProduct(this.state).then((response)=>{
            console.log(response.data);
            window.location.reload(false);
        })
    }

    fnUpdate()
    {
        ProductService.updateProduct(this.state).then(response=>{
            console.log(response.data);
            window.location.reload(false);
        })
        
    }

    fnDelete()
    {
        ProductService.deleteProduct(this.state.id).then(response=>{
            console.log(response.data);
            window.location.reload(false);
        })
    }
    fnIsValid()
        {

            return this.state.name.length>=5 && this.state.price>100;
        }

    render(){

        

        const x='form-control'
        const y='is-invalid'
        const color=this.state.name
        return <div style={{backgroundColor:'white'}}>
            {this.state.isFirst + "..."}
            <br/>
            Id:<input type="number" name="id" className={x} onChange={(event)=>this.setState({[event.target.name]:event.target.value})} />
            
            Name:<input type="text" name="name" className={this.state.name.length<5 && !this.state.isFirst?'form-control is-invalid':'form-control'} onChange={(event)=>{this.setState({[event.target.name]:event.target.value})}} 
                onBlur={()=>{
                    if(this.state.name.length<5)
                        this.setState({isFirst:false})
                }}
            />
            {!this.state.isFirst && this.state.name.length<5 && <span className="text-danger">Name must be atleast 5 characters</span>}<br/>
            Price:<input type="number" name="price" className={(this.state.price<100 && !this.state.isFirst)?'form-control is-invalid':'form-control'} onChange={(event)=>this.setState({[event.target.name]:event.target.value})} 
            onBlur={    ()=>{
                if(this.state.price<100)    
                    this.state.isFirst=false
            }}
            
            />
            <br/>
            <input type="button" value="Add" className={this.fnIsValid()?'btn btn-info':'btn btn-info disabled'} onClick={this.fnAdd} />&nbsp;
            <input type="button" value="Update" className="btn btn-warning" onClick={this.fnUpdate} />&nbsp;
            <input type="button" value="Delete" className="btn btn-danger" onClick={this.fnDelete} />&nbsp;            
            <br/>
            { this.state.id }<br/>
            {   this.state.name }<br/>
            {   this.state.price}<br/>
        </div>
    }
}