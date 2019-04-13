import Api from './Api'

export default {
  getById(id) {
    return Api().get(`profile/${id}`)
  },
  save(profile) {
    return Api().post(`profile`, profile);
  }
}