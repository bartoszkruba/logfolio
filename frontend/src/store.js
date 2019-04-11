import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex);

export default new Vuex.Store({
  state: {
    profile: {
      profilePicture: "",
      profileName: "",
      contactEmail: "",
      github: "",
      linkedin: "",
      profileDescription: ""
    },
    loggedIn: true
  },
  mutations: {
    setProfile(state, value) {
      state.profile = value;
    },
    setLoggedIn(state, value) {
      state.loggedIn = value;
    },
  },
  actions: {}
})
