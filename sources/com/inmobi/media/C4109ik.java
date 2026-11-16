package com.inmobi.media;

import android.os.Bundle;
import androidx.browser.customtabs.EngagementSignalsCallback;

/* JADX INFO: renamed from: com.inmobi.media.ik, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C4109ik implements EngagementSignalsCallback {
    public final C4260o3 a;
    public final C4288p3 b;
    public final C4316q3 c;

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public final void onGreatestScrollPercentageIncreased(int i, Bundle bundle) {
        try {
            this.b.a(i);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public final void onSessionEnded(boolean z, Bundle bundle) {
        try {
            this.c.a(z);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public final void onVerticalScrollEvent(boolean z, Bundle bundle) {
        try {
            C4343r3 c4343r3 = this.a.a;
            if (c4343r3.j) {
                return;
            }
            c4343r3.j = true;
            C4304pj c4304pj = (C4304pj) c4343r3.k.get();
            if (c4304pj != null) {
                Ej.h1.getClass();
                c4304pj.a(C4164kj.a("IN_NATIVE_BROWSER", "onScroll"));
            }
        } catch (Exception unused) {
        }
    }

    public C4109ik(C4260o3 c4260o3, C4288p3 c4288p3, C4316q3 c4316q3) {
        this.a = c4260o3;
        this.b = c4288p3;
        this.c = c4316q3;
    }
}
