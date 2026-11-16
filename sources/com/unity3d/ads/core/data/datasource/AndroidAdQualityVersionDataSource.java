package com.unity3d.ads.core.data.datasource;

import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.unity3d.ads.core.log.Logger;
import defpackage.cm2;
import defpackage.dk2;
import defpackage.gd1;
import defpackage.s5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u001d\u0010\r\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidAdQualityVersionDataSource;", "Lcom/unity3d/ads/core/data/datasource/AdQualityVersionDataSource;", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lcom/unity3d/ads/core/log/Logger;)V", "", "invoke", "()Ljava/lang/String;", "Lcom/unity3d/ads/core/log/Logger;", "cachedVersion$delegate", "Lgd1;", "getCachedVersion", "cachedVersion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidAdQualityVersionDataSource implements AdQualityVersionDataSource {

    /* JADX INFO: renamed from: cachedVersion$delegate, reason: from kotlin metadata */
    @NotNull
    private final gd1 cachedVersion;

    @NotNull
    private final Logger logger;

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cachedVersion_delegate$lambda$4$lambda$1(NoClassDefFoundError noClassDefFoundError) {
        return "Ad Quality SDK not available: " + noClassDefFoundError.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cachedVersion_delegate$lambda$4$lambda$2(ClassNotFoundException classNotFoundException) {
        return "Ad Quality SDK not available: " + classNotFoundException.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cachedVersion_delegate$lambda$4$lambda$3(NoSuchMethodError noSuchMethodError) {
        return "Ad Quality SDK not available: " + noSuchMethodError.getMessage();
    }

    private final String getCachedVersion() {
        return (String) this.cachedVersion.getValue();
    }

    public AndroidAdQualityVersionDataSource(@NotNull Logger logger) {
        logger.getClass();
        this.logger = logger;
        this.cachedVersion = new cm2(new s5(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cachedVersion_delegate$lambda$4(AndroidAdQualityVersionDataSource androidAdQualityVersionDataSource) {
        try {
            String sDKVersion = IronSourceAdQuality.getSDKVersion();
            if (sDKVersion != null && !dk2.Z(sDKVersion)) {
                return sDKVersion;
            }
            return null;
        } catch (ClassNotFoundException e) {
            androidAdQualityVersionDataSource.logger.debug(new s5(e, 1));
            return null;
        } catch (NoClassDefFoundError e2) {
            androidAdQualityVersionDataSource.logger.debug(new s5(e2, 0));
            return null;
        } catch (NoSuchMethodError e3) {
            androidAdQualityVersionDataSource.logger.debug(new s5(e3, 2));
            return null;
        } catch (Throwable th) {
            androidAdQualityVersionDataSource.logger.error("Failed to get Ad Quality version", th);
            return null;
        }
    }

    @Override // com.unity3d.ads.core.data.datasource.AdQualityVersionDataSource
    @Nullable
    public String invoke() {
        return getCachedVersion();
    }
}
