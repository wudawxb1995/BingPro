<!-- 顶部导航栏index=1的组件。用于打开左侧侧边栏 -->
<template>
  <div id="left-panal" >
      <svg-icon icon-class="menu" id="svg-icon-hamburger"></svg-icon>
  </div>
</template>

<script>
export default {
  name: "Hamburger",
  methods: {
    toggleClick() {
      // this.$emit("toggleClick");
    }
  }
};
</script>

<style>
#svg-icon-hamburger {
  min-height: 50px;
  min-width: 50px;
}
</style>


