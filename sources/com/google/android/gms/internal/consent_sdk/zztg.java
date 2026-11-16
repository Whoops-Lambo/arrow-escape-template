package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zztg implements zztk {
    public static final Object c = new Object();
    public volatile zztk a;
    public volatile Object b;

    public static zztg a(zztk zztkVar) {
        if (zztkVar instanceof zztg) {
            return (zztg) zztkVar;
        }
        zztg zztgVar = new zztg();
        zztgVar.b = c;
        zztgVar.a = zztkVar;
        return zztgVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztm
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
}
