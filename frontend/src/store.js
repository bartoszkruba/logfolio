import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex);

export default new Vuex.Store({
  state: {
    profilePicture: "",
    profileName: "Bartosz Kruba",
    loggedIn: true
  },
  mutations: {
    setProfilePicture(state, value) {
      state.profilePicture = value;
    },
    setProfileName(state, value) {
      state.profileName = value
    },
    setLoggedIn(state, value) {
      state.loggedIn = value;
    }
  },
  actions: {}
})
