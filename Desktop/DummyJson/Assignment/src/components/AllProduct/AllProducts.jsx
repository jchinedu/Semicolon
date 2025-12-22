import React from "react";
import { useGetAllProductsQuery } from "../../Api/productapi";
import "./AllProductS.css";

const AllProducts = () => {
  const { data, error, isLoading } = useGetAllProductsQuery();

  if (isLoading) return <p>Loading products...</p>;
  if (error) return <p>Failed to load products.</p>;

  // Safely handle if data is undefined
  const products = data?.products ?? [];

  return (
    <div className="products-container">
      <h2>All Products</h2>
      <div className="products-grid">
        {products.length > 0 ? (
          products.map((item) => (
            <div key={item.id} className="product-card">
              <img src={item.thumbnail} alt={item.title} />
              <h3>{item.title}</h3>
              <p className="description">{item.description}</p>
              <p className="price">₦{item.price}</p>

              <button className="add-to-cart">Add to cart</button>
            </div>
          ))
        ) : (
          <p>No products found.</p>
        )}
      </div>
    </div>
  );
};

export default AllProducts;
