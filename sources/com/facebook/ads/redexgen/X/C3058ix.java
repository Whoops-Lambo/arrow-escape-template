package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ix, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C3058ix extends ViewGroup.MarginLayoutParams {
    public AbstractC3075jE A00;
    public boolean A01;
    public boolean A02;
    public final Rect A03;

    public C3058ix(int i, int i2) {
        super(i, i2);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public C3058ix(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public C3058ix(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public C3058ix(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public C3058ix(C3058ix c3058ix) {
        super((ViewGroup.LayoutParams) c3058ix);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public final int A00() {
        return this.A00.A0T();
    }

    public final boolean A01() {
        return this.A00.A0q();
    }

    public final boolean A02() {
        return this.A00.A0n();
    }

    public final boolean A03() {
        return this.A00.A0m();
    }
}
