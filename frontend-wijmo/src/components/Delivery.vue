<template>
    <div>
        <Number label="배달 ID" v-model="value.deliveryId" :editMode="editMode"/>
        <Date label="픽업 시간" v-model="value.pickupTime" :editMode="editMode"/>
        <String label="배달 상태" v-model="value.deliveryStatus" :editMode="editMode"/>
        <OrderId offline label="주문 ID" v-model="value.orderId" :editMode="editMode" @change="change"/>
        <RiderId offline label="라이더 ID" v-model="value.riderId" :editMode="editMode" @change="change"/>
        <deliveryStatusType offline label="배달 상태 유형" v-model="value.deliveryStatusType" :editMode="editMode" @change="change"/>

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
    name: 'Delivery',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "deliveries"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>

