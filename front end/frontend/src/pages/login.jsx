import React from 'react';
import {  useState } from "react";
import { useNavigate } from 'react-router-dom';
import axios from "axios";
import '../components/login.css'
import 'mdb-react-ui-kit/dist/css/mdb.min.css';



const Login=()=>{
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
  const navigate = useNavigate();


  async function login(event) {
      event.preventDefault();
      try {
        await axios.post("http://localhost:8080/newlogin", {
          username: username,
          password: password,
          }).then((res) =>
          {
           console.log(res.data);
          
           if (res.data.message === "Username not exits")
           {
             alert("Username not exits");
           }
           else if(res.data.message === "Login Success")
           {
              
              navigate('/get');
           }
            else
           {
              alert("Incorrect Username and Password not match");
           }
        }, fail => {
         console.error(fail); // Error!
});
      }

       catch (err) {
        alert(err);
      }
    
    }


return(

<div className='login-container '>
<section class=" text-center text-lg-start">
 
  <div class="card mb-3">
    <div class="row g-0 d-flex align-items-center">
      <div class="col-lg-4 d-none d-lg-flex">
        <img src="https://mdbootstrap.com/img/new/ecommerce/vertical/004.jpg" alt="Trendy Pants and Shoes"
          class="w-100 rounded-t-5 rounded-tr-lg-0 rounded-bl-lg-5" />
      </div>
      <div class="col-lg-8">
        <div class="card-body py-5 px-md-5">

          <form>
            
            <div class="form-outline mb-2">
            <label class="form-label" for="form2Example1">User name</label>
            </div>
              <input type="text"  class="form-control" value={username}
            onChange={(event) => {
              setUsername(event.target.value);
            }}/>
           

           
            <div class="form-outline mb-2">
                 <label class="form-label" for="form2Example2">Password</label>
                 </div>
              <input type="password"  class="form-control"   value={password}
           onChange={(event) => {
             setPassword(event.target.value);
           }}/>
            

        
            <div class="row mb-4">
              <div class="col d-flex justify-content-center">
               
                <div class="form-check">
                  <input class="form-check-input" type="checkbox" value="" id="form2Example31" checked />
                  <label class="form-check-label" for="form2Example31"> Remember me </label>
                </div>
              </div>

              <div class="col">
                <a href="#!">Forgot password?</a>
              </div>
            </div>

           
            <button type="button" class="btn btn-primary btn-block mb-4" onClick={login}>Sign in</button>

          </form>

        </div>
      </div>
    </div>
  </div>
</section>
</div>

)
}
export default Login;