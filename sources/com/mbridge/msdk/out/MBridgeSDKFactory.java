package com.mbridge.msdk.out;

import android.annotation.SuppressLint;
import com.mbridge.msdk.system.MBridgeSDKImpl;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class MBridgeSDKFactory {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile MBridgeSDKImpl instance;

    public static MBridgeSDKImpl getMBridgeSDK() {
        if (instance == null) {
            synchronized (MBridgeSDKFactory.class) {
                try {
                    if (instance == null) {
                        instance = new MBridgeSDKImpl();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    private MBridgeSDKFactory() {
    }
}
