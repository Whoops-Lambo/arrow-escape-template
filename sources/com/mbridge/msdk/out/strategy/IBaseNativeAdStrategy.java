package com.mbridge.msdk.out.strategy;

import android.view.View;
import com.mbridge.msdk.mbnative.listener.a;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public interface IBaseNativeAdStrategy {
    void clearVideoCache();

    String getCreativeIdWithUnitId();

    String getRequestId();

    boolean isReady(String str, int i);

    boolean load(String str);

    boolean loadFrame();

    void registerView(View view, Campaign campaign);

    void registerView(View view, List<View> list, Campaign campaign);

    void release();

    void setAdListener(a aVar);

    void setExtraInfo(JSONObject jSONObject);

    void setTrackingListener(NativeListener.NativeTrackingListener nativeTrackingListener);

    void unregisterView(View view, Campaign campaign);

    void unregisterView(View view, List<View> list, Campaign campaign);
}
