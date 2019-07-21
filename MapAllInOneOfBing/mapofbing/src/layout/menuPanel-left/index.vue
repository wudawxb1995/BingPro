<!-- 用于切换图源数据组件。比如矢量、栅格、影像等 -->
<template>
  <el-container>
    <el-aside style="width:200px">
      <datadiv></datadiv>
    </el-aside>
  </el-container>
</template>

<script>
import datadiv from "./components/datadiv";
export default {
  name: "dataBar",
  components: {
    datadiv
  }
  //   mounted() {
  //     console.log(this.$refs.asideConRef);
  //     this.$refs.asideConRef.$el.style.width = 100 + "px";
  //   }
};
</script>

<style scoped>
.el-container {
  width: 300px;
  float: left;
}
</style>




