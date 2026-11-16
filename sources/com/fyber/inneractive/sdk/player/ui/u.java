package com.fyber.inneractive.sdk.player.ui;

import android.content.Context;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.external.MediaView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import defpackage.wo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class u extends o {
    public MediaView V;
    public final View.OnLayoutChangeListener W;

    public u(Context context, h hVar, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(context, null, hVar, rVar, false, null);
        this.W = new wo(this, 3);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l
    public final void b(int i, int i2) {
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s, com.fyber.inneractive.sdk.player.ui.m
    public final boolean c() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.o, com.fyber.inneractive.sdk.player.ui.l, com.fyber.inneractive.sdk.player.ui.s, com.fyber.inneractive.sdk.player.ui.e, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.p, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l, com.fyber.inneractive.sdk.player.ui.s
    public View getEndCardView() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.o, com.fyber.inneractive.sdk.player.ui.s
    public View[] getTrackingFriendlyViewObstructionPurposeOther() {
        return new View[0];
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l
    public final void h(boolean z) {
    }

    @Override // com.fyber.inneractive.sdk.player.ui.o
    public final void q() {
        setBackgroundColor(0);
        this.m = (ViewGroup) findViewById(R.id.ia_texture_view_host);
        removeView(findViewById(R.id.ia_video_progressbar));
        ImageView imageView = (ImageView) findViewById(R.id.ia_iv_mute_button);
        this.N = imageView;
        imageView.setVisibility(0);
        a(this.N, 1);
        this.R = findViewById(R.id.ia_buffering_overlay);
        TextView textView = (TextView) findViewById(R.id.ia_tv_call_to_action);
        this.M = textView;
        removeView(textView);
        this.M = null;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z, int i, int i2) {
        this.o = i;
        this.p = i2;
        this.q = z;
        post(new t(this));
    }

    @Override // com.fyber.inneractive.sdk.player.ui.o, com.fyber.inneractive.sdk.player.ui.s
    public View[] getTrackingFriendlyView() {
        ImageView imageView = this.N;
        return imageView != null ? new View[]{imageView} : new View[0];
    }

    public final void r() {
        if (this.N == null) {
            return;
        }
        View view = this.V;
        if (view == null) {
            view = this;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        int iMax = Math.max((int) (Math.min(width, height) * 0.1f), (int) TypedValue.applyDimension(1, 24.0f, getResources().getDisplayMetrics()));
        ViewGroup.LayoutParams layoutParams = this.N.getLayoutParams();
        layoutParams.width = iMax;
        layoutParams.height = iMax;
        this.N.setLayoutParams(layoutParams);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof MediaView) {
            MediaView mediaView = (MediaView) getParent();
            this.V = mediaView;
            mediaView.addOnLayoutChangeListener(this.W);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MediaView mediaView = this.V;
        if (mediaView != null) {
            mediaView.removeOnLayoutChangeListener(this.W);
            this.V = null;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        r();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.o, com.fyber.inneractive.sdk.player.ui.m
    public final boolean a() {
        return false;
    }

    public final /* synthetic */ void a(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
            return;
        }
        r();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(com.fyber.inneractive.sdk.flow.endcard.d dVar, b bVar) {
    }
}
