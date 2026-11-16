package com.unity3d.player;

import android.widget.FrameLayout;
import defpackage.uj2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class b1 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ f1 h;

    public b1(f1 f1Var, String str, int i, int i2, int i3, boolean z, long j, long j2) {
        this.h = f1Var;
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = j;
        this.g = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f1 f1Var = this.h;
        if (f1Var.f != null) {
            uj2.a(5, "Video already playing");
            f1 f1Var2 = this.h;
            f1Var2.g = 2;
            f1Var2.d.release();
            return;
        }
        f1 f1Var3 = this.h;
        f1Var.f = new VideoPlayer(f1Var3.b, f1Var3.a, this.a, this.b, this.c, this.d, this.e, this.f, this.g, new a1(this));
        f1 f1Var4 = this.h;
        if (f1Var4.f != null) {
            FrameLayout frameLayout = f1Var4.a.getFrameLayout();
            frameLayout.bringToFront();
            frameLayout.addView(this.h.f);
        }
    }
}
