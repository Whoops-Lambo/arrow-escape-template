package com.bytedance.sdk.openadsdk.api;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class PAGRequest {
    private Map<String, Object> ahm;
    private String kgy;
    private Bundle rz = null;

    public final void addNetworkExtrasBundle(Class<?> cls, Bundle bundle) {
        if (this.rz == null) {
            this.rz = new Bundle();
        }
        this.rz.putBundle(cls.getName(), bundle);
    }

    public String getAdString() {
        return this.kgy;
    }

    public Map<String, Object> getExtraInfo() {
        return this.ahm;
    }

    public Bundle getNetworkExtrasBundle() {
        return this.rz;
    }

    public void setAdString(String str) {
        this.kgy = str;
    }

    public void setExtraInfo(Map<String, Object> map) {
        this.ahm = map;
    }
}
