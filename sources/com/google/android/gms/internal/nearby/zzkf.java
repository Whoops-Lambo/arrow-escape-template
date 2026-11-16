package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.nearby.connection.Payload;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import defpackage.fi4;
import defpackage.po4;
import defpackage.tn4;
import defpackage.zo4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzkf extends zzb implements zzkg {
    @Override // com.google.android.gms.internal.nearby.zzb
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            zzli zzliVar = (zzli) zzc.a(parcel, zzli.CREATOR);
            zzc.b(parcel);
            zo4 zo4Var = (zo4) this;
            synchronized (zo4Var) {
                Payload payloadA = zzmd.a(zo4Var.a, zzliVar.b);
                if (payloadA == null) {
                    Log.w("NearbyConnectionsClient", String.format("Failed to convert incoming ParcelablePayload %d to Payload.", Long.valueOf(zzliVar.b.a)));
                } else {
                    ArrayMap arrayMap = zo4Var.c;
                    po4 po4Var = new po4(zzliVar.a, zzliVar.b.a);
                    PayloadTransferUpdate.Builder builder = new PayloadTransferUpdate.Builder();
                    long j = zzliVar.b.a;
                    PayloadTransferUpdate payloadTransferUpdate = builder.a;
                    payloadTransferUpdate.a = j;
                    arrayMap.put(po4Var, payloadTransferUpdate);
                    zo4Var.b.notifyListener(new tn4(zzliVar, payloadA));
                }
            }
            return true;
        }
        if (i != 3) {
            return false;
        }
        zzlk zzlkVar = (zzlk) zzc.a(parcel, zzlk.CREATOR);
        zzc.b(parcel);
        zo4 zo4Var2 = (zo4) this;
        synchronized (zo4Var2) {
            try {
                PayloadTransferUpdate payloadTransferUpdate2 = zzlkVar.b;
                int i2 = payloadTransferUpdate2.b;
                ArrayMap arrayMap2 = zo4Var2.c;
                if (i2 == 3) {
                    arrayMap2.put(new po4(zzlkVar.a, payloadTransferUpdate2.a), payloadTransferUpdate2);
                } else {
                    arrayMap2.remove(new po4(zzlkVar.a, payloadTransferUpdate2.a));
                    zzlt zzltVar = zo4Var2.d;
                    if (zzltVar != null) {
                        zzltVar.a(zzlkVar.b.a);
                    }
                }
                zo4Var2.b.notifyListener(new fi4(zzlkVar, 7));
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public zzkf() {
        super("com.google.android.gms.nearby.internal.connection.IPayloadListener");
    }
}
