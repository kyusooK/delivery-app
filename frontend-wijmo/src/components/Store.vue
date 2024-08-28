<template>
    <div>
        <Number label="상점 ID" v-model="value.storeId" :editMode="editMode"/>
        <String label="이름" v-model="value.name" :editMode="editMode"/>
        <String label="전화번호" v-model="value.phone" :editMode="editMode"/>
        <Address offline label="주소" v-model="value.address" :editMode="editMode" @change="change"/>

        <v-divider class="border-opacity-100 my-divider"></v-divider>
        <v-layout row justify-end>
            <v-btn
                width="64px"
                color="primary"
                @click="save"
            >
                저장
            </v-btn>
        </v-layout>
    </div>
</template>


<script>

import BaseEntity from './base-ui/BaseEntity'

export default {
    name: 'Store',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "stores"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>

