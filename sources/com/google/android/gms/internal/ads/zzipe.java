package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzipe implements zzipo, zzioz {
    public static final Object c = new Object();
    public volatile zzipo a;
    public volatile Object b = c;

    public static zzipe a(zzipo zzipoVar) {
        return zzipoVar instanceof zzipe ? (zzipe) zzipoVar : new zzipe(zzipoVar);
    }

    public static zzioz b(zzipo zzipoVar) {
        if (zzipoVar instanceof zzioz) {
            return (zzioz) zzipoVar;
        }
        zzipoVar.getClass();
        return new zzipe(zzipoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.b;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object objZzb = this.a.zzb();
                Object obj4 = this.b;
                if (obj4 != obj2 && obj4 != objZzb) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objZzb + ". This is likely due to a circular dependency.");
                }
                this.b = objZzb;
                this.a = null;
                return objZzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzipe(zzipo zzipoVar) {
        this.a = zzipoVar;
    }
}
