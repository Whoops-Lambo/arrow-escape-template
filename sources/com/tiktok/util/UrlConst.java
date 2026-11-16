package com.tiktok.util;

import com.tiktok.TikTokBusinessSdk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class UrlConst {
    public static final String HTTPS = "https://";
    public static final String PATH_BATCH = "/api/v1/app_sdk/batch";
    public static final String PATH_CONFIG = "/api/v1/app_sdk/config";
    public static final String PATH_CONFIG2 = "/api/v1/app_sdk/cache/config";
    public static final String PATH_DDL = "/api/v1/app_sdk/ddl";
    public static final String PATH_MONITOR = "/api/v1/app_sdk/monitor";

    public static String getBatchUrl() {
        return "https://" + TikTokBusinessSdk.getApiTrackDomain() + PATH_BATCH;
    }

    public static String getConfigUrl() {
        return "https://analytics.us.tiktok.com/api/v1/app_sdk/cache/config";
    }

    public static String getDDLUrl() {
        return "https://" + TikTokBusinessSdk.getApiTrackDomain() + PATH_DDL;
    }

    public static String getDebugModeUrl() {
        return "https://analytics.us.tiktok.com/api/v1/app_sdk/config";
    }

    public static String getMonitorUrl() {
        return "https://" + TikTokBusinessSdk.getApiTrackDomain() + PATH_MONITOR;
    }
}
