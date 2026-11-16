package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class p8 implements l92 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ p8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.l92
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return rd1.m((Object[]) obj);
            case 1:
                return ((Iterable) obj).iterator();
            case 2:
                return new ie1(this);
            case 3:
                return at.t((zr0) obj);
            case 4:
                return (Iterator) obj;
            default:
                return new he1((CharSequence) obj);
        }
    }
}
