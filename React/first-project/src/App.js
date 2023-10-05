import './App.css';
import Counter from './Components/Counter';
import Hello from './Components/Hello';
import Welcome from './Components/Welcome';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <Hello />
        <Welcome name="Raja" />
        <Counter />
      </header>
    </div>
  );
}

export default App;
