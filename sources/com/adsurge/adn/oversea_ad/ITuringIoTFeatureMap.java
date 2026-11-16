package com.adsurge.adn.oversea_ad;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public interface ITuringIoTFeatureMap {
    public static final int CIOT_CHANNEL = 4006;
    public static final int CIOT_DEVICEID = 4001;
    public static final int CIOT_ICCID1 = 4002;
    public static final int CIOT_ICCID2 = 4003;
    public static final int CIOT_ICCID3 = 4004;
    public static final int CIOT_IMEI = 4005;
    public static final int CIOT_JASPERID = 4007;
    public static final int CIOT_OPENID = 4010;
    public static final int CIOT_PLATNUMBER = 4009;
    public static final int CIOT_QIMEI = 4008;
    public static final int RIOT_BLUE_TOOTH_MAC_ADDRESS = 3006;
    public static final int RIOT_CAMERA_SERIAL = 3008;
    public static final int RIOT_CPU_ID = 3009;
    public static final int RIOT_CPU_MAX_FREQ = 3001;
    public static final int RIOT_LAN_MAC_ADDRESS = 3004;
    public static final int RIOT_NEAR_BY_WIFI_SSID = 3010;
    public static final int RIOT_OS_TYPE = 3003;
    public static final int RIOT_SIM_NUMBER = 3007;
    public static final int RIOT_TOTAL_MEM = 3002;
    public static final int RIOT_WIFI_MAC_ADDRESS = 3005;

    Map<Integer, String> getFeatures(Context context);
}
