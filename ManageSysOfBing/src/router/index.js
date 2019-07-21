import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)
/**
 * @param constantRoutes ——静态组件集合，这些组件不需要权限管理，所有角色均可应用
 */
export const constantRoutes = [

    // login组件
    {
        path: '/login',
        component: () => import('@/views/login/index.vue'),
        hidden: true
    }

]

/**
 * @param asyncRoutes ——异步组件集合，需要权限管理
 */
export const asyncRoutes = [
    // 404 page must be placed at the end !!!
    { path: '*', redirect: '/404', hidden: true }
]

/**
 * @param createRouter ——new一个Router实例，并将路由配置文件，传到vueRouter实例上去。
 */
const createRouter = () => new Router({
    //切换路径模式，变成history模式，就是去掉#
    // mode: 'history', 
    //滚动条滚动的行为，不加这个默认就会记忆原来滚动条的位置
    scrollBehavior: () => ({ y: 0 }),
    routes: constantRoutes
})
// new一个配置好的router实例
const router = createRouter()
// 通过一个新的router实例，可以动态修改、删除router
// Detail see: https://github.com/vuejs/vue-router/issues/1234#issuecomment-357941465
export function resetRouter() {
    const newRouter = createRouter()
    router.matcher = newRouter.matcher // reset router
}

export default router
