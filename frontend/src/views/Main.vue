<template>
  <div class="main row">
    <div class="profileBox cell">
    <Profile />
    </div>
    <div class="articleBox cell">
      
    </div>
  </div>
</template>

<script>
  import Profile from "../components/Profile.vue";

  export default {
    name: "Main",
    components: {
      Profile,
    },
  };
</script>

<style scoped>
  .main {
    background: white;
  }
</style>
