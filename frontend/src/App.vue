<template>
  <div id="app">
    <div>
      <b-navbar toggleable="lg" type="dark" variant="primary">
        <b-navbar-brand to="/">Logfolio</b-navbar-brand>
        <b-navbar-toggle target="nav-collapse"></b-navbar-toggle>
        <b-collapse id="nav-collapse" is-nav>
          <b-navbar-nav>
            <!--            <router-link to="/">Home</router-link>-->
            <!--            <router-link to="/about">About</router-link>-->
            <b-nav-item to="/projects">My Projects</b-nav-item>
            <b-nav-item to="/projects">About Me</b-nav-item>
          </b-navbar-nav>


          <b-navbar-nav class="ml-auto">
            <b-nav-item-dropdown right>
              <!-- Using 'button-content' slot -->
              <template slot="button-content"><em>User</em></template>
              <b-dropdown-item to="/profile" v-if="loggedIn">Profile</b-dropdown-item>
              <b-dropdown-item to="/login" v-if="!loggedIn">Log In</b-dropdown-item>
              <b-dropdown-item v-else @click="logOut">Log Out</b-dropdown-item>
            </b-nav-item-dropdown>
          </b-navbar-nav>

        </b-collapse>
      </b-navbar>
    </div>
    <router-view/>
    <div class="text-center center-block footer fixed-bottom">
      <a href="https://www.linkedin.com/in/bartosz-kruba-044ba6171/"><i id="social-li" class="social fab fa-linkedin m-3"></i></a>
      <a href="#"><i id="social-em" class=" social fas fa-envelope-square m-3"></i></a>
      <a href="https://github.com/bartoszkruba"><i  id="social-gh" class="social fab fa-github-square m-3"></i></a>
    </div>
  </div>
</template>

<script>
  export default {
    computed: {
      loggedIn() {
        return this.$store.state.loggedIn;
      }
    },
    methods: {
      logOut() {
        this.$store.commit('setLoggedIn', false);
        this.$router.push('/')
      }
    }
  }
</script>

<style>
  #app {
    font-family: 'Avenir', Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
  }

  #nav {
    padding: 30px;
  }

  #nav a {
    font-weight: bold;
    color: #2c3e50;
  }

  #nav a.router-link-exact-active {
    color: #42b983;
  }

  .footer {
    background-color: #375a7f;
    /*border-top: 1px solid #adb5bd;*/
  }

  .social:hover {
    -webkit-transform: scale(1.1);
    -moz-transform: scale(1.1);
    -o-transform: scale(1.1);
  }

  .social {
    color: #adb5bd;
    font-size: 400%;
    -webkit-transform: scale(0.8);
    /* Browser Variations: */

    -moz-transform: scale(0.8);
    -o-transform: scale(0.8);
    -webkit-transition-duration: 0.5s;
    -moz-transition-duration: 0.5s;
    -o-transition-duration: 0.5s;
  }

  /*
      Multicoloured Hover Variations
  */

  #social-li:hover {
    color: #fff;
  }

  #social-em:hover {
    color: #fff;
  }

  #social-gh:hover {
    color: #FFF;
  }

</style>
