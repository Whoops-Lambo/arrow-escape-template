package com.mbridge.msdk.dycreator.bus;

import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
class AsyncPoster implements Runnable {
    private final PendingPostQueue a = new PendingPostQueue();
    private final EventBus b;

    @Override // java.lang.Runnable
    public void run() {
        PendingPost pendingPostA = this.a.a();
        if (pendingPostA != null) {
            this.b.a(pendingPostA);
        } else {
            e32.i("No pending post available");
        }
    }

    public AsyncPoster(EventBus eventBus) {
        this.b = eventBus;
    }

    public void enqueue(Subscription subscription, Object obj) {
        this.a.a(PendingPost.a(subscription, obj));
        EventBus.n.execute(this);
    }
}
