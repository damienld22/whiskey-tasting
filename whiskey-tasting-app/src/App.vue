<script setup>
import HomeView from './views/HomeView.vue'
import AddTastingView from './views/AddTastingView.vue'

const f7Params = {
  name: 'Whiskey tasting',
  routes: [
    {
      path: '/',
      component: HomeView
    },
    {
      path: '/add-tasting',
      component: AddTastingView
    }
  ]
}
</script>

<template>
  <f7-app v-bind="f7Params">
    <f7-view main url="/"></f7-view>
  </f7-app>
</template>

<style scoped></style>
