package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class nb0 implements Iterator, bc1 {
    public int a = -1;
    public int b;
    public int c;
    public j71 d;
    public int e;
    public final /* synthetic */ ob0 f;

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:18:0x006f  */
    public final void a() {
        dt1 dt1Var;
        ob0 ob0Var = this.f;
        CharSequence charSequence = ob0Var.a;
        int i = this.c;
        if (i < 0) {
            this.a = 0;
            this.d = null;
            return;
        }
        int i2 = ob0Var.b;
        if (i2 > 0) {
            int i3 = this.e + 1;
            this.e = i3;
            if (i3 >= i2) {
                this.d = new j71(this.b, dk2.T(charSequence), 1);
                this.c = -1;
            } else if (i > charSequence.length() && (dt1Var = (dt1) ob0Var.c.invoke(charSequence, Integer.valueOf(this.c))) != null) {
                int iIntValue = ((Number) dt1Var.a).intValue();
                int iIntValue2 = ((Number) dt1Var.b).intValue();
                this.d = tb5.D(this.b, iIntValue);
                int i4 = iIntValue + iIntValue2;
                this.b = i4;
                this.c = i4 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.d = new j71(this.b, dk2.T(charSequence), 1);
                this.c = -1;
            }
        } else if (i > charSequence.length()) {
            this.d = new j71(this.b, dk2.T(charSequence), 1);
            this.c = -1;
        } else {
            int iIntValue3 = ((Number) dt1Var.a).intValue();
            int iIntValue4 = ((Number) dt1Var.b).intValue();
            this.d = tb5.D(this.b, iIntValue3);
            int i5 = iIntValue3 + iIntValue4;
            this.b = i5;
            this.c = i5 + (iIntValue4 == 0 ? 1 : 0);
        }
        this.a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a == -1) {
            a();
        }
        return this.a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a == -1) {
            a();
        }
        if (this.a == 0) {
            d.v();
            return null;
        }
        j71 j71Var = this.d;
        j71Var.getClass();
        this.d = null;
        this.a = -1;
        return j71Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public nb0(ob0 ob0Var) {
        this.f = ob0Var;
        int iG = tb5.g(0, 0, ob0Var.a.length());
        this.b = iG;
        this.c = iG;
    }
}
