package com.moloco.sdk.publisher;

import androidx.compose.runtime.internal.StabilityInferred;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.tiktok.appevents.contents.TTContentsEventConstants;
import defpackage.e80;
import defpackage.ek2;
import defpackage.jc1;
import defpackage.jh0;
import defpackage.n30;
import defpackage.s71;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0019H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/moloco/sdk/publisher/MolocoAdError;", "", "networkName", "", "adUnitId", "errorType", "Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;", TTContentsEventConstants.Params.EVENT_PROPERTY_DESCRIPTION, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;Ljava/lang/String;)V", "getNetworkName", "()Ljava/lang/String;", "getAdUnitId", "getErrorType", "()Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;", "getDescription", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ErrorType", "AdCreateError", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MolocoAdError {
    public static final int $stable = 0;

    @NotNull
    private final String adUnitId;

    @NotNull
    private final String description;

    @NotNull
    private final ErrorType errorType;

    @NotNull
    private final String networkName;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;", "", TTContentsEventConstants.Params.EVENT_PROPERTY_DESCRIPTION, "", IronSourceConstants.EVENTS_ERROR_CODE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "()I", "SDK_INIT_FAILED", "SDK_INIT_WAS_NOT_COMPLETED", "UNABLE_TO_CREATE_AD", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum AdCreateError {
        SDK_INIT_FAILED("Failed to create `ad` object due to SDK initialization failure.", 1011),
        SDK_INIT_WAS_NOT_COMPLETED("Failed to create `ad` object due to `Moloco.initialize()` not complete.", 1012),
        UNABLE_TO_CREATE_AD("Failed to create `ad` object due to `Moloco.initialize()` not complete in time", 1013);

        private static final /* synthetic */ jh0 $ENTRIES = ek2.m(values());

        @NotNull
        private final String description;
        private final int errorCode;

        @NotNull
        public static jh0 getEntries() {
            return $ENTRIES;
        }

        @NotNull
        public final String getDescription() {
            return this.description;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        AdCreateError(String str, int i) {
            this.description = str;
            this.errorCode = i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;", "", TTContentsEventConstants.Params.EVENT_PROPERTY_DESCRIPTION, "", IronSourceConstants.EVENTS_ERROR_CODE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "()I", "UNKNOWN", "SDK_INIT_ERROR", "SDK_PERSISTENT_HTTP_REQUEST_FAILED_TO_INIT", "SDK_INVALID_CONFIGURATION", "AD_LOAD_FAILED", "AD_LOAD_FAILED_SDK_NOT_INIT", "AD_LOAD_TIMEOUT_ERROR", "AD_LOAD_LIMIT_REACHED", "AD_LOAD_BID_FAILED", "AD_LOAD_WEBVIEW_FAILED", "AD_SHOW_ERROR", "AD_SHOW_ERROR_NOT_LOADED", "AD_SHOW_ERROR_ALREADY_DISPLAYING", "AD_BID_PARSE_ERROR", "AD_SIGNAL_COLLECTION_FAILED", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum ErrorType {
        UNKNOWN("Generic failure error code", -1),
        SDK_INIT_ERROR("SDK initialization error", 1000),
        SDK_PERSISTENT_HTTP_REQUEST_FAILED_TO_INIT("WorkManager crash that prevents us from creating a persistent http request client", 1001),
        SDK_INVALID_CONFIGURATION("Ad object cannot be created, due to invalid configuration", 1002),
        AD_LOAD_FAILED("Ad is not loaded", 2000),
        AD_LOAD_FAILED_SDK_NOT_INIT("Ad load failed because SDK was not initialized", 2001),
        AD_LOAD_TIMEOUT_ERROR("Ad failed to load because the request timed out", 2003),
        AD_LOAD_LIMIT_REACHED("Ad load limit reached", 2004),
        AD_LOAD_BID_FAILED("Ad failed to load because bid request failed or no fill", 2005),
        AD_LOAD_WEBVIEW_FAILED("Ad failed to load because Webview was *not* available", 2006),
        AD_SHOW_ERROR("Ad show failed despite a successful ad load. Internal renderer error", IronSourceError.ERROR_CAPPING_VALIDATION_FAILED),
        AD_SHOW_ERROR_NOT_LOADED("Ad show failed because ad load was not called", 3001),
        AD_SHOW_ERROR_ALREADY_DISPLAYING("Ad show failed because show() was invoked multiple times when ad was already rendering", 3002),
        AD_BID_PARSE_ERROR("The bid response received was not parseable by the SDK", 4000),
        AD_SIGNAL_COLLECTION_FAILED("The bid token couldn’t be retrieved.", 5000);

        private static final /* synthetic */ jh0 $ENTRIES = ek2.m(values());

        @NotNull
        private final String description;
        private final int errorCode;

        @NotNull
        public static jh0 getEntries() {
            return $ENTRIES;
        }

        @NotNull
        public final String getDescription() {
            return this.description;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        ErrorType(String str, int i) {
            this.description = str;
            this.errorCode = i;
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MolocoAdError)) {
            return false;
        }
        MolocoAdError molocoAdError = (MolocoAdError) other;
        return s71.b(this.networkName, molocoAdError.networkName) && s71.b(this.adUnitId, molocoAdError.adUnitId) && this.errorType == molocoAdError.errorType && s71.b(this.description, molocoAdError.description);
    }

    public static /* synthetic */ MolocoAdError copy$default(MolocoAdError molocoAdError, String str, String str2, ErrorType errorType, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = molocoAdError.networkName;
        }
        if ((i & 2) != 0) {
            str2 = molocoAdError.adUnitId;
        }
        if ((i & 4) != 0) {
            errorType = molocoAdError.errorType;
        }
        if ((i & 8) != 0) {
            str3 = molocoAdError.description;
        }
        return molocoAdError.copy(str, str2, errorType, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNetworkName() {
        return this.networkName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ErrorType getErrorType() {
        return this.errorType;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final ErrorType getErrorType() {
        return this.errorType;
    }

    @NotNull
    public final String getNetworkName() {
        return this.networkName;
    }

    public int hashCode() {
        return this.description.hashCode() + ((this.errorType.hashCode() + n30.c(this.networkName.hashCode() * 31, 31, this.adUnitId)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("MolocoAdError(networkName=");
        sb.append(this.networkName);
        sb.append(", adUnitId=");
        sb.append(this.adUnitId);
        sb.append(", errorType=");
        sb.append(this.errorType);
        sb.append(", description=");
        return jc1.q(sb, this.description, ')');
    }

    public MolocoAdError(@NotNull String str, @NotNull String str2, @NotNull ErrorType errorType, @NotNull String str3) {
        str.getClass();
        str2.getClass();
        errorType.getClass();
        str3.getClass();
        this.networkName = str;
        this.adUnitId = str2;
        this.errorType = errorType;
        this.description = str3;
    }

    @NotNull
    public final MolocoAdError copy(@NotNull String networkName, @NotNull String adUnitId, @NotNull ErrorType errorType, @NotNull String description) {
        networkName.getClass();
        adUnitId.getClass();
        errorType.getClass();
        description.getClass();
        return new MolocoAdError(networkName, adUnitId, errorType, description);
    }

    public /* synthetic */ MolocoAdError(String str, String str2, ErrorType errorType, String str3, int i, e80 e80Var) {
        this(str, str2, errorType, (i & 8) != 0 ? errorType.getDescription() : str3);
    }
}
