package defpackage;

import com.google.android.gms.internal.auth.zzev;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class af4 implements si4 {
    public static final af4 b = new af4(0);
    public final /* synthetic */ int a;

    public /* synthetic */ af4(int i) {
        this.a = i;
    }

    @Override // defpackage.si4
    public final il4 zzb(Class cls) {
        switch (this.a) {
            case 0:
                if (!zzev.class.isAssignableFrom(cls)) {
                    d.r("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (il4) zzev.a(cls.asSubclass(zzev.class)).g(3);
                } catch (Exception e) {
                    vq2.n("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.si4
    public final boolean zzc(Class cls) {
        switch (this.a) {
            case 0:
                return zzev.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
