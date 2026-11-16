package com.fyber.inneractive.sdk.response.nativead;

import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class k extends com.fyber.inneractive.sdk.response.e {
    public i M;

    @Override // com.fyber.inneractive.sdk.response.e
    public final InneractiveErrorCode a(InneractiveAdRequest inneractiveAdRequest, r rVar) {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.response.e
    public final InneractiveErrorCode b() {
        return null;
    }

    public final e c() {
        f fVar;
        ArrayList arrayList;
        i iVar = this.M;
        if (iVar == null || (arrayList = iVar.a) == null) {
            fVar = null;
        } else {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                fVar = (f) obj;
                if (fVar.c != null) {
                }
            }
            fVar = null;
        }
        if (fVar != null) {
            return fVar.c;
        }
        return null;
    }

    public final boolean d() {
        String str;
        e eVarC = c();
        if (eVarC != null && (str = eVarC.a) != null && !str.isEmpty()) {
            return true;
        }
        return false;
    }
}
