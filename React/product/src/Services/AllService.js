import axios from "axios";

class AllService
{
    URL='http://localhost:5001/all'

    getAllUsers()
    {

        let token='eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjaGVubmEiLCJleHAiOjE2OTY4NjY3NzIsImlhdCI6MTY5NjgzMDc3Mn0.y9OmedmmNzqS5Lk8gFkVRyihEHl9tiozEYrtRFozMco';
        let header={
            'authorization': 'Bearer '+token,
            'Accept' : 'application/json',
            'Content-Type': 'application/json'
        }
        return axios.get(this.URL,{
            headers: header
        });
    }
}
export default new AllService
