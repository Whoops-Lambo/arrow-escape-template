package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.nearby.b;
import com.google.android.gms.internal.nearby.zzdo;
import com.google.android.gms.internal.nearby.zzsn;
import com.google.android.gms.internal.nearby.zzsr;
import com.google.android.gms.internal.nearby.zzss;
import com.google.android.gms.nearby.exposurenotification.ExposureNotificationStatus;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class gq3 extends zzdo {
    public final /* synthetic */ int a;
    public final /* synthetic */ TaskCompletionSource b;

    public /* synthetic */ gq3(TaskCompletionSource taskCompletionSource, int i) {
        this.a = i;
        this.b = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.nearby.zzdp
    public final void R2(Status status, long j) {
        zzsn j85Var;
        int i = this.a;
        TaskCompletionSource taskCompletionSource = this.b;
        switch (i) {
            case 0:
                TaskUtil.trySetResultOrApiException(status, Long.valueOf(j), taskCompletionSource);
                break;
            default:
                zzsr zzsrVar = new zzsr();
                for (ExposureNotificationStatus exposureNotificationStatus : ExposureNotificationStatus.values()) {
                    if ((exposureNotificationStatus.a & j) != 0) {
                        int i2 = zzsrVar.b;
                        int i3 = i2 + 1;
                        Object[] objArr = zzsrVar.a;
                        int length = objArr.length;
                        if (length < i3) {
                            int i4 = length + (length >> 1) + 1;
                            if (i4 < i3) {
                                int iHighestOneBit = Integer.highestOneBit(i2);
                                i4 = iHighestOneBit + iHighestOneBit;
                            }
                            if (i4 < 0) {
                                i4 = Integer.MAX_VALUE;
                            }
                            zzsrVar.a = Arrays.copyOf(objArr, i4);
                            zzsrVar.c = false;
                        } else if (zzsrVar.c) {
                            zzsrVar.a = (Object[]) objArr.clone();
                            zzsrVar.c = false;
                        }
                        Object[] objArr2 = zzsrVar.a;
                        int i5 = zzsrVar.b;
                        zzsrVar.b = i5 + 1;
                        objArr2[i5] = exposureNotificationStatus;
                    }
                }
                int i6 = zzsrVar.b;
                if (i6 != 0) {
                    Object[] objArr3 = zzsrVar.a;
                    if (i6 != 1) {
                        j85Var = zzss.x(i6, objArr3);
                        zzsrVar.b = j85Var.size();
                        zzsrVar.c = true;
                    } else {
                        Object obj = objArr3[0];
                        obj.getClass();
                        j85Var = new j85(obj);
                    }
                } else {
                    j85Var = b.i;
                }
                TaskUtil.trySetResultOrApiException(status, j85Var, taskCompletionSource);
                break;
        }
    }
}
