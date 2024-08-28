<template>

    <v-card outlined>
        <v-card-title>
            CreateDelivery
        </v-card-title>

        <v-card-text>
            <OrderId offline label="OrderId" v-model="value.orderId" :editMode="editMode" @change="change"/>
            <RiderId offline label="RiderId" v-model="value.riderId" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="createDelivery"
            >
                CreateDelivery
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
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
        name: 'CreateDeliveryCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.orderId = {};
            this.value.riderId = {};
        },
        watch: {
        },
        methods: {
            createDelivery() {
                this.$emit('createDelivery', this.value);
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

