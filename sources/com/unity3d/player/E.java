package com.unity3d.player;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.EditText;
import defpackage.hi3;
import defpackage.mi3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class E extends EditText {
    public final /* synthetic */ AbstractC5288y a;
    public final /* synthetic */ F b;

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        mi3 mi3Var;
        hi3 hi3Var;
        Runnable runnable;
        if (i == 4) {
            if (keyEvent.getAction() == 1 && (mi3Var = this.b.h.e) != null && (hi3Var = mi3Var.a) != null && (runnable = hi3Var.a) != null) {
                runnable.run();
            }
            return true;
        }
        if (i == 84) {
            return true;
        }
        if (i == 66 && keyEvent.getAction() == 0 && (getInputType() & 131072) == 0) {
            AbstractC5288y abstractC5288y = this.a;
            abstractC5288y.a(abstractC5288y.b(), false);
            return true;
        }
        if (i != 111 || keyEvent.getAction() != 0) {
            return super.onKeyPreIme(i, keyEvent);
        }
        AbstractC5288y abstractC5288y2 = this.a;
        abstractC5288y2.a(abstractC5288y2.b(), true);
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(F f, Context context, AbstractC5288y abstractC5288y) {
        super(context);
        this.b = f;
        this.a = abstractC5288y;
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        this.a.b.reportSoftInputSelection(i, i2 - i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            requestFocus();
            this.a.c();
        }
    }
}
