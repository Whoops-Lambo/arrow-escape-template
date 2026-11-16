package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class f implements zzihi {
    public static final f a = new f();

    @Override // com.google.android.gms.internal.ads.zzihi
    public final boolean zza(int i) {
        zzbiw.zzaw.zzb zzbVar;
        if (i == 0) {
            zzbVar = zzbiw.zzaw.zzb.VIDEO_ERROR_CODE_UNSPECIFIED;
        } else if (i == 1) {
            zzbVar = zzbiw.zzaw.zzb.OPENGL_RENDERING_FAILED;
        } else if (i != 2) {
            zzbVar = i != 3 ? null : zzbiw.zzaw.zzb.ANDROID_TARGET_API_TOO_LOW;
        } else {
            zzbVar = zzbiw.zzaw.zzb.CACHE_LOAD_FAILED;
        }
        return zzbVar != null;
    }
}
