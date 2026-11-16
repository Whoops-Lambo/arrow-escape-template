package com.mbridge.msdk.videocommon.download;

import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class g {
    public static String a(String str) {
        try {
            return H5DownLoadManager.getInstance().getH5ResAddress(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String b(String str) {
        try {
            return HTMLResourceManager.getInstance().getHtmlContentFromUrl(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
