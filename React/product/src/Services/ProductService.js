import axios from "axios";

class ProductService
{
    URL='http://localhost:5000/product'

    getAllProducts()
    {
        return axios.get(this.URL);
    }

    findProductById(id)
    {
        return axios.get(this.URL+"/"+id);
    }

    addProduct(product)
    {
        return axios.post(this.URL,product);
    }

    updateProduct(product)
    {
        return axios.put(this.URL,product);
    }

    deleteProduct(id)
    {
        return axios.delete(this.URL+"/"+id);
    }
}
export default new ProductService();