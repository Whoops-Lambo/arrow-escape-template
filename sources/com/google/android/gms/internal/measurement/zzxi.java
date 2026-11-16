package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzyi;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class zzxi<API extends zzyi<API>> {
    public final zzzf a;

    public static void a(String str, zzxz zzxzVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(zzxzVar.b / 1000000)));
        sb.append(": logging error [");
        zzze.a(1, zzxzVar.g(), sb);
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }

    public zzxi(zzzf zzzfVar) {
        this.a = zzzfVar;
    }
}
