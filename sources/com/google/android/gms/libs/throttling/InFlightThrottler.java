package com.google.android.gms.libs.throttling;

import android.util.LongSparseArray;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@KeepForSdk
public final class InFlightThrottler implements GmsThrottler {
    public long a = 0;
    public final LongSparseArray b = new LongSparseArray(2000);

    @Override // com.google.android.gms.libs.throttling.GmsThrottler
    public final boolean a(long j, ThrottlingLimits throttlingLimits) {
        int i = throttlingLimits.a;
        if (i <= 0) {
            return false;
        }
        LongSparseArray longSparseArray = this.b;
        synchronized (longSparseArray) {
            try {
                long[] jArr = (long[]) longSparseArray.get(j);
                if (jArr != null) {
                    long j2 = jArr[0];
                    long j3 = this.a + 1;
                    this.a = j3;
                    jArr[1] = j3;
                    if (j2 >= i) {
                        return false;
                    }
                    jArr[0] = j2 + 1;
                    return true;
                }
                if (longSparseArray.size() >= 2000) {
                    int size = longSparseArray.size();
                    long j4 = Long.MAX_VALUE;
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        long j5 = ((long[]) longSparseArray.valueAt(i3))[1];
                        if (j5 < j4) {
                            j4 = j5;
                        }
                        if (j5 < j4) {
                            i2 = i3;
                        }
                    }
                    longSparseArray.removeAt(i2);
                }
                long j6 = this.a + 1;
                this.a = j6;
                longSparseArray.put(j, new long[]{1, j6});
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.libs.throttling.GmsThrottler
    public final void b(long j) {
        LongSparseArray longSparseArray = this.b;
        synchronized (longSparseArray) {
            try {
                long[] jArr = (long[]) longSparseArray.get(j);
                if (jArr == null) {
                    return;
                }
                long j2 = jArr[0] - 1;
                jArr[0] = j2;
                if (j2 <= 0) {
                    longSparseArray.delete(j);
                } else {
                    long j3 = this.a + 1;
                    this.a = j3;
                    jArr[1] = j3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @KeepForSdk
    public InFlightThrottler() {
    }
}
