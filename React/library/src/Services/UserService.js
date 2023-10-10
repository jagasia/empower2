import axios from "axios";

class UserService
{
    URL="http://localhost:5000/"

    signup(user)
    {
        return axios.post(this.URL+'signup',user)
    }

    login(user)
    {
        return axios.post(this.URL+'login',user)
    }

    findUserByUsername(username)
    {
        let token='';
        token=localStorage.getItem('token');
        if(token==null || token=='')
            return;
        let header={
            'authorization': 'Bearer '+token,
            'Accept' : 'application/json',
            'Content-Type': 'application/json'
        }
        return axios.get(this.URL+"user/"+username,{headers:header});
    }

}
export default new UserService