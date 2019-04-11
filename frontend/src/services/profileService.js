import Api from './Api'

export default {
  getById(id) {
    return Api().get(`api/profile/${id}`)
  },
  save(profile) {
    return Api().post(`api/profile`, profile);
  }
}