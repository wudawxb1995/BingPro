<!-- 用于存放地图容器、其它组件内容 -->
<template>
  <div class="containerOfMap">
    <MenuTop/>
    <MenuLeft/>
    <MenuRight/>
    <ServicesTool id="servicesTool" ref="serviceToolDiv"/>
  </div>
</template>

<script>
import MenuTop from "./menuPanel-top/index";
import MenuLeft from "./menuPanel-left/index";
import MenuRight from "./menuPanel-right/index";
import ServicesTool from "./servicesTool/index";
export default {
  components: {
    MenuTop,
    MenuLeft,
    MenuRight,
    ServicesTool
  },
  mounted(){
    //将下侧两个框分别左右放置
    this.$refs.serviceToolDiv.$el.style.width = this.screenWidth + 'px'
  },
  computed:{
    screenWidth :()=>{
      return document.body.clientWidth;
    }
  }
};
</script>





