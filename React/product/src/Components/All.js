import { useEffect, useState } from "react"
import AllService from "../Services/AllService"

export const All=()=>{
    const [users,setUsers]=useState([])
    useEffect(()=>{
        //call rest api
        AllService.getAllUsers().then((response)=>{
            setUsers(response.data)
            
        })
        .catch((err)=>{
            alert("token is invalid")
        })
    },[])
    return <div>
        <ul>
        {
            users.map((user)=>
            <li>{user.fullName}</li>
            )
        }
        </ul>
    </div>
}