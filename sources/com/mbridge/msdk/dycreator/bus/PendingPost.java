package com.mbridge.msdk.dycreator.bus;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
final class PendingPost {
    private static final List<PendingPost> d = new ArrayList();
    Object a;
    Subscription b;
    PendingPost c;

    public static PendingPost a(Subscription subscription, Object obj) {
        List<PendingPost> list = d;
        synchronized (list) {
            try {
                int size = list.size();
                if (size <= 0) {
                    return new PendingPost(obj, subscription);
                }
                PendingPost pendingPostRemove = list.remove(size - 1);
                pendingPostRemove.a = obj;
                pendingPostRemove.b = subscription;
                pendingPostRemove.c = null;
                return pendingPostRemove;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private PendingPost(Object obj, Subscription subscription) {
        this.a = obj;
        this.b = subscription;
    }

    public static void a(PendingPost pendingPost) {
        pendingPost.a = null;
        pendingPost.b = null;
        pendingPost.c = null;
        List<PendingPost> list = d;
        synchronized (list) {
            try {
                if (list.size() < 10000) {
                    list.add(pendingPost);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
