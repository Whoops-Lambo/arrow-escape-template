package com.bytedance.sdk.openadsdk.utils;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class twf {
    public static void kgy(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "fechkCC9as+Ff8NUgAI=", "WOIihgaNfM6FXttE", 13);
                th.getMessage();
            }
        }
    }
}
