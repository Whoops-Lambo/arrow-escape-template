package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class tg2 extends yg2 {
    public final /* synthetic */ rg2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg2(rg2 rg2Var) {
        super(rg2Var, 0);
        this.c = rg2Var;
    }

    @Override // defpackage.yg2, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new sg2(this.c);
    }
}
