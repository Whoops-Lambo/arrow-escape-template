package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbha {
    public static String b(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzf("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i5 = i3 - 1;
            if (i >= i5) {
                sb.append(strArr[i5]);
                return sb.toString();
            }
            sb.append(strArr[i]);
            sb.append(' ');
            i++;
        }
    }

    public static long c(int i, long j) {
        if (i == 1) {
            return j;
        }
        int i2 = i >> 1;
        long j2 = (j * j) % 1073807359;
        return (i & 1) == 0 ? c(i2, j2) % 1073807359 : ((c(i2, j2) % 1073807359) * j) % 1073807359;
    }

    public static long d(int i, String[] strArr) {
        long jA = (((long) zzbgx.a(strArr[0])) + 2147483647L) % 1073807359;
        for (int i2 = 1; i2 < i; i2++) {
            jA = (((((long) zzbgx.a(strArr[i2])) + 2147483647L) % 1073807359) + ((jA * 16785407) % 1073807359)) % 1073807359;
        }
        return jA;
    }

    public static void a(int i, long j, String str, int i2, PriorityQueue priorityQueue) {
        zzbgz zzbgzVar = new zzbgz(i2, j, str);
        if ((priorityQueue.size() != i || (((zzbgz) priorityQueue.peek()).c <= i2 && ((zzbgz) priorityQueue.peek()).a <= j)) && !priorityQueue.contains(zzbgzVar)) {
            priorityQueue.add(zzbgzVar);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }
}
