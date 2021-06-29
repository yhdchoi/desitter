<template>
  <div class="login">
    <form action="">
      <label>Email:</label>
      <input type="email" required />

      <label>Password:</label>
      <input type="password" required />

      <div class="submit">
        <button>Login</button>
      </div>
    </form>
  </div>
</template>

<script>
  export default {};
</script>

<style scoped>
  .login {
    width: 100%;
    height: 500px;
  }

  form {
    max-width: 420px;
    margin: 30px auto;
    background: white;
    text-align: left;
    padding: 40px;
    border-radius: 10px;
  }
  label {
    color: #aaa;
    display: inline-block;
    margin: 25px 0 15px;
    font-size: 0.6em;
    text-transform: uppercase;
    letter-spacing: 1px;
    font-weight: bold;
  }
  input {
    display: block;
    padding: 10px 6px;
    width: 100%;
    box-sizing: border-box;
    border: none;
    border-bottom: 1px solid #ddd;
    color: #555;
  }
  button {
    background: aquamarine;
    border: 0;
    padding: 10px 20px;
    margin-top: 20px;
    color: black;
    border-radius: 20px;
  }
  button:hover {
    background: aqua;
  }
  .submit {
    text-align: center;
  }
  .error {
    color: red;
    margin-top: 10px;
    font-size: 0.8em;
    font-weight: bold;
  }
</style>
