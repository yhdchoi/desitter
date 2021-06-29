<template>
  <Header />
  <router-view />
  <Footer />
</template>

<script>
  import Header from "./components/Header.vue";
  import Footer from "./components/Footer.vue";

  export default {
    components: { Header, Footer },
  };
</script>

<style>
  #app {
    font-family: Avenir, Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
  }

  * {
    margin: 0;
    padding: 0;
  }

  .cell {
    float: left;
  }

  .cell-right {
    float: right;
  }

  .row {
    content: "";
    display: block;
  }

  .container {
    max-width: 90vw;
    margin: 0 auto;
    background: #ddd;
    text-align: left;
    margin-top: 10px;
    padding: 20px;
    border-radius: 20px;
    box-sizing: border-box;
    z-index: 9;
  }
</style>
