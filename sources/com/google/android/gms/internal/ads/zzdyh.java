package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdyh {
    public final zzeaw a;

    public zzdyh(zzeaw zzeawVar) {
        this.a = zzeawVar;
    }

    public final boolean a(zzgdm zzgdmVar) {
        boolean zP = zzgdmVar.P();
        zzeaw zzeawVar = this.a;
        if (zP) {
            zzeav zzeavVarA = zzeawVar.a();
            zzeavVarA.b("action", "aq_ad_closed");
            zzeavVarA.b("gqi", zzgdmVar.H());
            zzeavVarA.b("aq_ad_duration", String.valueOf(zzgdmVar.I()));
            zzeavVarA.b("aq_ad_bounce_cnt", String.valueOf(zzgdmVar.J()));
            zzeavVarA.b("aq_time_away", String.valueOf(zzgdmVar.M()));
            return zzeavVarA.d().equals(com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
        }
        zzeav zzeavVarA2 = zzeawVar.a();
        zzeavVarA2.b("action", "aq_ad_kill");
        zzeavVarA2.b("gqi", zzgdmVar.H());
        zzeavVarA2.b("aq_ad_duration", String.valueOf(zzgdmVar.I()));
        zzeavVarA2.b("aq_ad_bounce_cnt", String.valueOf(zzgdmVar.J()));
        zzeavVarA2.b("aq_time_away", String.valueOf(zzgdmVar.M()));
        zzeavVarA2.b("aq_is_os_kill", String.valueOf(zzgdmVar.L()));
        return zzeavVarA2.d().equals(com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
    }
}
