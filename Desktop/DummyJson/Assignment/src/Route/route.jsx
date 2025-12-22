import {createBrowserRouter} from "react-router-dom";
import Login from "../Auth/login";
import HomePage from "../pages/Homepage";
import AllProducts from "../components/AllProduct/AllProducts";


const router = createBrowserRouter([
  {  
   path: "/",
   element: <Login/>
},
{
    path:"/login",
    element: <Login/>
},
{
    path:"/products",
    element: <AllProducts/>
},
{
    path:"/home",
    element: <HomePage/>
}
])

export default router;