package com.fyber.inneractive.sdk.config.cellular;

import android.content.Context;
import com.fyber.inneractive.sdk.util.a1;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class a implements h {
    public final d a;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public a1 b = a1.UNKNOWN;

    @Override // com.fyber.inneractive.sdk.config.cellular.h
    public final void a(a1 a1Var) {
        this.b = a1Var;
        for (h hVar : this.c) {
            if (hVar != null) {
                hVar.a(this.b);
            }
        }
    }

    public a(Context context) {
        this.a = e.a(context);
    }
}
