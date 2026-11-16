package com.unity3d.services.core.log;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class DeviceLogLevel {
    private static final String LOG_TAG = "UnityAds";
    private String _receivingMethodName;

    public String getLogTag() {
        return "UnityAds";
    }

    public String getReceivingMethodName() {
        return this._receivingMethodName;
    }

    public DeviceLogLevel(String str) {
        this._receivingMethodName = str;
    }
}
