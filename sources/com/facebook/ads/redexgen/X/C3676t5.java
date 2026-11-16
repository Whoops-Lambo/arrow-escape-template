package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.ads.NativeAdLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.t5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C3676t5 extends ImageView {
    public Handler A00;
    public View.OnLayoutChangeListener A01;
    public ViewTreeObserver.OnScrollChangedListener A02;
    public ImageView A03;
    public boolean A04;
    public final View A05;
    public final NativeAdLayout A06;
    public final LA A07;
    public final C2055Hi A08;
    public final EnumC3534qn A09;
    public final InterfaceC3664st A0A;

    public C3676t5(C2055Hi c2055Hi, EnumC3666sv enumC3666sv, LA la, View view, EnumC3534qn enumC3534qn, NativeAdLayout nativeAdLayout, InterfaceC3664st interfaceC3664st) {
        super(c2055Hi);
        this.A05 = view;
        this.A09 = enumC3534qn;
        this.A08 = c2055Hi;
        this.A06 = nativeAdLayout;
        this.A0A = interfaceC3664st;
        this.A07 = la;
        AbstractC3665su.A03(c2055Hi, enumC3666sv);
        A02();
    }

    private int A00(Rect rect) {
        return this.A08.getResources().getDisplayMetrics().widthPixels - rect.left;
    }

    private void A02() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        this.A03 = new ImageView(this.A08);
        this.A03.setImageBitmap(AbstractC3535qo.A01(this.A09));
        this.A03.setLayoutParams(layoutParams);
        this.A06.addView(this.A03);
        AbstractC3523qc.A0P(this.A03, 4);
        this.A03.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.A00.A0C(view);
            }
        });
        this.A00 = new Handler(Looper.getMainLooper());
        this.A01 = new View.OnLayoutChangeListener() { // from class: com.facebook.ads.redexgen.X.t1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.A00.A0D(view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        };
        this.A02 = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.facebook.ads.redexgen.X.t2
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.A00.A05();
            }
        };
        this.A03.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC3675t4(this));
    }

    private void A03() {
        if (this.A01 != null) {
            this.A06.removeOnLayoutChangeListener(this.A01);
            this.A01 = null;
        }
        if (this.A02 != null) {
            this.A06.getViewTreeObserver().removeOnScrollChangedListener(this.A02);
            this.A02 = null;
        }
    }

    private void A04() {
        this.A00.postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.t3
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A09();
            }
        }, this.A07.A2z());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A03.getLayoutParams();
        Rect rect = new Rect();
        this.A05.getGlobalVisibleRect(rect);
        Rect nativeAdLayoutLocation = new Rect();
        this.A06.getGlobalVisibleRect(nativeAdLayoutLocation);
        layoutParams.leftMargin = rect.left - nativeAdLayoutLocation.left;
        layoutParams.topMargin = rect.top - nativeAdLayoutLocation.top;
        if (rect.left > A00(nativeAdLayoutLocation) / 2) {
            layoutParams.leftMargin = (layoutParams.leftMargin - this.A03.getWidth()) + this.A05.getWidth();
        }
        layoutParams.topMargin += (this.A05.getHeight() - this.A03.getHeight()) / 2;
        this.A03.setLayoutParams(layoutParams);
        AbstractC3523qc.A0P(this.A03, 0);
        this.A03.bringToFront();
        if (!this.A04) {
            this.A04 = true;
            A04();
        }
    }

    private void A06(int i, int i2) {
        AbstractC3523qc.A0P(this.A03, i);
        AbstractC3523qc.A0P(this.A05, i2);
    }

    public final void A09() {
        A03();
        A06(8, 0);
        this.A00.removeCallbacksAndMessages(null);
        this.A04 = false;
    }

    public final void A0A() {
        A06(4, 4);
        this.A03.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.sz
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A05();
            }
        });
        if (this.A01 != null) {
            this.A06.addOnLayoutChangeListener(this.A01);
        }
        if (this.A02 != null) {
            this.A06.getViewTreeObserver().addOnScrollChangedListener(this.A02);
        }
    }

    public final void A0B() {
        A06(4, 4);
        A05();
    }

    public final /* synthetic */ void A0C(View view) {
        A03();
        this.A0A.AEX(view);
    }

    public final /* synthetic */ void A0D(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        A05();
    }
}
