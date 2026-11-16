package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᴹ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class C0988 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0943 f2819;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ View f2820;

    public C0988(C0943 c0943, View view) {
        this.f2819 = c0943;
        this.f2820 = view;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        C0883 c0883 = this.f2819.f2540.f2429;
        View view = this.f2820;
        C0883 c0884 = C0883.f2368;
        synchronized (c0883) {
            ArrayList arrayList = c0883.f2370;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((k1) obj).mo382(view);
            }
        }
    }
}
