package com.inmobi.media;

import android.view.OrientationEventListener;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.ironsource.C4664b4;
import defpackage.jp1;
import defpackage.p32;
import defpackage.s71;
import java.util.HashSet;
import kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.inmobi.media.x9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4514x9 extends OrientationEventListener {
    public static final /* synthetic */ KProperty[] d;
    public final InMobiAdActivity a;
    public final HashSet b;
    public final C4487w9 c;

    static {
        jp1 jp1Var = new jp1(C4514x9.class, "currentOrientation", "getCurrentOrientation()Lcom/inmobi/ads/rendering/orientation/Orientation;", 0);
        p32.a.getClass();
        d = new KProperty[]{jp1Var};
    }

    public final void b() {
        int i = this.a.getResources().getConfiguration().orientation;
        byte bG = AbstractC4151k6.g();
        int i2 = 1;
        if (bG != 1 && bG != 2 && (bG == 3 || bG == 4)) {
            i2 = 2;
        }
        if (i == i2) {
            this.c.setValue(this, d[0], Ig.a(AbstractC4151k6.g()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4514x9(InMobiAdActivity inMobiAdActivity) {
        super(inMobiAdActivity);
        inMobiAdActivity.getClass();
        this.a = inMobiAdActivity;
        this.b = new HashSet();
        this.c = new C4487w9(Ig.a(AbstractC4151k6.g()), this);
    }

    public final void a(Jg jg) {
        jg.getClass();
        try {
            if (!jg.a) {
                String str = jg.b;
                if (s71.b(str, C4664b4.i.C)) {
                    this.a.setRequestedOrientation(6);
                    return;
                }
                boolean zB = s71.b(str, C4664b4.i.D);
                InMobiAdActivity inMobiAdActivity = this.a;
                if (zB) {
                    inMobiAdActivity.setRequestedOrientation(7);
                    return;
                } else {
                    inMobiAdActivity.setRequestedOrientation(13);
                    return;
                }
            }
            this.a.setRequestedOrientation(13);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        b();
    }

    public final void a() {
        if (this.b.isEmpty()) {
            disable();
        } else {
            enable();
        }
    }
}
