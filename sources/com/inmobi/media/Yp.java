package com.inmobi.media;

import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class Yp implements InterfaceC3921bq {
    public final Xp a;
    public final Lk b;

    @Override // com.inmobi.media.InterfaceC3921bq
    public final EnumC3893aq a() {
        I5 i5 = this.b.a;
        Rect rect = new Rect();
        if (!i5.getGlobalVisibleRect(rect)) {
            return EnumC3893aq.HIDDEN;
        }
        Xp xp = this.a;
        return (AbstractC4115iq.a(i5, rect, xp.a, xp.b) && AbstractC4115iq.a(i5, rect, this.a.a, this.b.b)) ? EnumC3893aq.VISIBLE : EnumC3893aq.HIDDEN;
    }

    public Yp(Xp xp, Lk lk) {
        xp.getClass();
        lk.getClass();
        this.a = xp;
        this.b = lk;
    }
}
