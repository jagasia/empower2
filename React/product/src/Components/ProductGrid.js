import { useEffect, useState } from "react";
import ProductService from "../Services/ProductService";

export const ProductGrid = () => {
    const [products, setProducts] = useState([]);

    useEffect(() => {
        ProductService.getAllProducts().then((response) => {
            setProducts(response.data)

        })
    }, [])

    return <div>
        <table class="table table-bordered table-striped table-hover">
            <thead>
                <tr>
                    <th>Id</th><th>Name</th><th>Price</th><th></th>
                </tr>
            </thead>
            <tbody>
                {
                    products.map((product) =>
                        <tr>
                            <td>{product.id}</td>
                            <td>{product.name}</td>
                            <td>{product.price}</td>
                            <td></td>
                        </tr>
                    )
                }
            </tbody>
        </table>
    </div>
}