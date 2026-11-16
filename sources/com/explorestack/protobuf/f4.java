package com.explorestack.protobuf;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class f4 implements h4 {
    public final /* synthetic */ g4 a;

    @Override // com.explorestack.protobuf.AbstractMessage.BuilderParent
    public final void markDirty() {
        this.a.onChanged();
    }

    public f4(g4 g4Var) {
        this.a = g4Var;
    }
}
