<!-- 用于展示顶部LOGO,侧边栏，搜索按钮，登录按键 -->
<template>
  <div id="navBar">
    <Hamburger id="nav-ham" class="navbar-comps"/>
    <LOGO id="nav-logo" class="navbar-comps" ref="logo"/>
    <Search id="nav-search" class="navbar-comps"></Search>
    <Logingate id="nav-logingate" class="navbar-comps"></Logingate>
  </div>
</template>

<script>
import Hamburger from "./components/hamburger";
import LOGO from "./components/logo";
import Search from "./components/search";
import Logingate from "./components/logingate";
export default {
  components: {
    Hamburger,
    LOGO,
    Search,
    Logingate
  },
  mounted() {
    //通过监控窗体大小，控制LOGO的宽度。
    this.$refs.logo.$el.style.width = this.screenWidth - 150 + "px";
  },
  computed: {
    screenWidth: () => {
      return document.body.clientWidth;
    },
    screenHeight: () => {
      return document.body.clientHeight;
    }
  }
};
</script>

<style>
.navbar-comps{
  margin-right: 3px;
}
#navBar {
  min-height: 50px;
  display: flex;
  /* justify-content: center; */
  align-items: center;
}
#nav-ham{
  margin: 0;
}
#nav-logo {
  min-height: 50px;
  overflow: hidden;
}
</style>


