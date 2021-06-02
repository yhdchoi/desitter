<template>
  <div class="header row">
    <div class="banner cell">
      <router-link :to="{ name: 'Home' }" class="homeLink">
        DEcrypt
      </router-link>
    </div>
    <div class="row cell-right navBar">
      <router-link :to="{ name: 'Contact' }" class="cell-right buttonWrap contactLink" >Contact</router-link >
      <router-link :to="{ name: 'SignupUser' }" class="cell-right buttonWrap signupLink">SignUp</router-link>
      <router-link :to="{ name: 'Login' }" class="cell-right buttonWrap loginLink" >Login</router-link >
      <!-- <p class="cell-right buttonWrap logout">Logout</p> -->
    </div>
  </div>
</template>

<script>
  export default {
    name: "Header",
  };
</script>

<style scoped>
  .header {
    width: 100%;
    height: 40px;
    background: #aaa;
    position: fixed;
    top: 0;
    overflow: hidden;
  }
  .banner {
    width: 100px;
    height: 30px;
    text-decoration: none;
    line-height: 40px;
  }
  .homeLink {
    color: aquamarine;
    font-weight: bold;
    font-size: 20px;
  }
  .homeLink:hover {
    color: aqua;
  }
  .navBar {
    width: 350px;
    height: 30px;
    background: #aaa;
    font-weight: bold;
    font-size: 14px;
    color: black;
    line-height: 40px;
  }
  .buttonWrap {
    width: 100px;
    height: 30px;
    color: black;
    text-decoration: none;
  }
  .loginLink:hover {
    color: rgb(255, 0, 242);
  }
  .signupLink:hover {
    color: rgb(255, 196, 0);
  }
  .contactLink:hover {
    color: rgb(80, 176, 255);
  }
  .logout {
    color: red;
  }
</style>
