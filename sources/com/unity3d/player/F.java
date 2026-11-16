package com.unity3d.player;

import android.content.Context;
import android.widget.EditText;
import defpackage.e11;
import defpackage.r81;
import defpackage.sv0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class F extends AbstractC5288y {
    public A h;

    @Override // com.unity3d.player.AbstractC5288y, defpackage.jg3
    public final void a(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2, int i2, boolean z5, boolean z6) {
        A a = new A(this.a, this.b);
        this.h = a;
        a.a(this, z5, z6);
        this.h.setOnDismissListener(new sv0(this));
        this.e = z6;
        setupTextInput(str, i, z, z2, z3, z4, str2, i2);
        setHideInputField(z5);
        this.b.getFrameLayout().getViewTreeObserver().addOnGlobalLayoutListener(new e11(this));
        this.c.requestFocus();
        this.h.setOnCancelListener(new r81(this, 0));
    }

    @Override // com.unity3d.player.AbstractC5288y
    public EditText createEditText(AbstractC5288y abstractC5288y) {
        return new E(this, this.a, abstractC5288y);
    }

    @Override // com.unity3d.player.AbstractC5288y, defpackage.jg3
    public final void hide() {
        this.h.dismiss();
    }

    public void reportSoftInputArea() {
        if (this.h.isShowing()) {
            this.b.reportSoftInputArea(this.h.a());
        }
    }

    @Override // com.unity3d.player.AbstractC5288y, defpackage.jg3
    public final void setHideInputField(boolean z) {
        this.d = z;
        this.h.a(z);
    }

    public F(Context context, UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        super(context, unityPlayerForActivityOrService);
    }

    @Override // com.unity3d.player.AbstractC5288y, defpackage.jg3
    public final void a() {
        this.h.show();
    }
}
