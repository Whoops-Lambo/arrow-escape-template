package com.bytedance.sdk.openadsdk.api.init;

import android.text.TextUtils;
import com.bytedance.sdk.component.fi.rz.uq;
import com.bytedance.sdk.component.utils.sx;
import com.bytedance.sdk.component.utils.vs;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.api.PAGConstant;
import com.bytedance.sdk.openadsdk.core.bmz;
import com.bytedance.sdk.openadsdk.utils.ftg;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class PAGConfig implements InitConfig {
    private static String yo;
    private boolean ahm;
    private String ct;
    private String fi;
    private String kgy;
    private String noq;
    private int rz = -1;
    private int uq = 0;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Builder {
        private boolean ahm;
        private String[] ct;
        private String kgy;
        private String noq;
        private String yo;
        private int rz = -1;
        private int uq = 0;
        private String fi = "";

        @Deprecated
        public Builder appIcon(int i) {
            return this;
        }

        public Builder supportMultiProcess(boolean z) {
            return this;
        }

        public Builder useTextureView(boolean z) {
            return this;
        }

        public Builder appId(String str) {
            this.kgy = str;
            return this;
        }

        public PAGConfig build() {
            PAGConfig pAGConfig = new PAGConfig();
            pAGConfig.ahm(this.kgy);
            pAGConfig.ahm(this.uq);
            pAGConfig.kgy(this.rz);
            pAGConfig.kgy(this.ahm);
            pAGConfig.rz(this.noq);
            pAGConfig.kgy(this.yo);
            pAGConfig.uq(this.fi);
            return pAGConfig;
        }

        public Builder debugLog(boolean z) {
            this.ahm = z;
            return this;
        }

        public Builder needClearTaskReset(String... strArr) {
            this.ct = strArr;
            return this;
        }

        public Builder setAdxId(String str) {
            this.fi = str;
            return this;
        }

        public Builder setPAConsent(@PAGConstant.PAGPAConsentType int i) {
            if (i == 0 || i == 1) {
                this.rz = i;
                return this;
            }
            this.rz = -2;
            return this;
        }

        public Builder setPackageName(String str) {
            this.noq = str;
            return this;
        }

        public Builder setUserData(String str) {
            this.yo = str;
            return this;
        }

        public Builder titleBarTheme(int i) {
            this.uq = i;
            return this;
        }
    }

    @Deprecated
    public static void setAppIconId(int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isSupportMultiProcess() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isUseTextureView() {
        return true;
    }

    public static int getPAConsent() {
        if (ftg.nu("getPAConsent")) {
            return bmz.kgy().uq();
        }
        return -1;
    }

    public static void setPAConsent(@PAGConstant.PAGPAConsentType int i) {
        if (ftg.nu("setPAConsent")) {
            if (i == 1 || i == 0) {
                bmz.kgy().uq(i);
            } else {
                bmz.kgy().uq(-2);
            }
        }
    }

    public static void setPackageName(String str) {
        yo = str;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getAdxId() {
        return this.fi;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getAppId() {
        return this.kgy;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getData() {
        return this.noq;
    }

    public boolean getDebugLog() {
        return this.ahm;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getPA() {
        return this.rz;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getPackageName() {
        return TextUtils.isEmpty(this.ct) ? yo : this.ct;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getTitleBarTheme() {
        return this.uq;
    }

    public static void debugLog(boolean z) {
        if (bmz.kgy() != null) {
            if (z) {
                bmz.kgy().ahm(1);
                bmz.kgy().kgy();
            } else {
                bmz.kgy().ahm(0);
                uq.kgy(uq.kgy.OFF);
                vs.ahm();
                sx.ahm();
            }
        }
    }

    public static void setUserData(String str) {
        if (bmz.kgy() != null) {
            bmz.kgy().ahm(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rz(String str) {
        this.ct = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uq(String str) {
        this.fi = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ahm(String str) {
        this.kgy = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ahm(int i) {
        this.uq = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kgy(String str) {
        this.noq = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kgy(boolean z) {
        this.ahm = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kgy(int i) {
        this.rz = i;
    }
}
