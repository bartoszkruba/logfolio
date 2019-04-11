import Api from './Api'

export default {
  getProfile(id) {
    return Api().get(`api/profile/${id}`)
  }
}