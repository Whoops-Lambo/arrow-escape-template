package com.inmobi.media;

import defpackage.yr1;
import java.util.Iterator;
import kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.inmobi.media.w9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4487w9 extends yr1 {
    public final /* synthetic */ C4514x9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4487w9(Hg hg, C4514x9 c4514x9) {
        super(hg);
        this.a = c4514x9;
    }

    @Override // defpackage.yr1
    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        kProperty.getClass();
        Hg hg = (Hg) obj2;
        if (Ig.a((Hg) obj) != Ig.a(hg)) {
            Iterator it = this.a.b.iterator();
            while (it.hasNext()) {
                ((Kg) it.next()).a(hg);
            }
        }
    }
}
