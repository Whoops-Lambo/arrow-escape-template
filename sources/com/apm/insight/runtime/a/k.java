package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
final class k extends c {
    public k(Context context, b bVar, d dVar) {
        super(CrashType.LAUNCH, context, bVar, dVar);
    }

    @Override // com.apm.insight.runtime.a.c
    public final com.apm.insight.entity.a a(int i, com.apm.insight.entity.a aVar) {
        com.apm.insight.entity.a aVarA = super.a(i, aVar);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 5) {
                        Header.b(aVarA.d());
                        return aVarA;
                    }
                } else {
                    Header.a(aVarA.d());
                    try {
                        aVarA.d().f().put("launch_did", com.apm.insight.i.a.a(this.b));
                    } catch (Throwable unused) {
                    }
                }
                return aVarA;
            }
            Header headerD = aVarA.d();
            headerD.d();
            headerD.e();
            return aVarA;
        }
        Header headerA = Header.a(this.b);
        headerA.c();
        aVarA.a(headerA);
        com.apm.insight.a.a(aVarA, headerA, this.a);
        return aVarA;
    }
}
