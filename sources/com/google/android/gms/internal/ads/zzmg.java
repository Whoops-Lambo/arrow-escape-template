package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface zzmg {
    zzabv a(zzqn zzqnVar);

    default boolean e(zzmf zzmfVar) {
        throw null;
    }

    default boolean g(zzmf zzmfVar) {
        throw null;
    }

    default void b(zzqn zzqnVar) {
        throw new IllegalStateException("onPrepared not implemented");
    }

    default void c(zzqn zzqnVar) {
        throw new IllegalStateException("onReleased not implemented");
    }

    default void d(zzqn zzqnVar) {
        throw new IllegalStateException("onStopped not implemented");
    }

    default void f(zzmf zzmfVar, zzabk[] zzabkVarArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    default long zzf() {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    default void zzg() {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    default boolean zzj() {
        zzeh.c("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }
}
