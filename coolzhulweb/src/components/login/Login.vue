<template>
  <el-container>
    <el-header></el-header>
    <el-main>
      <el-row>
        <el-col :span="10">
          <img src="src/assets/undraw_Software_engineer_re_fyew.png" />
        </el-col>
        <el-col :span="14">
          <div class="login">
            
          </div>
          <el-form :model="form" label-width="80px">
            <el-form-item>
              <el-input
                v-model="form.userName"
                placeholder="请输入用户名"
                :prefix-icon="User"
              >
              </el-input>
            </el-form-item>
            <el-form-item>
              <el-input
                v-model="form.passWord"
                placeholder="请输入密码"
                :prefix-icon="Lock"
              ></el-input>
            </el-form-item>
            <el-form-item>
              <el-button type="primary" @click="onSubmit">登陆</el-button>
            </el-form-item>
          </el-form>
        </el-col>
      </el-row>
    </el-main>
    <el-footer></el-footer>
  </el-container>
</template>

<script lang = 'ts' setup>
import { reactive } from "vue";
import { User, Lock } from "@element-plus/icons-vue";

// do not use same name with ref
const form = reactive({
  userName: "",
  passWord: "",
});

const onSubmit = () => {
  console.log("submit!");
};
</script>

<style>

</style>