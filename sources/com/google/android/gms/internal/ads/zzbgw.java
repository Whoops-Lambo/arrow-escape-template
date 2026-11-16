package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.sl3;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbgw {
    public final int a;
    public final zzbgy b = new zzbgy();

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    public final String a(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        ?? r3 = 0;
        for (int i = 0; i < size; i++) {
            sb.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] strArrSplit = sb.toString().split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 10);
        sl3 sl3Var = new sl3(8);
        int i2 = this.a;
        PriorityQueue priorityQueue = new PriorityQueue(i2, sl3Var);
        int i3 = 0;
        while (i3 < strArrSplit.length) {
            String[] strArrB = zzbgx.b(strArrSplit[i3], r3);
            if (strArrB.length != 0) {
                int length = strArrB.length;
                if (length < 6) {
                    zzbha.a(i2, zzbha.d(length, strArrB), zzbha.b(strArrB, r3, length), length, priorityQueue);
                } else {
                    long jD = zzbha.d(6, strArrB);
                    zzbha.a(i2, jD, zzbha.b(strArrB, r3, 6), 6, priorityQueue);
                    int i4 = 1;
                    while (true) {
                        int length2 = strArrB.length;
                        if (i4 < length2 - 5) {
                            int iA = zzbgx.a(strArrB[i4 - 1]);
                            int iA2 = zzbgx.a(strArrB[i4 + 5]);
                            int i5 = i4;
                            String[] strArr = strArrSplit;
                            String strB = zzbha.b(strArrB, i5, 6);
                            jD = (((((long) iA2) + 2147483647L) % 1073807359) + (((((jD + 1073807359) - ((((((long) iA) + 2147483647L) % 1073807359) * zzbha.c(5, 16785407L)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
                            zzbha.a(i2, jD, strB, length2, priorityQueue);
                            i4 = i5 + 1;
                            strArrSplit = strArr;
                            byteArrayOutputStream = byteArrayOutputStream;
                        }
                    }
                }
            }
            i3++;
            strArrSplit = strArrSplit;
            byteArrayOutputStream = byteArrayOutputStream;
            r3 = 0;
        }
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                base64OutputStream.write(this.b.b(((zzbgz) it.next()).b));
            } catch (IOException e) {
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzg("Error while writing hash to byteStream", e);
            }
        }
        try {
            base64OutputStream.close();
        } catch (IOException e2) {
            int i7 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("HashManager: Unable to convert to Base64.", e2);
        }
        try {
            byteArrayOutputStream2.close();
            return byteArrayOutputStream2.toString();
        } catch (IOException e3) {
            int i8 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("HashManager: Unable to convert to Base64.", e3);
            return "";
        }
    }

    public zzbgw(int i) {
        this.a = i;
    }
}
