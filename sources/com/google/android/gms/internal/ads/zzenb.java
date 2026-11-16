package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzenb {
    public final Context a;

    public final ListenableFuture a(boolean z) {
        try {
            GetTopicsRequest getTopicsRequest = new GetTopicsRequest(z);
            TopicsManagerFutures topicsManagerFuturesA = TopicsManagerFutures.a(this.a);
            return topicsManagerFuturesA != null ? topicsManagerFuturesA.b(getTopicsRequest) : zzheh.b(new IllegalStateException());
        } catch (Exception e) {
            return zzheh.b(e);
        }
    }

    public zzenb(Context context) {
        this.a = context;
    }
}
