package com.mbridge.msdk.dycreator.bus;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
final class Subscription {
    final Object a;
    final SubscriberMethod b;

    public boolean equals(Object obj) {
        if (obj instanceof Subscription) {
            Subscription subscription = (Subscription) obj;
            if (this.a == subscription.a && this.b.equals(subscription.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.b.d.hashCode() + this.a.hashCode();
    }

    public Subscription(Object obj, SubscriberMethod subscriberMethod) {
        this.a = obj;
        this.b = subscriberMethod;
    }
}
