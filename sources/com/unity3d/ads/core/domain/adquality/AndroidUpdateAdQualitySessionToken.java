package com.unity3d.ads.core.domain.adquality;

import com.google.protobuf.ByteString;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.unity3d.ads.core.data.datasource.AdQualityVersionDataSource;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import defpackage.pv1;
import defpackage.w6;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/unity3d/ads/core/domain/adquality/AndroidUpdateAdQualitySessionToken;", "Lcom/unity3d/ads/core/domain/adquality/UpdateAdQualitySessionToken;", "Lcom/unity3d/ads/core/log/Logger;", "logger", "Lcom/unity3d/ads/core/data/datasource/AdQualityVersionDataSource;", "adQualityVersionDataSource", "<init>", "(Lcom/unity3d/ads/core/log/Logger;Lcom/unity3d/ads/core/data/datasource/AdQualityVersionDataSource;)V", "Lcom/google/protobuf/ByteString;", "sessionToken", "Laz2;", "invoke", "(Lcom/google/protobuf/ByteString;)V", "Lcom/unity3d/ads/core/log/Logger;", "Lcom/unity3d/ads/core/data/datasource/AdQualityVersionDataSource;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidUpdateAdQualitySessionToken implements UpdateAdQualitySessionToken {

    @NotNull
    private final AdQualityVersionDataSource adQualityVersionDataSource;

    @NotNull
    private final Logger logger;

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invoke$lambda$0(String str) {
        return pv1.n("Ad Quality SDK version ", str, " is below minimum 9.5.1, skipping session token update");
    }

    public AndroidUpdateAdQualitySessionToken(@NotNull Logger logger, @NotNull AdQualityVersionDataSource adQualityVersionDataSource) {
        logger.getClass();
        adQualityVersionDataSource.getClass();
        this.logger = logger;
        this.adQualityVersionDataSource = adQualityVersionDataSource;
    }

    @Override // com.unity3d.ads.core.domain.adquality.UpdateAdQualitySessionToken
    public void invoke(@NotNull ByteString sessionToken) {
        sessionToken.getClass();
        String strInvoke = this.adQualityVersionDataSource.invoke();
        if (strInvoke == null) {
            return;
        }
        int i = 0;
        if (StringExtensionsKt.compareVersion(strInvoke, "9.5.1") < 0) {
            this.logger.debug(new w6(strInvoke, i));
            return;
        }
        try {
            IronSourceAdQuality.getInstance().setMetaData("uads_session_token", ProtobufExtensionsKt.toBase64$default(sessionToken, false, 1, null));
        } catch (Throwable th) {
            this.logger.error("Ad Quality SDK setMetaData failed", th);
        }
    }
}
