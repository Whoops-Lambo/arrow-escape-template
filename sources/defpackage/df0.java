package defpackage;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzgvh;
import com.google.android.gms.internal.ads.zzgvz;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class df0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public /* synthetic */ df0(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static df0 a(String str) {
        zzgvz.a(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                if (i3 == -1 || i4 == -1 || i6 == -1) {
                    return null;
                }
                return new df0(i2, i3, i4, i5, i6, length);
            }
            String strA = zzgvh.a(strArrSplit[i].trim());
            switch (strA.hashCode()) {
                case 100571:
                    if (strA.equals("end")) {
                        i4 = i;
                    }
                    break;
                case 3556653:
                    if (strA.equals("text")) {
                        i6 = i;
                    }
                    break;
                case 102749521:
                    if (strA.equals("layer")) {
                        i2 = i;
                    }
                    break;
                case 109757538:
                    if (strA.equals("start")) {
                        i3 = i;
                    }
                    break;
                case 109780401:
                    if (strA.equals("style")) {
                        i5 = i;
                    }
                    break;
            }
            i++;
        }
    }
}
