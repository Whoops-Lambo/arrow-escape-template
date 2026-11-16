package com.google.android.gms.common.api.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
final class zaaf extends zabb {
    final /* synthetic */ zaag zaa;

    @Override // com.google.android.gms.common.api.internal.zabb
    public final void zaa() {
        this.zaa.zaj().zah.zaa(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaaf(zaag zaagVar, zaba zabaVar) {
        super(zabaVar);
        Objects.requireNonNull(zaagVar);
        this.zaa = zaagVar;
    }
}
