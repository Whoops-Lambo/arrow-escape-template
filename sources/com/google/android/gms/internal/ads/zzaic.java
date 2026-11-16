package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaic {
    public static final zzhcn a = new zzhcn(new int[]{0, 2, 1}, 3);
    public static final zzhcn b = new zzhcn(new int[]{0, 2, 1, 3, 4}, 5);
    public static final zzhcn c = new zzhcn(new int[]{0, 2, 1, 5, 3, 4}, 6);
    public static final zzhcn d;
    public static final zzhcn e;

    static {
        int[] iArr = new int[7];
        iArr[0] = 0;
        System.arraycopy(new int[]{2, 1, 6, 5, 3, 4}, 0, iArr, 1, 6);
        d = new zzhcn(iArr, 7);
        int[] iArr2 = new int[8];
        iArr2[0] = 0;
        System.arraycopy(new int[]{2, 1, 7, 5, 6, 3, 4}, 0, iArr2, 1, 7);
        e = new zzhcn(iArr2, 8);
    }

    public static zzap a(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String str2 = zzfq.a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                zzeh.c("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzaju.b(new zzey(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e2) {
                    zzeh.d("VorbisUtil", "Failed to parse vorbis picture", e2);
                }
            } else {
                arrayList.add(new zzakq(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzap(arrayList);
    }
}
