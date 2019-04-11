import Vue from 'vue'
import Vuex from 'vuex'
import profileService from "./services/profileService";

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
  actions: {
    // eslint-disable-next-line
    async getProfileById(id) {
      const response = await profileService.getById(1);
      this.commit("setProfile", response.data);
    }
  }
})
