<template>
    <el-container >
        <el-aside style="width:200px">
            <service></service>
        </el-aside>
    </el-container>
</template>

<script>
import service from "./components/services";
export default {
    name:'menu-right',
    components:{
        service
    }
}
</script>

<style scoped>
.el-container{
    float:right
}
</style>


