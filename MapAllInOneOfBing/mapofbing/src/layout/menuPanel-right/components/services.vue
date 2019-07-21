<template>
  <el-menu>
    <el-submenu index="1">
      <template slot="title">
        <i class="el-icon-folder"></i>双评价模块
      </template>
      <el-menu-item index="1-1">
        <el-button type="primary" round>水资源评价</el-button>
      </el-menu-item>
      <el-menu-item index="1-2">
        <el-button type="primary" round>土地资源评价</el-button>
      </el-menu-item>
      <el-menu-item index="1-3">
        <el-button type="primary" round>环境资源评价</el-button>
      </el-menu-item>
      <el-menu-item index="1-4">
        <el-button type="primary" round>。。。</el-button>
      </el-menu-item>
    </el-submenu>
    <el-submenu index="2">
      <template slot="title">
        <i class="el-icon-menu"></i>基础操作模块
      </template>
      <el-menu-item index="2-1">
        <el-button type="primary" round>鹰眼功能</el-button>
      </el-menu-item>
      <el-menu-item index="2-2">
        <el-button type="primary" round>打印功能</el-button>
      </el-menu-item>
      <el-menu-item index="2-3">
        <el-button type="primary" round>测量功能</el-button>
      </el-menu-item>
      <el-menu-item index="2-4">
        <el-button type="primary" round>。。。</el-button>
      </el-menu-item>
    </el-submenu>
    <el-submenu index="3">
      <template slot="title">
        <i class="el-icon-setting"></i>制图辅助模块
      </template>
      <el-menu-item index="3-1">
        <el-button type="primary" round>图块修改模块</el-button>
      </el-menu-item>
      <el-menu-item index="3-2">
        <el-button type="primary" round>图块属性查询</el-button>
      </el-menu-item>
      <el-menu-item index="3-3">
        <el-button type="primary" round>图块合并功能</el-button>
      </el-menu-item>
      <el-menu-item index="4-4">
        <el-button type="primary" round>。。。</el-button>
      </el-menu-item>
    </el-submenu>
  </el-menu>
</template>

<script>
export default {
  name: "services"
};
</script>

<style scoped>
.el-button {
  width: 120px;
}
</style>




