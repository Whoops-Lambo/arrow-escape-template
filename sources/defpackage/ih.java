package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.explorestack.protobuf.StringValue;
import com.moloco.sdk.internal.error.crash.delivery.d;
import com.moloco.sdk.internal.publisher.k0;
import io.p071bidmachine.AdvertisingDataManager$AdvertisingData;
import io.p071bidmachine.DeviceInfo;
import io.p071bidmachine.UserAgentManager;
import io.p071bidmachine.internal.z0;
import io.p071bidmachine.p1;
import io.p071bidmachine.protobuf.sdk.Device;
import io.p071bidmachine.protobuf.sdk.MaskedSignals;
import io.p071bidmachine.rendering.internal.event.e;
import io.p071bidmachine.t1;
import io.p071bidmachine.u;
import io.p071bidmachine.utils.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ih extends rc1 implements sr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ih(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(0);
        this.i = i;
        this.j = obj;
        this.k = obj2;
        this.l = obj3;
        this.m = obj4;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        String str;
        int i = this.i;
        az2 az2Var = az2.a;
        Object obj = this.m;
        Object obj2 = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        switch (i) {
            case 0:
                ((wr0) obj4).invoke(new jy1(((vd1) obj3).e, ((kh) obj2).g, (ky1) obj));
                break;
            case 1:
                p1 p1Var = (p1) obj2;
                DeviceInfo deviceInfo = (DeviceInfo) obj;
                Device.Builder builder = (Device.Builder) obj3;
                Context context = (Context) obj4;
                HashSet hashSetZ = t1.z(context);
                if (!hashSetZ.isEmpty()) {
                    builder.addAllInputlanguage(hashSetZ);
                }
                Double dW = t1.w(context);
                if (dW != null) {
                    builder.setBatterylevel((float) dW.doubleValue());
                }
                String strY = t1.y(context);
                if (strY != null) {
                    if (!dk2.Z(strY)) {
                        builder.setDevicename(strY);
                    }
                    new ArrayList();
                }
                Double dC = t1.C(context);
                if (dC != null) {
                    builder.setScreenbright((float) dC.doubleValue());
                }
                builder.setTime(System.currentTimeMillis());
                builder.setLastbootup(SystemClock.elapsedRealtime());
                builder.setLastbootupV2(p1Var.g(context));
                List listF = p1Var.f(context);
                if (!listF.isEmpty()) {
                    builder.addAllLastbootupHistory(listF);
                }
                HashSet hashSetA = c.a(context);
                if (hashSetA != null) {
                    if (hashSetA.isEmpty()) {
                        hashSetA = null;
                    }
                    if (hashSetA != null && (str = (String) du.b0(hashSetA)) != null) {
                        builder.setHeadsetname(str);
                    }
                }
                Long availableDiskSpaceInMB = deviceInfo.getAvailableDiskSpaceInMB();
                if (availableDiskSpaceInMB != null) {
                    builder.setDiskspace(availableDiskSpaceInMB.longValue());
                }
                Long totalDiskSpaceInMB = deviceInfo.getTotalDiskSpaceInMB();
                if (totalDiskSpaceInMB != null) {
                    builder.setTotaldisk(totalDiskSpaceInMB.longValue());
                }
                Long totalMemBytes = deviceInfo.getRam().getTotalMemBytes();
                if (totalMemBytes != null) {
                    builder.setTotalmem(totalMemBytes.longValue());
                }
                Long freeMemBytes = deviceInfo.getRam().getFreeMemBytes();
                if (freeMemBytes != null) {
                    builder.setFreemem(freeMemBytes.longValue());
                }
                String name = deviceInfo.getCpu().getName();
                if (name != null) {
                    if (name.length() <= 0) {
                        name = null;
                    }
                    if (name != null) {
                        builder.setCpuname(name);
                    }
                }
                String vendor = deviceInfo.getCpu().getVendor();
                if (vendor != null) {
                    if (vendor.length() <= 0) {
                        vendor = null;
                    }
                    if (vendor != null) {
                        builder.setCpuvendor(vendor);
                    }
                }
                String name2 = deviceInfo.getGpu().getName();
                if (name2 != null) {
                    if (name2.length() <= 0) {
                        name2 = null;
                    }
                    if (name2 != null) {
                        builder.setGpuname(name2);
                    }
                }
                String vendor2 = deviceInfo.getGpu().getVendor();
                if (vendor2 != null) {
                    if (vendor2.length() <= 0) {
                        vendor2 = null;
                    }
                    if (vendor2 != null) {
                        builder.setGpuvendor(vendor2);
                    }
                }
                String simCarrier = deviceInfo.getSimCarrier();
                if (simCarrier != null) {
                    String str2 = simCarrier.length() > 0 ? simCarrier : null;
                    if (str2 != null) {
                        builder.setSimCarrier(StringValue.of(str2));
                    }
                }
                Float volumeLevel = deviceInfo.getAudio().getVolumeLevel(context);
                if (volumeLevel != null) {
                    builder.setAudioContext(com.explorestack.protobuf.adcom.Context.Device.AudioContext.newBuilder().setVolumelevel(volumeLevel.floatValue()).build());
                }
                break;
            case 2:
                MaskedSignals.Builder builder2 = (MaskedSignals.Builder) obj4;
                z0 z0Var = (z0) obj3;
                DeviceInfo deviceInfo2 = (DeviceInfo) obj2;
                builder2.setPxratio(io.p071bidmachine.media3.common.audio.c.w(z0Var.a(k0.v(deviceInfo2.getScreenDensity()))));
                builder2.setPpi(io.p071bidmachine.media3.common.audio.c.w(z0Var.a(k0.w(deviceInfo2.getScreenDpi()))));
                builder2.setModel(io.p071bidmachine.media3.common.audio.c.w(z0Var.a(k0.y(deviceInfo2.getModel()))));
                String hwv = deviceInfo2.getHWV();
                if (hwv != null) {
                    builder2.setHwv(io.p071bidmachine.media3.common.audio.c.w(z0Var.a(k0.y(hwv))));
                }
                String userAgent = UserAgentManager.getUserAgent((Context) obj);
                if (userAgent != null) {
                    if (!dk2.Z(userAgent)) {
                        builder2.setUa(io.p071bidmachine.media3.common.audio.c.w(z0Var.a(k0.y(userAgent))));
                    }
                    new ArrayList();
                }
                break;
            case 3:
                ((com.explorestack.protobuf.adcom.Context.Device.Builder) obj4).setIfa("00000000-0000-0000-0000-000000000000");
                MaskedSignals.Builder builder3 = (MaskedSignals.Builder) obj3;
                z0 z0Var2 = (z0) obj2;
                String strA = u.a((Context) obj);
                strA.getClass();
                builder3.setIfa(io.p071bidmachine.media3.common.audio.c.w(z0Var2.a(k0.y(strA))));
                AdvertisingDataManager$AdvertisingData advertisingDataManager$AdvertisingData = u.d;
                builder3.setLmt(io.p071bidmachine.media3.common.audio.c.w(z0Var2.a(k0.w((advertisingDataManager$AdvertisingData == null || !advertisingDataManager$AdvertisingData.isLimitAdTrackingEnabled()) ? 0 : 1))));
                break;
            default:
                ((jh) obj4).invoke((View) obj3);
                ((e) obj2).invoke();
                ((d) obj).invoke();
                break;
        }
        return az2Var;
    }
}
