package com.mbridge.msdk.foundation.same.net.wrapper;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class a extends c {
    public a(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.foundation.same.net.wrapper.c
    public void addExtraParams(String str, e eVar) {
        try {
            int iA = v0.a();
            String strC = v0.c();
            if (eVar != null) {
                eVar.a("misk_spt", String.valueOf(iA));
                if (!TextUtils.isEmpty(strC)) {
                    eVar.a("misk_spt_det", strC);
                }
            }
        } catch (Exception e) {
            q0.a("CampaignRequest", e.getMessage());
        } finally {
            super.addExtraParams(str, eVar);
        }
    }
}
