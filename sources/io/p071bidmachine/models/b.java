package io.p071bidmachine.models;

import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.adcom.CreativeAttribute;
import com.facebook.j0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.freeze.d;
import io.p071bidmachine.TrackEventType;
import io.p071bidmachine.media3.common.audio.c;
import io.p071bidmachine.protobuf.AdExtension;
import io.p071bidmachine.protobuf.CreativeLoadingMethod;
import io.p071bidmachine.protobuf.rendering.Rendering;
import io.p071bidmachine.protobuf.sdk.ViewabilityConfiguration;
import io.p071bidmachine.unified.a;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class b {
    public final j0 a;
    public final EnumMap b;
    public final a c;

    public abstract boolean b();

    public final Map a() {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c.a;
        concurrentHashMap.getClass();
        return concurrentHashMap;
    }

    public b(Ad ad) {
        AdExtension adExtension;
        io.p071bidmachine.rendering.model.engagedclick.b bVarA;
        ad.getClass();
        this.b = new EnumMap(TrackEventType.class);
        this.c = new a(2);
        int extProtoCount = ad.getExtProtoCount();
        int i = 0;
        while (true) {
            if (i < extProtoCount) {
                try {
                    Any extProto = ad.getExtProto(i);
                    extProto.getClass();
                    if (extProto.is(AdExtension.class)) {
                        adExtension = (AdExtension) extProto.unpack(AdExtension.class);
                        break;
                    }
                    continue;
                } catch (Throwable th) {
                    io.p071bidmachine.core.a.i(th);
                }
                i++;
            } else {
                adExtension = null;
                break;
            }
        }
        if (adExtension != null) {
            d.v(this.b, adExtension.getEventList());
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) a();
            concurrentHashMap.put("useNativeClose", Boolean.valueOf(adExtension.getUseNativeClose()));
            CreativeLoadingMethod creativeLoadingMethod = adExtension.getCreativeLoadingMethod();
            creativeLoadingMethod.getClass();
            concurrentHashMap.put("cacheControl", creativeLoadingMethod);
            concurrentHashMap.put("placeholderTimeoutSec", Float.valueOf(adExtension.getPlaceholderTimeout()));
            concurrentHashMap.put("skipOffset", Integer.valueOf(adExtension.getSkipoffset()));
            concurrentHashMap.put("companionSkipOffset", Integer.valueOf(adExtension.getCompanionSkipoffset()));
            concurrentHashMap.put("r1", Boolean.valueOf(adExtension.getR1()));
            concurrentHashMap.put("r2", Boolean.valueOf(adExtension.getR2()));
            String storeUrl = adExtension.getStoreUrl();
            storeUrl.getClass();
            concurrentHashMap.put("store_url", storeUrl);
            concurrentHashMap.put("progress_duration", Integer.valueOf(adExtension.getProgressDuration()));
            AdExtension.ControlAsset closeButton = adExtension.getCloseButton();
            if (closeButton != null && closeButton != AdExtension.ControlAsset.getDefaultInstance()) {
                concurrentHashMap.put("close_button_control_asset", closeButton);
            }
            AdExtension.ControlAsset countdown = adExtension.getCountdown();
            if (countdown != null && countdown != AdExtension.ControlAsset.getDefaultInstance()) {
                concurrentHashMap.put("countdown_control_asset", countdown);
            }
            AdExtension.ControlAsset progress = adExtension.getProgress();
            if (progress != null && progress != AdExtension.ControlAsset.getDefaultInstance()) {
                concurrentHashMap.put("progress_control_asset", progress);
            }
            Rendering renderingConfiguration = adExtension.getRenderingConfiguration();
            if (renderingConfiguration != null && renderingConfiguration != Rendering.getDefaultInstance()) {
                concurrentHashMap.put("rendering_configuration", renderingConfiguration);
            }
            ViewabilityConfiguration viewabilityConfiguration = adExtension.getViewabilityConfiguration();
            viewabilityConfiguration.getClass();
            this.a = c.B(viewabilityConfiguration);
        } else {
            this.a = null;
        }
        Map<String, Value> fieldsMap = ad.getExt().getFieldsMap();
        fieldsMap.getClass();
        Map mapA = a();
        Value value = fieldsMap.get("omsdk_enabled");
        if (value != null) {
            ((ConcurrentHashMap) mapA).put("omsdk_enabled", Boolean.valueOf(value.getBoolValue()));
        }
        Value value2 = fieldsMap.get("engaged_click_interaction_window_ms");
        if (value2 != null) {
            ((ConcurrentHashMap) mapA).put("engaged_click_interaction_window_ms", Double.valueOf(value2.getNumberValue()));
        }
        Map mapA2 = a();
        String id = ad.getId();
        id.getClass();
        ((ConcurrentHashMap) mapA2).put("creativeId", id);
        Map mapA3 = a();
        if (ad.getAttrList().contains(CreativeAttribute.CREATIVE_ATTRIBUTE_USER_INTERACTIVE)) {
            bVarA = new io.p071bidmachine.rendering.model.engagedclick.b(io.p071bidmachine.rendering.model.engagedclick.a.PLAYABLE, 1);
        } else if (ad.hasDisplay() && !ad.getDisplay().hasNative()) {
            ArrayList arrayList = io.p071bidmachine.rendering.utils.a.a;
            String adm = ad.getDisplay().getAdm();
            adm.getClass();
            bVarA = io.p071bidmachine.rendering.utils.a.a(adm);
        } else {
            bVarA = io.p071bidmachine.rendering.model.engagedclick.b.c;
        }
        ((ConcurrentHashMap) mapA3).put("creativeProfileInfo", bVarA);
    }
}
