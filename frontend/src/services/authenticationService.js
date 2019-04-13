import Api from './Api'

export default {
  login(email, password) {
    return Api().get(`/auth/login?email=${email}&password=${password}`)
  }
}