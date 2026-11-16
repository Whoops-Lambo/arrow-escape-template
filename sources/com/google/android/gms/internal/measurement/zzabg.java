package com.google.android.gms.internal.measurement;

import java.util.Calendar;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzabg extends zzabh {
    public final zzabf c;

    @Override // com.google.android.gms.internal.measurement.zzabh
    public final void a(zzyy zzyyVar, Object obj) {
        StringBuilder sb = zzyyVar.e;
        boolean z = obj instanceof Date;
        zzabf zzabfVar = this.c;
        if (!z && !(obj instanceof Calendar) && !(obj instanceof Long)) {
            char c = zzabfVar.a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(c).length() + 2);
            sb2.append("%t");
            sb2.append(c);
            zzyy.b(sb, obj, sb2.toString());
            return;
        }
        StringBuilder sb3 = new StringBuilder("%");
        zzza zzzaVar = this.b;
        zzzaVar.d(sb3);
        sb3.append(true != zzzaVar.c() ? 't' : 'T');
        sb3.append(zzabfVar.a);
        sb.append(String.format(zzzh.a, sb3.toString(), obj));
    }

    public zzabg(zzza zzzaVar, int i, zzabf zzabfVar) {
        char c;
        super(zzzaVar, i);
        this.c = zzabfVar;
        StringBuilder sb = new StringBuilder("%");
        zzzaVar.d(sb);
        if (true != zzzaVar.c()) {
            c = 't';
        } else {
            c = 'T';
        }
        sb.append(c);
        sb.append(zzabfVar.a);
    }
}
