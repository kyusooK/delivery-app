<template>
    <div style="margin: -10px -15px 0 -15px;">
        <v-card-text>
            <div class="label-title"></div>
            <div v-if="editMode">
                <v-select
                    v-model="newValue"
                    :label="label"
                    :items="selections"
                    solo
                ></v-select>
            </div>
            <div v-else>
                OrderStatusType : {{ value }}
            </div>
        </v-card-text>
    </div>
</template>

<script>
import BaseEntity from './base-ui/BaseEntity.vue';

export default {
    name: 'OrderStatusType',
    mixins:[BaseEntity],
    components:{},
    props: {
        label: String
    },
    data: () => ({
        selections : ["주문됨","수락됨","거절됨","요리중","요리완료","배달중","배달완료","취소됨",],
        newValue: '',
    }),
    async created() {
        if(!this.value) {
            this.newValue = this.orderstatustypeList[0];
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

