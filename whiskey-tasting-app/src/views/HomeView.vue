<script setup>
import AddButton from '../components/AddButton.vue'

const props = defineProps({
  f7router: Object
})
</script>

<template>
  <f7-page name="home">
    <f7-navbar title="Dégustations de whisky"></f7-navbar>

    <AddButton @on-click="props.f7router.navigate('/add-tasting')" />
  </f7-page>
</template>
