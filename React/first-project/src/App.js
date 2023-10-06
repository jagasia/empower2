import './App.css';
import Counter from './Components/Counter';
import Login from './Components/Login';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        {/* <Hello />
        <Welcome name="Raja" />
        <Counter /> */}
        <Counter />
        <Login />
      </header>
    </div>
  );
}

export default App;
