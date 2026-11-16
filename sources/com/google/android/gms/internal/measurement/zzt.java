package com.google.android.gms.internal.measurement;

import androidx.core.app.NotificationCompat;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import defpackage.do4;
import defpackage.k55;
import defpackage.r75;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzt extends zzai {
    public final zzr c;

    public zzt(do4 do4Var) {
        super("internal.logger");
        this.c = do4Var;
        this.b.put(CreativeInfo.f, new r75(this, false, true));
        this.b.put(NotificationCompat.GROUP_KEY_SILENT, new k55(NotificationCompat.GROUP_KEY_SILENT, 0));
        ((zzai) this.b.get(NotificationCompat.GROUP_KEY_SILENT)).c(CreativeInfo.f, new r75(this, true, true));
        this.b.put("unmonitored", new k55("unmonitored", 1));
        ((zzai) this.b.get("unmonitored")).c(CreativeInfo.f, new r75(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao b(zzg zzgVar, List list) {
        return zzao.e9;
    }
}
