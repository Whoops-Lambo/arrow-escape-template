package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class oh4 implements si4 {
    public final si4[] a;

    @Override // defpackage.si4
    public final il4 zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            si4 si4Var = this.a[i];
            if (si4Var.zzc(cls)) {
                return si4Var.zzb(cls);
            }
        }
        d.u("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.si4
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.a[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }

    public oh4(si4... si4VarArr) {
        this.a = si4VarArr;
    }
}
