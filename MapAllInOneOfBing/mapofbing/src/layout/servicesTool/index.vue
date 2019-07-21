<template>
  <div>
      <Legend id="legendVue"></Legend>
      <DataMonitor id="DataMonitor"></DataMonitor>
  </div>
</template>

<script>
import Legend from "./components/legend";
import DataMonitor from './components/dataMonitor'
export default {
  name: "servicesTool",
  components: {
    Legend,
    DataMonitor
  }
};
</script>

<style scoped>
#legendVue{
    position: absolute;
    left: 0;
    bottom:0;
}
#DataMonitor{
    position: absolute;
    bottom: 0;
    right: 0;
}
</style>

