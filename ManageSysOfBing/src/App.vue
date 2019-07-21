<template>
  <div id="app" >
    <router-view />
    <axiosCom></axiosCom>
  </div>
</template>

<script>
import axiosCom from './components/axiosCom/index'

export default {
  name: 'App',
  components:{
    axiosCom
  }
}
</script>

<style>
  #app{
    height: 100%
  }
</style>


