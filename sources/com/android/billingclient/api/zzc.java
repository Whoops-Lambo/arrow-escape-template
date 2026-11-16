package com.android.billingclient.api;

import androidx.annotation.Nullable;
import com.ironsource.C4664b4;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import defpackage.nj;
import defpackage.pv1;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzc {
    private final String zza;
    private final String zzb;

    @Nullable
    private final String zzc;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzc)) {
            return false;
        }
        zzc zzcVar = (zzc) obj;
        return this.zza.equals(zzcVar.zza) && this.zzb.equals(zzcVar.zzb) && Objects.equals(this.zzc, zzcVar.zzc);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb, this.zzc);
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        return nj.q(pv1.r("{id: ", str, ", type: ", str2, ", offer token: "), this.zzc, "}");
    }

    public /* synthetic */ zzc(JSONObject jSONObject, zzd zzdVar) {
        this.zza = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
        this.zzb = jSONObject.optString(C4664b4.i.m);
        String strOptString = jSONObject.optString("offerToken");
        this.zzc = true == strOptString.isEmpty() ? null : strOptString;
    }
}
