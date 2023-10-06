import axios from 'axios';
class TodoService
{
    getTodoById(id)
    {
        console.log("Id is "+id)
        return axios.get('https://jsonplaceholder.typicode.com/todos/'+id)
    }

    getAll()
    {
        return axios.get('https://jsonplaceholder.typicode.com/todos');
    }
}
export default new TodoService();