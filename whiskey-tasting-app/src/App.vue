<script setup>
const f7Params = {
  name: 'Whiskey tasting'
}
</script>

<template>
  <f7-app v-bind="f7Params">
    <f7-navbar :title="f7Params.name"></f7-navbar>
  </f7-app>
</template>

<style scoped></style>
