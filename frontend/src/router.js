import Vue from 'vue'
import Router from 'vue-router'
import Home from './views/Home.vue'
import LogIn from './views/LogIn'
import UpdateProfile from './views/UpdateProfile'
import AboutMe from './views/AboutMe'

Vue.use(Router);

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home
    },
    {
      path: '/login',
      name: 'login',
      component: LogIn
    },
    {
      path: '/updateprofile',
      name: 'update profile',
      component: UpdateProfile
    },
    {
      path: '/aboutme',
      name: 'about me',
      component: AboutMe
    }
  ]
})
