package com.inmobi.media;

import defpackage.az2;
import defpackage.cp0;
import defpackage.cz;
import defpackage.dy;
import defpackage.dz;

/* JADX INFO: renamed from: com.inmobi.media.ro, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4364ro implements cp0 {
    public final /* synthetic */ Bo a;

    public C4364ro(cz czVar, Bo bo) {
        this.a = bo;
    }

    @Override // defpackage.cp0
    public final Object emit(Object obj, dy dyVar) {
        AbstractC3908bd abstractC3908bd = (AbstractC3908bd) obj;
        Z9 z9 = this.a.e;
        if (z9 != null) {
            z9.a("VideoExperienceManager", "observeCompanionAdEvents - received companion event: " + abstractC3908bd);
        }
        Object objEmit = this.a.d.emit(abstractC3908bd, dyVar);
        return objEmit == dz.a ? objEmit : az2.a;
    }
}
