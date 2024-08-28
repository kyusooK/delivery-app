<template>
    <v-card outlined>
        <v-card-title>
            CreateOrder
        </v-card-title>

        <v-card-text>
            <CustomerId offline label="CustomerId" v-model="value.customerId" :editMode="editMode" @change="change"/>
            <StoreId offline label="StoreId" v-model="value.storeId" :editMode="editMode" @change="change"/>
            <Money offline label="TotalAmount" v-model="value.totalAmount" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="createOrder"
            >
                CreateOrder
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
        name: 'CreateOrderCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.customerId = {};
            this.value.storeId = {};
            this.value.totalAmount = {};
        },
        watch: {
        },
        methods: {
            createOrder() {
                this.$emit('createOrder', this.value);
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

