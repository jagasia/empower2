/* create additional functions here */

import { useState } from "react";


export const Login=()=>
{
    const [username,setUsername]=useState("raja");
    const [password,setPassword]=useState("raja@123");
    return <div>
        Username: <input type="text" name="username" className="form-control" onChange={ (event)=>setUsername(event.target.value)  } />
        Password: <input type="password" name="password" className="form-control" onChange={ (event)=>setPassword(event.target.value)   } /><br/>
        <input type="button" className="btn btn-info" value="Login" />
        <br/>
        {  username }
        <br/>
        {  password }
    </div>
}