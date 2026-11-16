package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class ViewOnTouchListenerC2650cG implements View.OnTouchListener {
    public final /* synthetic */ TextureViewSurfaceTextureListenerC1867Ab A00;

    public ViewOnTouchListenerC2650cG(TextureViewSurfaceTextureListenerC1867Ab textureViewSurfaceTextureListenerC1867Ab) {
        this.A00 = textureViewSurfaceTextureListenerC1867Ab;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.A00.A0G && this.A00.A0A != null && motionEvent.getAction() == 1) {
            if (this.A00.A0A.isShowing()) {
                this.A00.A0A.hide();
            } else {
                this.A00.A0A.show();
            }
        }
        return true;
    }
}
