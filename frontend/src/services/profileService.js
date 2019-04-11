import Api from './Api'

export default {
  getById(id) {
    return Api().get(`api/profile/${id}`)
  }
}