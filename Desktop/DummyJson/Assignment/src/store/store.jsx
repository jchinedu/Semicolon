import {configureStore} from '@reduxjs/toolkit';
import {LoginApi} from '../Api/LoginApi';
import { productApi } from '../Api/productapi';

export const store2 = configureStore({
    reducer: {
        [LoginApi.reducerPath]: LoginApi.reducer,
    },
    middleware: (getDefaultMiddleware) =>
        getDefaultMiddleware().concat(LoginApi.middleware),

});
export const store = configureStore({
    reducer: {
        [productApi.reducerPath]: productApi.reducer,
    },
    middleware: (getDefaultMiddleware) =>
        getDefaultMiddleware().concat(productApi.middleware), 
});