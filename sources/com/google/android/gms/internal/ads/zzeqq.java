package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzeqq {
    public final zzfnc a;
    public final zzdyk b;
    public final zzeaw c;

    /* JADX WARN: Code duplicated, block: B:11:0x0057  */
    public final void a(zzflt zzfltVar, zzflq zzflqVar, int i, zzenh zzenhVar, long j) {
        String strGroup;
        zzeav zzeavVarA = this.c.a();
        zzeavVarA.b("gqi", zzfltVar.b);
        zzeavVarA.a(zzflqVar);
        zzeavVarA.b("action", "adapter_status");
        zzeavVarA.b("adapter_l", String.valueOf(j));
        zzeavVarA.b("sc", Integer.toString(i));
        zzdyj zzdyjVar = null;
        if (zzenhVar != null) {
            zzeavVarA.b("arec", Integer.toString(zzenhVar.f().zza));
            String message = zzenhVar.getMessage();
            Pattern pattern = this.a.a;
            if (pattern == null || message == null) {
                strGroup = null;
            } else {
                Matcher matcher = pattern.matcher(message);
                if (matcher.find()) {
                    strGroup = matcher.group();
                } else {
                    strGroup = null;
                }
            }
            if (strGroup != null) {
                zzeavVarA.b("areec", strGroup);
            }
        }
        Iterator it = zzflqVar.t.iterator();
        while (it.hasNext()) {
            zzdyj zzdyjVarB = this.b.b((String) it.next());
            if (zzdyjVarB != null) {
                zzdyjVar = zzdyjVarB;
                break;
            }
        }
        if (zzdyjVar != null) {
            zzeavVarA.b("ancn", zzdyjVar.a);
            zzbyu zzbyuVar = zzdyjVar.b;
            if (zzbyuVar != null) {
                zzeavVarA.b("adapter_v", zzbyuVar.toString());
            }
            zzbyu zzbyuVar2 = zzdyjVar.c;
            if (zzbyuVar2 != null) {
                zzeavVarA.b("adapter_sv", zzbyuVar2.toString());
            }
        }
        zzeavVarA.c();
    }

    public zzeqq(zzfnc zzfncVar, zzdyk zzdykVar, zzeaw zzeawVar) {
        this.a = zzfncVar;
        this.b = zzdykVar;
        this.c = zzeawVar;
    }
}
