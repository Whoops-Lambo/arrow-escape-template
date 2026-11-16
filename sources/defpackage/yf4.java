package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.playcore_hsdp.zza;
import com.google.android.gms.internal.playcore_hsdp.zzc;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class yf4 extends zza implements tr4 {
    public final void A1(String str, String str2, String str3, Bundle bundle, qk3 qk3Var) {
        Parcel parcelR = r();
        parcelR.writeString(str);
        parcelR.writeString(str2);
        parcelR.writeString(str3);
        int i = zzc.a;
        parcelR.writeInt(1);
        bundle.writeToParcel(parcelR, 0);
        if (qk3Var == null) {
            parcelR.writeStrongBinder(null);
        } else {
            parcelR.writeStrongBinder(qk3Var);
        }
        z1(2, parcelR);
    }
}
