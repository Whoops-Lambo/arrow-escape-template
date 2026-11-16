package com.moloco.sdk.internal.publisher.nativead.ui;

import android.view.View;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.u;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sr0 b;

    public /* synthetic */ f(sr0 sr0Var, int i) {
        this.a = i;
        this.b = sr0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        sr0 sr0Var = this.b;
        switch (i) {
            case 0:
                if (sr0Var != null) {
                    sr0Var.invoke();
                }
                break;
            case 1:
                u.a(sr0Var, view);
                break;
            default:
                sr0Var.invoke();
                break;
        }
    }
}
