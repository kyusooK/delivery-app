
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import CustomerManager from "./components/ui/CustomerGrid"

import StoreManager from "./components/ui/StoreGrid"
import OrderManager from "./components/ui/OrderGrid"
import PaymentManager from "./components/ui/PaymentGrid"

import DeliveryManager from "./components/ui/DeliveryGrid"
import RiderManager from "./components/ui/RiderGrid"

import NotificationManager from "./components/ui/NotificationGrid"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/customers',
                name: 'CustomerManager',
                component: CustomerManager
            },

            {
                path: '/stores',
                name: 'StoreManager',
                component: StoreManager
            },
            {
                path: '/orders',
                name: 'OrderManager',
                component: OrderManager
            },
            {
                path: '/payments',
                name: 'PaymentManager',
                component: PaymentManager
            },

            {
                path: '/deliveries',
                name: 'DeliveryManager',
                component: DeliveryManager
            },
            {
                path: '/riders',
                name: 'RiderManager',
                component: RiderManager
            },

            {
                path: '/notifications',
                name: 'NotificationManager',
                component: NotificationManager
            },



    ]
})
