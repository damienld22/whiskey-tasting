<script setup>
const emits = defineEmits(['onClick'])
</script>

<template>
  <f7-fab position="right-bottom" @click="emits('onClick')">
    <f7-icon ios="f7:plus" md="material:add"></f7-icon>
  </f7-fab>
</template>
