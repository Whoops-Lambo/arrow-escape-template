package com.mbridge.msdk.config.component.midi.monitor;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class b {
    public void a(String str, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        try {
            new com.mbridge.msdk.config.component.common.kit.a().a(str, aVar);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("OMSDKPlayerMonitor", e.getMessage(), e);
            }
        }
    }
}
