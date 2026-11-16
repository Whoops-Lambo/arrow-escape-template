package com.google.android.gms.games;

import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class zzg extends DataBufferRef {
    public zzg(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public final String zzj(String str, String str2) {
        if (hasColumn(str) && !hasNull(str)) {
            return getString(str);
        }
        return null;
    }

    public final int zzu(String str, int i) {
        if (hasColumn(str) && !hasNull(str)) {
            return getInteger(str);
        }
        return i;
    }
}
