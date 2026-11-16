package com.google.android.play.core.review;

import android.app.PendingIntent;
import defpackage.d;
import defpackage.h50;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
final class zza extends ReviewInfo {
    private final PendingIntent zza;
    private final boolean zzb;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            ReviewInfo reviewInfo = (ReviewInfo) obj;
            if (this.zza.equals(reviewInfo.zza()) && this.zzb == reviewInfo.zzb()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.zzb ? 1237 : 1231) ^ ((this.zza.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return h50.n(h50.r("ReviewInfo{pendingIntent=", this.zza.toString(), ", isNoOp="), this.zzb, "}");
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final PendingIntent zza() {
        return this.zza;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final boolean zzb() {
        return this.zzb;
    }

    public zza(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent != null) {
            this.zza = pendingIntent;
            this.zzb = z;
        } else {
            d.w("Null pendingIntent");
            throw null;
        }
    }
}
