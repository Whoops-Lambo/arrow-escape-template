package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdRefreshState;
import com.unity3d.ads.core.data.model.AdRefreshStateKt;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import defpackage.dt1;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.fh1;
import defpackage.ix;
import defpackage.l92;
import defpackage.p92;
import defpackage.qh1;
import defpackage.s71;
import defpackage.wz2;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class CommonAdViewerExposedFunctionsKt$getAdContext$1 implements ExposedFunction {
    final /* synthetic */ String $adData;
    final /* synthetic */ String $adDataRefreshToken;
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ AndroidGetAdPlayerContext $getAndroidAdPlayerContext;
    final /* synthetic */ String $impressionConfig;
    final /* synthetic */ IsOMActivated $isOMActivated;

    public CommonAdViewerExposedFunctionsKt$getAdContext$1(String str, String str2, String str3, AndroidGetAdPlayerContext androidGetAdPlayerContext, AdObject adObject, IsOMActivated isOMActivated) {
        this.$adData = str;
        this.$impressionConfig = str2;
        this.$adDataRefreshToken = str3;
        this.$getAndroidAdPlayerContext = androidGetAdPlayerContext;
        this.$adObject = adObject;
        this.$isOMActivated = isOMActivated;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.zr0
    public final Object invoke(Object[] objArr, dy dyVar) throws JSONException {
        CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1 commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1;
        String str;
        AdObject adObject;
        Map map;
        Map map2;
        IsOMActivated isOMActivated;
        Map map3;
        AdRefreshState adRefreshState;
        if (dyVar instanceof CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1) {
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1) dyVar;
            int i = commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1(this, dyVar);
            }
        } else {
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1(this, dyVar);
        }
        Object objInvoke = commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.result;
        int i2 = commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.label;
        if (i2 == 0) {
            wz2.a0(objInvoke);
            String str2 = this.$adData;
            String str3 = this.$impressionConfig;
            String str4 = this.$adDataRefreshToken;
            AndroidGetAdPlayerContext androidGetAdPlayerContext = this.$getAndroidAdPlayerContext;
            AdObject adObject2 = this.$adObject;
            IsOMActivated isOMActivated2 = this.$isOMActivated;
            fh1 fh1Var = new fh1();
            fh1Var.put("adData", str2);
            fh1Var.put(HandleInvocationsFromAdViewer.KEY_IMPRESSION_CONFIG, str3);
            fh1Var.put(HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, str4);
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$0 = adObject2;
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$1 = isOMActivated2;
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$2 = fh1Var;
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$3 = fh1Var;
            str = HandleInvocationsFromAdViewer.KEY_NATIVE_CONTEXT;
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$4 = HandleInvocationsFromAdViewer.KEY_NATIVE_CONTEXT;
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$5 = fh1Var;
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.label = 1;
            objInvoke = androidGetAdPlayerContext.invoke(commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1);
            dz dzVar = dz.a;
            if (objInvoke == dzVar) {
                return dzVar;
            }
            adObject = adObject2;
            map = fh1Var;
            map2 = map;
            isOMActivated = isOMActivated2;
            map3 = map2;
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            map3 = (Map) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$5;
            str = (String) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$4;
            map = (Map) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$3;
            map2 = (Map) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$2;
            isOMActivated = (IsOMActivated) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$1;
            adObject = (AdObject) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$0;
            wz2.a0(objInvoke);
        }
        map3.put(str, objInvoke);
        map.put(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, ProtobufExtensionsKt.toBase64$default(adObject.getTrackingToken(), false, 1, null));
        JSONObject data = adObject.getLoadOptions().getData();
        if (data != null && data.length() != 0) {
            Iterator<String> itKeys = data.keys();
            itKeys.getClass();
            l92 l92VarF = p92.F(itKeys);
            JSONObject jSONObject = new JSONObject();
            for (String str5 : (ix) l92VarF) {
                if (!s71.b(str5, "adMarkup") && !s71.b(str5, "objectId")) {
                    jSONObject = jSONObject.put(str5, data.get(str5));
                    jSONObject.getClass();
                }
            }
            map.put(HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, jSONObject);
        }
        if (isOMActivated.invoke()) {
            map.put(HandleInvocationsFromAdViewer.KEY_OMID, qh1.Y(new dt1(HandleInvocationsFromAdViewer.KEY_OMJS_SESSION, UnityAdsConstants.OpenMeasurement.OM_JS_URL_SESSION), new dt1(HandleInvocationsFromAdViewer.KEY_OMJS_SERVICE, UnityAdsConstants.OpenMeasurement.OM_JS_URL_SERVICE)));
        }
        map.put(HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, Boolean.valueOf(adObject.isHeaderBidding()));
        String string = ProtobufExtensionsKt.toUUID(adObject.getOpportunityId()).toString();
        string.getClass();
        map.put("impressionOpportunityId", string);
        AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData = adObject.getWebViewLessLoadingRequiredData();
        if (webViewLessLoadingRequiredData != null && (adRefreshState = webViewLessLoadingRequiredData.getAdRefreshState()) != null) {
            map.put(HandleInvocationsFromAdViewer.KEY_AD_REFRESH_INVALIDATION_REASON, AdRefreshStateKt.getInvalidationReason(adRefreshState));
        }
        map2.getClass();
        return ((fh1) map2).d();
    }
}
