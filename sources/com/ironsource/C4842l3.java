package com.ironsource;

import defpackage.nj;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.l3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class C4842l3 extends AbstractC4985t3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4842l3(int i, @NotNull String str, boolean z, @Nullable C4888nd c4888nd) {
        super(i, str, z, c4888nd);
        str.getClass();
    }

    @Override // com.ironsource.AbstractC4985t3
    @NotNull
    public String toString() {
        return nj.k(b(), super.toString(), ", placementId: ");
    }
}
