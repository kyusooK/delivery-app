<template>
    <div>
        <Number label="알림 ID" v-model="value.notificationId" :editMode="editMode"/>
        <String label="메시지" v-model="value.message" :editMode="editMode"/>
        <Date label="알림 시간" v-model="value.notificationTime" :editMode="editMode"/>
        <CustomerId offline label="고객 ID" v-model="value.customerId" :editMode="editMode" @change="change"/>
        <OrderId offline label="주문 ID" v-model="value.orderId" :editMode="editMode" @change="change"/>

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
    name: 'Notification',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "notifications"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>

