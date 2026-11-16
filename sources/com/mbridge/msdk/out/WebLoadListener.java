package com.mbridge.msdk.out;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface WebLoadListener {
    void onFailed(String str, int i, int i2, int i3, String str2, String str3);

    void onProgress(String str, int i, int i2, int i3, String str2, String str3);

    void onSucess(String str, int i, int i2, int i3, String str2, String str3);
}
