package com.unity3d.player;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.EditText;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class D extends AbstractC5288y {
    public boolean h;
    public Handler i;
    public B j;

    @Override // com.unity3d.player.AbstractC5288y, defpackage.jg3
    public final boolean isConsumeOutsideTouchesEnabled() {
        return false;
    }

    @Override // com.unity3d.player.AbstractC5288y, defpackage.jg3
    public final void a() {
        if (this.h) {
            return;
        }
        FrameLayout frameLayout = this.b.getFrameLayout();
        frameLayout.addView(this.c);
        frameLayout.bringChildToFront(this.c);
        this.c.setVisibility(0);
        this.c.requestFocus();
        this.j = new B(this);
        Handler handler = new Handler(Looper.getMainLooper());
        this.i = handler;
        handler.postDelayed(this.j, 400L);
        this.h = true;
    }

    @Override // com.unity3d.player.AbstractC5288y
    public EditText createEditText(AbstractC5288y abstractC5288y) {
        return new C(this.a, abstractC5288y);
    }

    @Override // com.unity3d.player.AbstractC5288y, defpackage.jg3
    public final void hide() {
        B b;
        Handler handler = this.i;
        if (handler != null && (b = this.j) != null) {
            handler.removeCallbacks(b);
        }
        this.b.getFrameLayout().removeView(this.c);
        this.h = false;
        invokeOnClose();
    }

    @Override // com.unity3d.player.AbstractC5288y, defpackage.jg3
    public final void setHideInputField(boolean z) {
        this.d = z;
        EditText editText = this.c;
        if (z) {
            editText.setVisibility(4);
        } else {
            editText.setVisibility(0);
        }
        this.c.invalidate();
        this.c.requestLayout();
    }

    public D(Context context, UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        super(context, unityPlayerForActivityOrService);
        this.h = false;
    }
}
