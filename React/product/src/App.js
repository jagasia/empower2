import './App.css';
import { All } from './Components/All';
import { ProductForm } from './Components/ProductForm';
import { ProductGrid } from './Components/ProductGrid';

function App() {
  return (
    <div className="App">
      <div class="p-5 container-fluid text-center text-white bg-info">
        <h1>Welcome to Product Demo</h1>
      </div>
      <div class="row">
        <div class="col-sm-4"></div>
        <div class="col-sm-4">
          <ProductForm />
        </div>
        <div class="col-sm-4"></div>
      </div>
<hr/><hr/>
      <div class="row">
        <div class="col-sm-2">
          <All />
        </div>
        <div class="col-sm-8">
          <ProductGrid />
        </div>
        <div class="col-sm-2"></div>
      </div>

    </div>
  );
}

export default App;
