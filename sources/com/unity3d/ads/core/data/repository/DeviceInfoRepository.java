package com.unity3d.ads.core.data.repository;

import com.ironsource.C4664b4;
import com.ironsource.R6;
import defpackage.bp0;
import defpackage.d;
import defpackage.dy;
import defpackage.np1;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u000f\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\r\u0010\u0004J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\fH¦@¢\u0006\u0004\b\u000e\u0010\u0004J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000fH¦@¢\u0006\u0004\b\u0010\u0010\u0004J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\fH¦@¢\u0006\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010#R\u0014\u00100\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010#R\u0014\u00102\u001a\u00020%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010'R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\f038&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00108\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u0010#R\u0014\u0010:\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u0010#R\u0014\u0010<\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010#R\u0014\u0010>\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010#R\u0014\u0010A\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "staticDeviceInfo", "(Ldy;)Ljava/lang/Object;", "cachedStaticDeviceInfo", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "", "addAccelerometerData", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfo", "(Z)Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "", "getIdfi", "getAuidString", "Lcom/google/protobuf/ByteString;", "getAuidByteString", "getUnityBuildGuid", "Lnp1;", "Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;", "getAllowedPii", "()Lnp1;", "allowedPii", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "dynamicDeviceInfo", "Lgatewayprotocol/v1/PiiOuterClass$Pii;", "getPiiData", "()Lgatewayprotocol/v1/PiiOuterClass$Pii;", "piiData", "Lbp0;", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;", "getVolumeSettingsChange", "()Lbp0;", "volumeSettingsChange", "getAnalyticsUserId", "()Ljava/lang/String;", "analyticsUserId", "", "getRingerMode", "()I", "ringerMode", "", "getSystemBootTime", "()J", "systemBootTime", "getOrientation", C4664b4.i.n, "getConnectionTypeStr", "connectionTypeStr", "getCurrentUiTheme", "currentUiTheme", "", "getLocaleList", "()Ljava/util/List;", "localeList", "getAppName", "appName", "getModel", R6.B, "getManufacturer", "manufacturer", "getOsVersion", "osVersion", "getHasInternet", "()Z", "hasInternet", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface DeviceInfoRepository {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo$default(DeviceInfoRepository deviceInfoRepository, boolean z, int i, Object obj) {
            if (obj != null) {
                d.u("Super calls with default arguments not supported in this target, function: getDynamicDeviceInfo");
                return null;
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return deviceInfoRepository.getDynamicDeviceInfo(z);
        }
    }

    @NotNull
    StaticDeviceInfoOuterClass.StaticDeviceInfo cachedStaticDeviceInfo();

    @NotNull
    np1 getAllowedPii();

    @Nullable
    String getAnalyticsUserId();

    @NotNull
    String getAppName();

    @Nullable
    Object getAuidByteString(@NotNull dy dyVar);

    @Nullable
    Object getAuidString(@NotNull dy dyVar);

    @NotNull
    String getConnectionTypeStr();

    int getCurrentUiTheme();

    @NotNull
    DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

    @NotNull
    DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo(boolean addAccelerometerData);

    boolean getHasInternet();

    @Nullable
    Object getIdfi(@NotNull dy dyVar);

    @NotNull
    List<String> getLocaleList();

    @NotNull
    String getManufacturer();

    @NotNull
    String getModel();

    @NotNull
    String getOrientation();

    @NotNull
    String getOsVersion();

    @NotNull
    PiiOuterClass.Pii getPiiData();

    int getRingerMode();

    long getSystemBootTime();

    @Nullable
    Object getUnityBuildGuid(@NotNull dy dyVar);

    @NotNull
    bp0 getVolumeSettingsChange();

    @Nullable
    Object staticDeviceInfo(@NotNull dy dyVar);
}
