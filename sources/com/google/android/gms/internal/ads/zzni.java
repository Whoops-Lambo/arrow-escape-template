package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public interface zzni extends zznd {
    String a();

    boolean d();

    boolean f();

    void g(long j, boolean z);

    void h(int i, zzqn zzqnVar, zzdp zzdpVar);

    void i(zznl zznlVar, zzv[] zzvVarArr, zzzm zzzmVar, boolean z, boolean z2, long j, long j2, zzxt zzxtVar);

    void j(long j, long j2);

    void k(zzbf zzbfVar);

    default boolean l(long j) {
        return false;
    }

    default void m(float f, float f2) {
    }

    void n(zzv[] zzvVarArr, zzzm zzzmVar, long j, long j2, zzxt zzxtVar);

    void o();

    default void r() {
    }

    boolean t();

    zzzm u();

    int zza();

    zzje zzb();

    zzmj zzd();

    int zze();

    long zzk();

    void zzl();

    boolean zzm();

    void zzn();

    void zzq();

    void zzr();

    void zzs();

    default void zzt() {
    }

    default long q(long j, long j2) {
        if (zze() == 1) {
            if (f() || d()) {
                return 1000000L;
            }
            return 10000L;
        }
        return 10000L;
    }
}
