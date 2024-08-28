<template>
    <div>
        <Number label="주문 ID" v-model="value.orderId" :editMode="editMode"/>
        <String label="주문 상태" v-model="value.orderStatus" :editMode="editMode"/>
        <Date label="주문 시간" v-model="value.orderTime" :editMode="editMode"/>
        <Number label="적립 포인트" v-model="value.earnedPoints" :editMode="editMode"/>
        <CustomerId offline label="고객 ID" v-model="value.customerId" :editMode="editMode" @change="change"/>
        <StoreId offline label="상점 ID" v-model="value.storeId" :editMode="editMode" @change="change"/>
        <orderStatusType offline label="주문 상태 유형" v-model="value.orderStatusType" :editMode="editMode" @change="change"/>
        <Money offline label="총 금액" v-model="value.totalAmount" :editMode="editMode" @change="change"/>

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
    name: 'Order',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "orders"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>

