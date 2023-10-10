import { Route, Routes } from 'react-router-dom';
import './App.css';
import Book from './Components/Book';
import { Error } from './Components/Error';
import Login from './Components/Login';
import { Menu } from './Components/Menu';

function App() {
  return (
    <div className="App">
      <div className='p-5 container-fluid text-white bg-dark text-center'>
        <h1>Library System</h1>
      </div>
      <Menu />
      {/* welcome message here */}

      <div className='row'>
        <div className='col-md-4'></div>
        <div className='col-md-4'>
          {/* main components here */}
          {/* <Register /> */}
          <Routes>
            <Route path='/login' element={<Login />} />
            <Route path='/book' element={<Book />}></Route>
            <Route path='/error' element={<Error />}></Route>
          </Routes>
        </div>
        <div className='col-md-4'></div>
      </div>

    </div>
  );
}

export default App;
