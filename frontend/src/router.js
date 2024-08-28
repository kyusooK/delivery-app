
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import CustomerCustomerManager from "./components/listers/CustomerCustomerCards"
import CustomerCustomerDetail from "./components/listers/CustomerCustomerDetail"

import OrderStoreManager from "./components/listers/OrderStoreCards"
import OrderStoreDetail from "./components/listers/OrderStoreDetail"
import OrderOrderManager from "./components/listers/OrderOrderCards"
import OrderOrderDetail from "./components/listers/OrderOrderDetail"
import OrderPaymentManager from "./components/listers/OrderPaymentCards"
import OrderPaymentDetail from "./components/listers/OrderPaymentDetail"

import DeliveryDeliveryManager from "./components/listers/DeliveryDeliveryCards"
import DeliveryDeliveryDetail from "./components/listers/DeliveryDeliveryDetail"
import DeliveryRiderManager from "./components/listers/DeliveryRiderCards"
import DeliveryRiderDetail from "./components/listers/DeliveryRiderDetail"

import NotificationNotificationManager from "./components/listers/NotificationNotificationCards"
import NotificationNotificationDetail from "./components/listers/NotificationNotificationDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/customers/customers',
                name: 'CustomerCustomerManager',
                component: CustomerCustomerManager
            },
            {
                path: '/customers/customers/:id',
                name: 'CustomerCustomerDetail',
                component: CustomerCustomerDetail
            },

            {
                path: '/orders/stores',
                name: 'OrderStoreManager',
                component: OrderStoreManager
            },
            {
                path: '/orders/stores/:id',
                name: 'OrderStoreDetail',
                component: OrderStoreDetail
            },
            {
                path: '/orders/orders',
                name: 'OrderOrderManager',
                component: OrderOrderManager
            },
            {
                path: '/orders/orders/:id',
                name: 'OrderOrderDetail',
                component: OrderOrderDetail
            },
            {
                path: '/orders/payments',
                name: 'OrderPaymentManager',
                component: OrderPaymentManager
            },
            {
                path: '/orders/payments/:id',
                name: 'OrderPaymentDetail',
                component: OrderPaymentDetail
            },

            {
                path: '/deliveries/deliveries',
                name: 'DeliveryDeliveryManager',
                component: DeliveryDeliveryManager
            },
            {
                path: '/deliveries/deliveries/:id',
                name: 'DeliveryDeliveryDetail',
                component: DeliveryDeliveryDetail
            },
            {
                path: '/deliveries/riders',
                name: 'DeliveryRiderManager',
                component: DeliveryRiderManager
            },
            {
                path: '/deliveries/riders/:id',
                name: 'DeliveryRiderDetail',
                component: DeliveryRiderDetail
            },

            {
                path: '/notifications/notifications',
                name: 'NotificationNotificationManager',
                component: NotificationNotificationManager
            },
            {
                path: '/notifications/notifications/:id',
                name: 'NotificationNotificationDetail',
                component: NotificationNotificationDetail
            },



    ]
})
