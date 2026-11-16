package com.mbridge.msdk.setting.net;

import android.content.Context;
import com.ironsource.R6;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class d {
    public static void a(Context context, e eVar) {
        if (eVar == null) {
            return;
        }
        try {
            eVar.a(R6.X0, g.d());
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("SettingRequestDiff", e.getMessage());
            }
        }
    }
}
