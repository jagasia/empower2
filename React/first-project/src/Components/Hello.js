const Hello=(props)=>{
    return <h1>Hello {props.name} and your nick name is {props.nickname} </h1>
}

// function Hello(props)
// {
//     // return <h1>Hello {props.name} and your nick name is {props.nickname} </h1>
//     // return React.createElement("p",null,React.createElement("i",null,"Hello world"))
//     return <p><i>Hello world</i></p>
// }
export default Hello