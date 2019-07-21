<template>
  <ul>
    <li v-for="user in users">{{ user }}</li>
  </ul>
</template>

<script>
// import axios from 'axios'
import { fetch } from "@/api/DataOfBing";

export default {
  data() {
    return {
      users: []
    };
  },
  mounted() {
    var self = this;
    fetch().then(res => {
      //转变成String
      let json_data = JSON.stringify(res.data);
      //转变成Array
      let json_parse = JSON.parse(json_data);

      // console.log(json_parse);
      json_parse.forEach(param => {
        // console.log(param)
        self.users.push(param);
      });
    });
  }
};
</script>

