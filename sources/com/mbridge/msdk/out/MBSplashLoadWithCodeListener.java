package com.mbridge.msdk.out;

import com.mbridge.msdk.util.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class MBSplashLoadWithCodeListener implements MBSplashLoadListener {
    public abstract void onLoadFailedWithCode(MBridgeIds mBridgeIds, int i, String str, int i2);

    @Override // com.mbridge.msdk.out.MBSplashLoadListener
    public void onLoadFailed(MBridgeIds mBridgeIds, String str, int i) {
        onLoadFailedWithCode(mBridgeIds, a.a(5000, str), str, i);
    }
}
