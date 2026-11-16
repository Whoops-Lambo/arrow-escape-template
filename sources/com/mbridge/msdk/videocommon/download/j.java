package com.mbridge.msdk.videocommon.download;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import defpackage.q63;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class j {
    private AtomicBoolean a;
    private AtomicBoolean b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b {
        private static final j a = new j();
    }

    public boolean a(int i) {
        if (MBridgeConstans.DEBUG) {
            q0.c("RewardVideoRefactorManager", "isRewardVideoRefactor adType: " + i + ", key: REWARD_VIDEO_REFACTOR_FOR_CAMPAIGN_REQUEST");
        }
        if (i != 94 && i != 287) {
            return false;
        }
        AtomicBoolean atomicBoolean = this.b;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        try {
            this.b = new AtomicBoolean(s0.a().a("r_v_r_f_c_r", false));
        } catch (Exception e) {
            this.b = new AtomicBoolean(false);
            if (MBridgeConstans.DEBUG) {
                q63.r(e, new StringBuilder("isRewardVideoRefactor error: "), "RewardVideoRefactorManager");
            }
        }
        return this.b.get();
    }

    public boolean b(int i) {
        if (MBridgeConstans.DEBUG) {
            q0.c("RewardVideoRefactorManager", "isRewardVideoRefactor adType: " + i + ", key: REWARD_VIDEO_REFACTOR_FOR_LOAD");
        }
        if (i != 94 && i != 287) {
            return false;
        }
        AtomicBoolean atomicBoolean = this.a;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        try {
            this.a = new AtomicBoolean(s0.a().a("r_v_r_f_l", false));
        } catch (Exception e) {
            this.a = new AtomicBoolean(false);
            if (MBridgeConstans.DEBUG) {
                q63.r(e, new StringBuilder("isRewardVideoRefactor error: "), "RewardVideoRefactorManager");
            }
        }
        return this.a.get();
    }

    private j() {
    }

    public static j a() {
        return b.a;
    }
}
