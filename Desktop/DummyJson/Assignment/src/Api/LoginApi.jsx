import {createApi,fetchBaseQuery} from '@reduxjs/toolkit/query/react';

const BASE_URL = import.meta.env.VITE_BASE_URL;

export const LoginApi = createApi({
    reducerPath: 'LoginApi',
    baseQuery: fetchBaseQuery({baseUrl: BASE_URL}),
    endpoints: (builder) => ({
        loginUser: builder.mutation({
            query: (data) => ({
                url: '/auth/login',
                method: 'POST',
                body: {
                    username: data.username,
                    password: data.password,
                    expiresInMins: data.expiresInMins || 30,
                },
            }),
        }),
    }),
});     
export const { useLoginUserMutation } = LoginApi;
                