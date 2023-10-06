import { Route, Routes } from 'react-router-dom';
import './App.css';
import { About } from './Components/About';
import { Contact } from './Components/Contact';
import { Home } from './Components/Home';
import { Login } from './Components/Login';
import { Menu } from './Components/Menu';

function App() {
  return (
    <div className="App">
      <div class="container-fluid p-5 bg-primary text-center text-white">
      <h1>Welcome to Routing Demo</h1>
      </div>

    <Menu />
      <br/>
      <div class="row">
        <div class="col-sm-4">
          
        </div>
        <div class="col-sm-4">

        <Routes>
            <Route path='/about' element={ <About />  }></Route>
            <Route path='/home' element={ <Home /> }></Route>
            <Route path='/contact' element={ <Contact />}></Route>
            <Route path='/login' element={<Login />}></Route>            
          </Routes>
        </div>
        <div class="col-sm-4">
        
        </div>
      </div>
    </div>
  );
}

export default App;
