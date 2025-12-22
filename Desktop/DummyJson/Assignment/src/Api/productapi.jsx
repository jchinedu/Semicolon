import React from "react";
import { createApi, fetchBaseQuery } from "@reduxjs/toolkit/query/react";   

const BASE_URL = import.meta.env.VITE_BASE_URL;
console.log("Base URL:", BASE_URL); 

export const productApi = createApi({
    reducerPath: "products",
    baseQuery: fetchBaseQuery({ baseUrl: BASE_URL }),
    endpoints: (builder) => ({
        getAllProducts: builder.query({
            query: () => ("/products")

        }),
    }),
});

export const { useGetAllProductsQuery } = productApi;