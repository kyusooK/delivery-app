<template>
    <div>
        <Number label="결제 ID" v-model="value.paymentId" :editMode="editMode"/>
        <String label="결제 방법" v-model="value.paymentMethod" :editMode="editMode"/>
        <String label="결제 상태" v-model="value.paymentStatus" :editMode="editMode"/>
        <Date label="결제 시간" v-model="value.paymentTime" :editMode="editMode"/>
        <Number label="적립 포인트" v-model="value.earnedPoints" :editMode="editMode"/>
        <OrderId offline label="주문 ID" v-model="value.orderId" :editMode="editMode" @change="change"/>
        <Money offline label="금액" v-model="value.amount" :editMode="editMode" @change="change"/>
        <paymentStatusType offline label="결제 상태 유형" v-model="value.paymentStatusType" :editMode="editMode" @change="change"/>

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
    name: 'Payment',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "payments"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>

