import axios from 'axios';

const baseUrl = `http://${window.location.host}`;

export default () => {
  return axios.create({
    baseURL: baseUrl
  })
}
