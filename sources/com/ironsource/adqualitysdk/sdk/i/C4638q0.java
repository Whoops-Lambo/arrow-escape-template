package com.ironsource.adqualitysdk.sdk.i;

import com.vungle.warren.model.Placement;
import com.vungle.warren.persistence.Repository;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.q0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C4638q0 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C4647v0 f441;

    public C4638q0(C4647v0 c4647v0) {
        this.f441 = c4647v0;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C4647v0 c4647v0 = this.f441;
        Repository repository = (Repository) arrayList.get(0);
        String str = (String) arrayList.get(1);
        c4647v0.getClass();
        return (Placement) repository.load(str, Placement.class).get();
    }
}
