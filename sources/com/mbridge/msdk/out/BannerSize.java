package com.mbridge.msdk.out;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.m0;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class BannerSize {
    public static final int DEV_SET_TYPE = 5;
    public static final int LARGE_TYPE = 1;
    public static final int MEDIUM_TYPE = 2;
    public static final int SMART_TYPE = 3;
    public static final int STANDARD_TYPE = 4;
    private int height;
    private int width;

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public BannerSize(int i, int i2, int i3) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return;
                        }
                        this.height = i3;
                        this.width = i2;
                        return;
                    }
                    this.height = 50;
                    this.width = Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
                    return;
                }
                setSmartMode();
                return;
            }
            this.height = 250;
            this.width = 300;
            return;
        }
        this.height = 90;
        this.width = Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
    }

    private void setSmartMode() {
        if (m0.m(c.n().d()) < 720) {
            this.height = 50;
            this.width = Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
        } else {
            this.height = 90;
            this.width = 728;
        }
    }
}
