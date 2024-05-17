TODO 写一个修改用户信息的按钮,跳转到修改信息界面，跳转到这里：src\views\customer\editinfofunction\EditAccountView.vue
<template>
  <div id="manage">
    <el-container>
      <el-header class="custom-header">速味达外卖系统欢迎您</el-header>
      <el-container>
        <el-aside width="200px" class="">
          <el-menu default-active="2" class="el-menu-vertical-demo" background-color="#545c64" text-color="#fff"
            active-text-color="#ffd04b" :router=flag>
            <el-menu-item index="/customer/manage/order">
              <i class="el-icon-menu"></i>
              <span slot="title">点餐</span>
            </el-menu-item>
            <el-menu-item index="/customer/manage/history">
              <i class="el-icon-menu"></i>
              <span slot="title">历史订单查询</span>
            </el-menu-item>
          </el-menu>
        </el-aside>
        <el-main>
          <router-view></router-view>
        </el-main>
      </el-container>
    </el-container>
  </div>
</template>
<script>
  export default {
    data () {
      return {
        activeIndex2: '',
        flag: true,//router配置，默认不要动
      };
    },
    methods: {
      created () {
        this.activeIndex2 = this.$route.path
      }
    },
    mounted () {

    }
  }
</script>

<style>
  #manage {
    position: absolute;
    top: 0;
    bottom: 0;
    left: 0;
    right: 0;
  }

  .el-header,
  .el-footer {
    background-color: #B3C0D1;
    color: #333;
    text-align: center;
    line-height: 60px;
  }

  .el-aside {
    background-color: #D3DCE6;
    color: #333;
    text-align: center;
    line-height: 100%;
  }

  .el-container {
    height: 100%;
  }

  .el-menu {
    height: 100%;
  }

  .custom-header {
    padding: 40px 0;
    /* 上下各20px，左右0px */
    /* 你也可以添加水平间距，例如 padding: 20px 15px; */
    background: linear-gradient(to right, #ff9966, #ff5e62);
    /* 从左到右的渐变 */
    color: #fff;
    /* 确保文本颜色与背景色形成对比 */
    /* background-image: url('../../../src/assets/headbackground.jpg'); */
    /* 替换为你的图片URL */
    background-repeat: no-repeat;
    /* 不重复图片 */
    background-size: cover;
    /* 图片覆盖整个容器 */
  }

  .custom-header {
    font-size: 30px;
    /* 字体大小 */
    font-weight: bold;
    /* 字体加粗 */
    color: #530e0e;
    /* 字体颜色，可以根据你的品牌色或主题色来设置 */
    line-height: 0.2;
    /* 行高，可以根据需要调整 */
    /* 还可以添加其他字体样式，如 font-family 来指定字体 */
  }

  .custom-side {
    padding: 40px 0;
    /* 上下各20px，左右0px */
    /* 你也可以添加水平间距，例如 padding: 20px 15px; */
    background: linear-gradient(to right, #ff9966, #ff5e62);
    /* 从左到右的渐变 */
    color: #fff;
    /* 确保文本颜色与背景色形成对比 */
    /* background-image: url('../../../src/assets/headbackground.jpg'); */
    /* 替换为你的图片URL */
    background-repeat: no-repeat;
    /* 不重复图片 */
    background-size: cover;
    /* 图片覆盖整个容器 */
  }
</style>