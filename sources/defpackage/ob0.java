package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class ob0 implements l92 {
    public final CharSequence a;
    public final int b;
    public final zr0 c;

    @Override // defpackage.l92
    public final Iterator iterator() {
        return new nb0(this);
    }

    public ob0(CharSequence charSequence, int i, zr0 zr0Var) {
        charSequence.getClass();
        this.a = charSequence;
        this.b = i;
        this.c = zr0Var;
    }
}
