<template>
  <div class="home">
    <h2>home</h2>
    <Main />    
  </div>
</template>

<script>
import Main from "../views/Main";

  export default {
    name: "Home",
    components: { Main },
  };
</script>

<style scoped>
  .home {
    margin-top: 60px;
  }

</style>
