<template>
  <div class="mt-5">
    <aside class="col-sm-4 ml-auto mr-auto">
      <b-card bg-variant="dark" class="card">
        <article class="card-body">
          <h4 class="card-title mb-4 mt-1">Log in</h4>
          <form>
            <div class="form-group">
              <label>Your email</label>
              <input profileName="" class="form-control" placeholder="Email" type="email">
            </div> <!-- form-group// -->
            <div class="form-group">
              <label>Your password</label>
              <input class="form-control" placeholder="******" type="password">
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
  export default {
    profileName: "LogIn",
    methods: {
      logIn() {
        this.$store.commit('setLoggedIn', true);
        this.$store.commit('setProfileName', 'Bartosz Kruba');
        this.$router.push('updateprofile');
      }
    }
  }
</script>

<style scoped>

  label, h4{
    color: #fff;
  }

</style>