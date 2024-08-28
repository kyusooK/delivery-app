<template>

    <v-card outlined>
        <v-card-title>
            CreateNotification
        </v-card-title>

        <v-card-text>
            <CustomerId offline label="CustomerId" v-model="value.customerId" :editMode="editMode" @change="change"/>
            <OrderId offline label="OrderId" v-model="value.orderId" :editMode="editMode" @change="change"/>
            <String label="Message" v-model="value.message" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="createNotification"
            >
                CreateNotification
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
        name: 'CreateNotificationCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.customerId = {};
            this.value.orderId = {};
            this.value.message = '';
        },
        watch: {
        },
        methods: {
            createNotification() {
                this.$emit('createNotification', this.value);
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

