package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class iv {
    public final Object a;
    public final mo b;
    public final as0 c;
    public final Object d;
    public final Throwable e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv)) {
            return false;
        }
        iv ivVar = (iv) obj;
        return s71.b(this.a, ivVar.a) && s71.b(this.b, ivVar.b) && s71.b(this.c, ivVar.c) && s71.b(this.d, ivVar.d) && s71.b(this.e, ivVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        mo moVar = this.b;
        int iHashCode2 = (iHashCode + (moVar == null ? 0 : moVar.hashCode())) * 31;
        as0 as0Var = this.c;
        int iHashCode3 = (iHashCode2 + (as0Var == null ? 0 : as0Var.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public /* synthetic */ iv(Object obj, mo moVar, as0 as0Var, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : moVar, (i & 4) != 0 ? null : as0Var, (Object) null, (i & 16) != 0 ? null : th);
    }

    public static iv a(iv ivVar, mo moVar, Throwable th, int i) {
        Object obj = ivVar.a;
        if ((i & 2) != 0) {
            moVar = ivVar.b;
        }
        mo moVar2 = moVar;
        as0 as0Var = ivVar.c;
        Object obj2 = ivVar.d;
        if ((i & 16) != 0) {
            th = ivVar.e;
        }
        return new iv(obj, moVar2, as0Var, obj2, th);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public iv(Object obj, mo moVar, as0 as0Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = moVar;
        this.c = as0Var;
        this.d = obj2;
        this.e = th;
    }
}
