package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class uy extends l0 implements qy {
    public static final ty b = new ty(h42.c, new l6(9));

    public abstract void L(sy syVar, Runnable runnable);

    public uy() {
        super(h42.c);
    }

    public boolean R(sy syVar) {
        return !(this instanceof wy2);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + qb5.i(this);
    }

    public void N(sy syVar, Runnable runnable) {
        l41.q(this, syVar, runnable);
    }

    public uy T(int i) {
        uu.g(i);
        return new ee1(this, i);
    }

    @Override // defpackage.l0, defpackage.sy
    public final qy get(ry ryVar) {
        qy qyVar;
        ryVar.getClass();
        if (ryVar instanceof ty) {
            ty tyVar = (ty) ryVar;
            ry key = getKey();
            key.getClass();
            if ((key == tyVar || tyVar.b == key) && (qyVar = (qy) tyVar.a.invoke(this)) != null) {
                return qyVar;
            }
        } else if (h42.c == ryVar) {
            return this;
        }
        return null;
    }

    @Override // defpackage.l0, defpackage.sy
    public final sy minusKey(ry ryVar) {
        ryVar.getClass();
        if (ryVar instanceof ty) {
            ty tyVar = (ty) ryVar;
            ry key = getKey();
            key.getClass();
            if ((key != tyVar && tyVar.b != key) || ((qy) tyVar.a.invoke(this)) == null) {
                return this;
            }
        } else if (h42.c != ryVar) {
            return this;
        }
        return cg0.a;
    }
}
