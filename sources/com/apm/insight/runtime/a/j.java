package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
final class j extends c {
    public j(Context context, b bVar, d dVar) {
        super(CrashType.JAVA, context, bVar, dVar);
    }

    @Override // com.apm.insight.runtime.a.c
    public final com.apm.insight.entity.a a(int i, com.apm.insight.entity.a aVar) {
        com.apm.insight.entity.a aVarA = super.a(i, aVar);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 5) {
                        return aVarA;
                    }
                    Header.b(aVarA.d());
                    return aVarA;
                }
                Header.a(aVarA.d());
                return aVarA;
            }
            Header headerD = aVarA.d();
            headerD.d();
            headerD.e();
            return aVarA;
        }
        aVarA.a("app_count", (Object) 1);
        aVarA.a("magic_tag", "ss_app_log");
        Header headerA = Header.a(this.b);
        headerA.c();
        aVarA.a(headerA);
        com.apm.insight.a.a(aVarA, headerA, this.a);
        return aVarA;
    }
}
