<template>
    <v-card outlined>
        <v-card-title>
            CreatePayment
        </v-card-title>

        <v-card-text>
            <OrderId offline label="OrderId" v-model="value.orderId" :editMode="editMode" @change="change"/>
            <Money offline label="Amount" v-model="value.amount" :editMode="editMode" @change="change"/>
            <String label="PaymentMethod" v-model="value.paymentMethod" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="createPayment"
            >
                CreatePayment
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'CreatePaymentCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.orderId = {};
            this.value.amount = {};
            this.value.paymentMethod = '';
        },
        watch: {
        },
        methods: {
            createPayment() {
                this.$emit('createPayment', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

