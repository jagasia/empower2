import { useEffect, useState } from "react";
import TodoService from "../Services/TodoService";




export const Todo = () => {
    const [output, setOutput] = useState([]);
    useEffect(() => {
        // Code here will run just like componentDidMount
        TodoService.getAll().then((response) => {
            console.log(response.data);
            // alert(response.data)
            setOutput(response.data)

        });

    },[])

    // const [output,setOutput]=useState("");
    return <div><table>{
        output.map(x=>
            <tr><td>{x.id}</td>
            <td>{x.title}</td>
            </tr>
            )
        }
            </table>
    </div>
}