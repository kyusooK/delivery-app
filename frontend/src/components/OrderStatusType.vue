<template>
    <div style="margin: 0 -15px 0 -15px;">
        <v-card-title>
            OrderStatusType
        </v-card-title>
        <v-card-text>
            <div v-if="editMode" style="margin-top:-20px;">
                <v-select
                        v-model="newValue"
                        :label="'name'"
                        :items="OrderStatusTypeList"
                ></v-select>
            </div>
            <div v-else style="margin-top:-20px;">
                OrderStatusType : {{ value }}
            </div>
        </v-card-text>
    </div>
</template>

<script>
    export default {
        name: 'OrderStatusType',
        components:{},
        props: {
            value: [Object, String, Number, Boolean, Array],
            editMode: Boolean,
            isNew: Boolean,
            offline: Boolean,
            inList: Boolean,
            label: String,
        },
        data: () => ({
            orderStatusTypeList : [ "주문됨",  "수락됨",  "거절됨",  "요리중",  "요리완료",  "배달중",  "배달완료",  "취소됨", ],
            newValue: '',
        }),
        async created() {
            if(!this.value) {
                this.newValue = this.orderStatusTypeList[0];
            } else {
                this.newValue = this.value;
            }
        },
        watch: {
            value(val) {
                this.$emit('input', val);
            },
            newValue(val) {
                this.$emit('input', val);
            },
        },
        methods: {
        }
    }
</script>

