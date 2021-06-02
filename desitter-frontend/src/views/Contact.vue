<template>
  <div class="contact">
    <h2>Contact</h2>
    <form action="">
      <label>Email:</label>
      <input type="email" required v-model="email" />

      <label>Subject:</label>
      <input type="text" required v-model="subject" />

      <br />
      <textarea name="textarea">Hello.</textarea>

      <div class="submit">
        <button>Send</button>
      </div>
    </form>
  </div>
</template>

<script>
  export default {};
</script>

<style scoped>
  h2 {
    text-align: center;
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
  textarea {
    width: 100%;
    height: 200px;
    border: 1px solid #ddd;
    border-radius: 10px;
    margin: 0 auto;
    font-size: 14px;
    outline: none;
    resize: none;
    overflow: auto;
    padding: 10px;
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
