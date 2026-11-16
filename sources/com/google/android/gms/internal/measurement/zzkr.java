package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.c15;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzkr extends zzbm implements zzks {
    public zzkr() {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Status status = (Status) zzbn.a(parcel, Status.CREATOR);
                zzbn.d(parcel);
                TaskUtil.setResultOrApiException(status, ((c15) this).a);
                return true;
            case 2:
                Status status2 = (Status) zzbn.a(parcel, Status.CREATOR);
                zzbn.d(parcel);
                TaskUtil.setResultOrApiException(status2, ((c15) this).a);
                return true;
            case 3:
                Status status3 = (Status) zzbn.a(parcel, Status.CREATOR);
                zzbn.d(parcel);
                TaskUtil.setResultOrApiException(status3, ((c15) this).a);
                return true;
            case 4:
                Status status4 = (Status) zzbn.a(parcel, Status.CREATOR);
                zzjh zzjhVar = (zzjh) zzbn.a(parcel, zzjh.CREATOR);
                zzbn.d(parcel);
                TaskUtil.setResultOrApiException(status4, zzjhVar, (TaskCompletionSource<zzjh>) ((c15) this).a);
                return true;
            case 5:
                Status status5 = (Status) zzbn.a(parcel, Status.CREATOR);
                zzbn.d(parcel);
                TaskUtil.setResultOrApiException(status5, ((c15) this).a);
                return true;
            case 6:
                Status status6 = (Status) zzbn.a(parcel, Status.CREATOR);
                zzjl zzjlVar = (zzjl) zzbn.a(parcel, zzjl.CREATOR);
                zzbn.d(parcel);
                TaskUtil.setResultOrApiException(status6, zzjlVar, (TaskCompletionSource<zzjl>) ((c15) this).a);
                return true;
            case 7:
                Status status7 = (Status) zzbn.a(parcel, Status.CREATOR);
                zzjj zzjjVar = (zzjj) zzbn.a(parcel, zzjj.CREATOR);
                zzbn.d(parcel);
                TaskUtil.setResultOrApiException(status7, zzjjVar, (TaskCompletionSource<zzjj>) ((c15) this).a);
                return true;
            case 8:
                Status status8 = (Status) zzbn.a(parcel, Status.CREATOR);
                zzbn.d(parcel);
                TaskUtil.setResultOrApiException(status8, ((c15) this).a);
                return true;
            case 9:
                Status status9 = (Status) zzbn.a(parcel, Status.CREATOR);
                zzjo zzjoVar = (zzjo) zzbn.a(parcel, zzjo.CREATOR);
                zzbn.d(parcel);
                TaskUtil.setResultOrApiException(status9, zzjoVar, (TaskCompletionSource<zzjo>) ((c15) this).a);
                return true;
            case 10:
                Status status10 = (Status) zzbn.a(parcel, Status.CREATOR);
                zzjh zzjhVar2 = (zzjh) zzbn.a(parcel, zzjh.CREATOR);
                zzbn.d(parcel);
                TaskUtil.setResultOrApiException(status10, zzjhVar2, (TaskCompletionSource<zzjh>) ((c15) this).a);
                return true;
            case 11:
                Status status11 = (Status) zzbn.a(parcel, Status.CREATOR);
                parcel.readLong();
                zzbn.d(parcel);
                TaskUtil.setResultOrApiException(status11, (Object) null, (TaskCompletionSource<Object>) ((c15) this).a);
                return true;
            case 12:
                Status status12 = (Status) zzbn.a(parcel, Status.CREATOR);
                zzbn.d(parcel);
                TaskUtil.setResultOrApiException(status12, ((c15) this).a);
                return true;
            case 13:
                Status status13 = (Status) zzbn.a(parcel, Status.CREATOR);
                zzjs zzjsVar = (zzjs) zzbn.a(parcel, zzjs.CREATOR);
                zzbn.d(parcel);
                TaskUtil.setResultOrApiException(status13, zzjsVar, (TaskCompletionSource<zzjs>) ((c15) this).a);
                return true;
            case 14:
                Status status14 = (Status) zzbn.a(parcel, Status.CREATOR);
                zzbn.d(parcel);
                TaskUtil.setResultOrApiException(status14, ((c15) this).a);
                return true;
            case 15:
                Status status15 = (Status) zzbn.a(parcel, Status.CREATOR);
                zzbn.d(parcel);
                TaskUtil.setResultOrApiException(status15, ((c15) this).a);
                return true;
            case 16:
                Status status16 = (Status) zzbn.a(parcel, Status.CREATOR);
                long j = parcel.readLong();
                zzbn.d(parcel);
                TaskUtil.setResultOrApiException(status16, Long.valueOf(j), (TaskCompletionSource<Long>) ((c15) this).a);
                return true;
            default:
                return false;
        }
    }
}
