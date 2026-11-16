package io.p071bidmachine;

import com.explorestack.protobuf.adcom.DeviceType;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import io.p071bidmachine.util.d;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/bidmachine/util/d;", "Lcom/explorestack/protobuf/adcom/DeviceType;", "toProtobufDeviceType", "(Lio/bidmachine/util/d;)Lcom/explorestack/protobuf/adcom/DeviceType;", "bidmachine-android-sdk_ba_3_8_0"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class DeviceInfoKt {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final DeviceType toProtobufDeviceType(@NotNull d dVar) {
        dVar.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[dVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return DeviceType.DEVICE_TYPE_CTV;
                }
                e.b();
                return null;
            }
            return DeviceType.DEVICE_TYPE_PHONE_DEVICE;
        }
        return DeviceType.DEVICE_TYPE_TABLET;
    }
}
