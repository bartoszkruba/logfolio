<template>
  <div class="mt-5">
    <aside class="col-sm-4 ml-auto mr-auto">
      <b-card bg-variant="dark" class="card">
        <article class="card-body">
          <h4 class="card-title mb-4 mt-1">Log in</h4>
          <b-alert show variant="danger" v-if="showError">Incorrect Credentials</b-alert>
          <form>
            <div class="form-group">
              <label>Your email</label>
              <input class="form-control" placeholder="Email"
                     type="email" v-model="email"
                     v-on:keydown.enter="logIn">
            </div> <!-- form-group// -->
            <div class="form-group">
              <label>Your password</label>
              <input class="form-control" placeholder="Password"
                     type="password" v-model="password"
                     v-on:keydown.enter="logIn">
            </div> <!-- form-group// -->
            <div class="form-group">
              <div class="checkbox">
                <label> <input type="checkbox"> Save password </label>
              </div> <!-- checkbox .// -->
            </div> <!-- form-group// -->
            <div class="form-group">
              <button type="button" @click="logIn" class="btn btn-primary btn-block"> Login</button>
            </div> <!-- form-group// -->
          </form>
        </article>
      </b-card> <!-- card.// -->
    </aside> <!-- col.// -->
  </div>
</template>

<script>
  import authenticationService from "../services/authenticationService";

  export default {
    profileName: "LogIn",
    data() {
      return {
        email: '',
        password: '',
        showError: false
      }
    },
    methods: {
      async logIn() {
        const response = await authenticationService.login(this.email, this.password);
        if (response.data === true) {
          this.showError = false;
          this.$store.commit("setLoggedIn", true);
          this.$router.push('/updateprofile');
        } else {
          this.showError = true;
        }
      }
    }
  }
</script>

<style scoped>

  label, h4 {
    color: #fff;
  }

</style>