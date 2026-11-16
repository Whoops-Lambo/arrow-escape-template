package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class e42 extends q31 {
    public static final Object[] i;
    public static final e42 j;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int g;
    public final transient int h;

    static {
        Object[] objArr = new Object[0];
        i = objArr;
        j = new e42(0, 0, 0, objArr, objArr);
    }

    @Override // defpackage.u21, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int iR = vk3.r(obj);
                while (true) {
                    int i2 = iR & this.g;
                    Object obj2 = objArr[i2];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iR = i2 + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.u21
    public final int n() {
        return 0;
    }

    @Override // defpackage.u21
    public final boolean o() {
        return false;
    }

    @Override // defpackage.q31
    public final d31 A() {
        return d31.t(this.h, this.d);
    }

    @Override // defpackage.u21
    public final int h(int i2, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i3 = this.h;
        System.arraycopy(objArr2, 0, objArr, i2, i3);
        return i2 + i3;
    }

    @Override // defpackage.q31, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // defpackage.u21
    public final Object[] i() {
        return this.d;
    }

    @Override // defpackage.u21
    public final int k() {
        return this.h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }

    public e42(int i2, int i3, int i4, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i2;
        this.f = objArr2;
        this.g = i3;
        this.h = i4;
    }

    @Override // defpackage.u21
    /* JADX INFO: renamed from: r */
    public final d03 iterator() {
        return d().listIterator(0);
    }

    @Override // defpackage.q31, defpackage.u21
    public Object writeReplace() {
        return super.writeReplace();
    }
}
