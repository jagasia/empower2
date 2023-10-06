/* create additional functions here */

import { useState } from "react";
import { useNavigate } from "react-router-dom";


export const Login=()=>
{
    const [username,setUsername]=useState("raja");
    const [password,setPassword]=useState("raja@123");
    const navigate=useNavigate();
    return <div>
        Username: <input type="text" name="username" className="form-control" onChange={ (event)=>setUsername(event.target.value)  } />
        Password: <input type="password" name="password" className="form-control" onChange={ (event)=>setPassword(event.target.value)   } /><br/>
        <input type="button" className="btn btn-info" value="Login" onClick={()=>{
            if(username==password)
            {
                navigate("/failure");
            }else{
                navigate("/home");
            }
        }} />
        <br/>
        {  username }
        <br/>
        {  password }
    </div>
}