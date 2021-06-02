<template>
  <div class="main row">
    <div class="profileBox cell">
    <Profile />
    </div>
    <div class="articleBox cell">
    <MyArticle />
    </div>
  </div>
</template>

<script>
  import Profile from "../components/Profile.vue";
  import MyArticle from "../components/ListMyArticle.vue";

  export default {
    name: "Main",
    components: {
      Profile,
      MyArticle,
    },
  };
</script>

<style scoped>
  .main {
    background: white;
  }
</style>
