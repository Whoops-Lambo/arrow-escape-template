package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzabj extends zzabh {
    public static final Map d;
    public final zzyz c;

    static {
        EnumMap enumMap = new EnumMap(zzyz.class);
        for (zzyz zzyzVar : zzyz.values()) {
            zzabj[] zzabjVarArr = new zzabj[10];
            for (int i = 0; i < 10; i++) {
                zzabjVarArr[i] = new zzabj(i, zzyzVar, zzza.e);
            }
            enumMap.put(zzyzVar, zzabjVarArr);
        }
        d = Collections.unmodifiableMap(enumMap);
    }

    @Override // com.google.android.gms.internal.measurement.zzabh
    public final void a(zzyy zzyyVar, Object obj) {
        zzyyVar.a(obj, this.c, this.b);
    }

    public zzabj(int i, zzyz zzyzVar, zzza zzzaVar) {
        super(zzzaVar, i);
        zzabr.a(zzyzVar, "format char");
        this.c = zzyzVar;
        if (!zzzaVar.a()) {
            int i2 = zzyzVar.a;
            i2 = zzzaVar.c() ? i2 & 65503 : i2;
            StringBuilder sb = new StringBuilder("%");
            zzzaVar.d(sb);
            sb.append((char) i2);
        }
    }
}
