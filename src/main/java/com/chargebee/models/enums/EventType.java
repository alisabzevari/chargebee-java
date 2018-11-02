package com.chargebee.models.enums;

public enum EventType {
    PLAN_CREATED,
    PLAN_UPDATED,
    PLAN_DELETED,
    ADDON_CREATED,
    ADDON_UPDATED,
    ADDON_DELETED,
    COUPON_CREATED,
    COUPON_UPDATED,
    COUPON_DELETED,
    COUPON_SET_CREATED,
    COUPON_SET_UPDATED,
    COUPON_SET_DELETED,
    COUPON_CODES_ADDED,
    COUPON_CODES_DELETED,
    COUPON_CODES_UPDATED,
    CUSTOMER_CREATED,
    CUSTOMER_CHANGED,
    CUSTOMER_DELETED,
    CUSTOMER_MOVED_OUT,
    CUSTOMER_MOVED_IN,
    PROMOTIONAL_CREDITS_ADDED,
    PROMOTIONAL_CREDITS_DEDUCTED,
    SUBSCRIPTION_CREATED,
    SUBSCRIPTION_STARTED,
    SUBSCRIPTION_TRIAL_END_REMINDER,
    SUBSCRIPTION_ACTIVATED,
    SUBSCRIPTION_CHANGED,
    SUBSCRIPTION_CANCELLATION_SCHEDULED,
    SUBSCRIPTION_CANCELLATION_REMINDER,
    SUBSCRIPTION_CANCELLED,
    SUBSCRIPTION_REACTIVATED,
    SUBSCRIPTION_RENEWED,
    SUBSCRIPTION_SCHEDULED_CANCELLATION_REMOVED,
    SUBSCRIPTION_CHANGES_SCHEDULED,
    SUBSCRIPTION_SCHEDULED_CHANGES_REMOVED,
    SUBSCRIPTION_SHIPPING_ADDRESS_UPDATED,
    SUBSCRIPTION_DELETED,
    SUBSCRIPTION_PAUSED,
    SUBSCRIPTION_PAUSE_SCHEDULED,
    SUBSCRIPTION_SCHEDULED_PAUSE_REMOVED,
    SUBSCRIPTION_RESUMED,
    SUBSCRIPTION_RESUMPTION_SCHEDULED,
    SUBSCRIPTION_SCHEDULED_RESUMPTION_REMOVED,
    PENDING_INVOICE_CREATED,
    PENDING_INVOICE_UPDATED,
    INVOICE_GENERATED,
    INVOICE_UPDATED,
    INVOICE_DELETED,
    CREDIT_NOTE_CREATED,
    CREDIT_NOTE_UPDATED,
    CREDIT_NOTE_DELETED,
    SUBSCRIPTION_RENEWAL_REMINDER,
    TRANSACTION_CREATED,
    TRANSACTION_UPDATED,
    TRANSACTION_DELETED,
    PAYMENT_SUCCEEDED,
    PAYMENT_FAILED,
    PAYMENT_REFUNDED,
    PAYMENT_INITIATED,
    REFUND_INITIATED,
    NETD_PAYMENT_DUE_REMINDER,
    AUTHORIZATION_SUCCEEDED,
    AUTHORIZATION_VOIDED,
    CARD_ADDED,
    CARD_UPDATED,
    CARD_EXPIRY_REMINDER,
    CARD_EXPIRED,
    CARD_DELETED,
    PAYMENT_SOURCE_ADDED,
    PAYMENT_SOURCE_UPDATED,
    PAYMENT_SOURCE_DELETED,
    VIRTUAL_BANK_ACCOUNT_ADDED,
    VIRTUAL_BANK_ACCOUNT_UPDATED,
    VIRTUAL_BANK_ACCOUNT_DELETED,
    UNBILLED_CHARGES_CREATED,
    UNBILLED_CHARGES_VOIDED,
    UNBILLED_CHARGES_DELETED,
    UNBILLED_CHARGES_INVOICED,
    ORDER_CREATED,
    ORDER_UPDATED,
    ORDER_CANCELLED,
    ORDER_DELIVERED,
    ORDER_RETURNED,
    ORDER_READY_TO_PROCESS,
    ORDER_READY_TO_SHIP,
    GIFT_SCHEDULED,
    GIFT_UNCLAIMED,
    GIFT_CLAIMED,
    GIFT_EXPIRED,
    GIFT_CANCELLED,
    _UNKNOWN; /*Indicates unexpected value for this enum. You can get this when there is a
    java-client version incompatibility. We suggest you to upgrade to the latest version */
}