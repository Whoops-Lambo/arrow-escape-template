package io.p071bidmachine.displays;

import android.content.Context;
import android.text.TextUtils;
import android.util.Size;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.adcom.ApiFramework;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.adcom.PlacementPosition;
import com.explorestack.protobuf.adcom.SizeUnit;
import io.p071bidmachine.AdContentType;
import io.p071bidmachine.AdPlacementConfig;
import io.p071bidmachine.AdsType;
import io.p071bidmachine.Constants;
import io.p071bidmachine.ContextProvider;
import io.p071bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import io.p071bidmachine.unified.d;
import io.p071bidmachine.util.p;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class b extends f {
    public final boolean c;

    public b(boolean z) {
        super(AdContentType.Static);
        this.c = z;
    }

    @Override // io.p071bidmachine.displays.f
    public final io.p071bidmachine.models.b a(Ad ad) {
        if (ad.hasDisplay()) {
            Ad.Display display = ad.getDisplay();
            io.p071bidmachine.models.b bVarB = b(ad);
            if (bVarB == null) {
                if (TextUtils.isEmpty(display.getAdm())) {
                    return null;
                }
                bVarB = new a(ad);
                String adm = display.getAdm();
                if (adm != null && adm.length() != 0) {
                    ((ConcurrentHashMap) bVarB.a()).put("creativeAdm", adm);
                } else {
                    ((ConcurrentHashMap) bVarB.a()).remove("creativeAdm");
                }
            }
            int w = display.getW();
            ((ConcurrentHashMap) bVarB.a()).put("width", Integer.valueOf(w));
            int h = display.getH();
            ((ConcurrentHashMap) bVarB.a()).put("height", Integer.valueOf(h));
            return bVarB;
        }
        return null;
    }

    @Override // io.p071bidmachine.displays.f
    public final Message.Builder d(ContextProvider contextProvider, d dVar, AdsType adsType, Collection collection, List list, AdPlacementConfig adPlacementConfig, int i) {
        Size sizeF = f(contextProvider, dVar);
        Placement.DisplayPlacement.Builder h = Placement.DisplayPlacement.newBuilder().addApi(ApiFramework.API_FRAMEWORK_MRAID_2_0).addApi(ApiFramework.API_FRAMEWORK_OMID_1_0).setUnit(SizeUnit.SIZE_UNIT_DIPS).addAllMime(Constants.IMAGE_MIME_TYPES).setW(sizeF.getWidth()).setH(sizeF.getHeight());
        if (this.c) {
            h.setInstl(true);
            h.setPos(PlacementPosition.PLACEMENT_POSITION_FULLSCREEN);
        }
        HeaderBiddingPlacement.Builder builderC = c(contextProvider, dVar, adsType, collection, list, i);
        if (adPlacementConfig == null && builderC != null) {
            h.addExtProto(Any.pack(builderC.build()));
            return h;
        }
        if (adPlacementConfig != null) {
            h.addExtProto(Any.pack(f.e(adPlacementConfig, builderC)));
        }
        return h;
    }

    public Size f(ContextProvider contextProvider, d dVar) {
        Context context = contextProvider.getContext();
        context.getClass();
        return p.x(context);
    }
}
