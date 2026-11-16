package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.runtime.State;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k0 implements sr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ State b;

    public /* synthetic */ k0(State state, int i) {
        this.a = i;
        this.b = state;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.a;
        State state = this.b;
        switch (i) {
            case 0:
                return Integer.valueOf(e.b.a(state));
            default:
                return w.a.a(state);
        }
    }
}
