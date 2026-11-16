package com.mbridge.msdk.out;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public interface IDownloadListener {
    void onEnd(int i, int i2, String str);

    void onProgressUpdate(int i);

    void onStart();

    void onStatus(int i);
}
