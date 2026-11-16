package com.applovin.impl.mediation;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class MaxNetworkResponseInfoImpl implements MaxNetworkResponseInfo {
    private final MaxNetworkResponseInfo.AdLoadState a;
    private final MaxMediatedNetworkInfo b;
    private final Bundle c;
    private final boolean d;
    private final long e;
    private final String f;
    private final MaxError g;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MaxNetworkResponseInfoImpl)) {
            return false;
        }
        MaxNetworkResponseInfoImpl maxNetworkResponseInfoImpl = (MaxNetworkResponseInfoImpl) obj;
        if (!maxNetworkResponseInfoImpl.canEqual(this) || isBidding() != maxNetworkResponseInfoImpl.isBidding() || getLatencyMillis() != maxNetworkResponseInfoImpl.getLatencyMillis()) {
            return false;
        }
        MaxNetworkResponseInfo.AdLoadState adLoadState = getAdLoadState();
        MaxNetworkResponseInfo.AdLoadState adLoadState2 = maxNetworkResponseInfoImpl.getAdLoadState();
        if (adLoadState != null ? !adLoadState.equals(adLoadState2) : adLoadState2 != null) {
            return false;
        }
        MaxMediatedNetworkInfo mediatedNetwork = getMediatedNetwork();
        MaxMediatedNetworkInfo mediatedNetwork2 = maxNetworkResponseInfoImpl.getMediatedNetwork();
        if (mediatedNetwork != null ? !mediatedNetwork.equals(mediatedNetwork2) : mediatedNetwork2 != null) {
            return false;
        }
        Bundle credentials = getCredentials();
        Bundle credentials2 = maxNetworkResponseInfoImpl.getCredentials();
        if (credentials != null ? !credentials.equals(credentials2) : credentials2 != null) {
            return false;
        }
        String bCode = getBCode();
        String bCode2 = maxNetworkResponseInfoImpl.getBCode();
        if (bCode != null ? !bCode.equals(bCode2) : bCode2 != null) {
            return false;
        }
        MaxError error = getError();
        MaxError error2 = maxNetworkResponseInfoImpl.getError();
        return error != null ? error.equals(error2) : error2 == null;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MaxNetworkResponseInfo.AdLoadState.values().length];
            a = iArr;
            try {
                iArr[MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[MaxNetworkResponseInfo.AdLoadState.AD_LOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof MaxNetworkResponseInfoImpl;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public MaxNetworkResponseInfo.AdLoadState getAdLoadState() {
        return this.a;
    }

    public String getBCode() {
        return this.f;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public Bundle getCredentials() {
        return this.c;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    @Nullable
    public MaxError getError() {
        return this.g;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public long getLatencyMillis() {
        return this.e;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public MaxMediatedNetworkInfo getMediatedNetwork() {
        return this.b;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public boolean isBidding() {
        return this.d;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("MaxResponseInfo{adLoadState=" + this.a + ", mediatedNetwork=" + this.b + ", credentials=" + this.c + ", isBidding=" + this.d);
        int i = a.a[this.a.ordinal()];
        if (i != 1) {
            if (i == 2) {
            }
            sb.append("}");
            return sb.toString();
        }
        sb.append(", error=");
        sb.append(this.g);
        sb.append(", latencyMillis=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }

    public MaxNetworkResponseInfoImpl(MaxNetworkResponseInfo.AdLoadState adLoadState, MaxMediatedNetworkInfo maxMediatedNetworkInfo, Bundle bundle, boolean z, long j, String str, @Nullable MaxError maxError) {
        this.a = adLoadState;
        this.b = maxMediatedNetworkInfo;
        this.c = bundle;
        this.d = z;
        this.e = j;
        this.f = str;
        this.g = maxError;
    }

    public int hashCode() {
        int i;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        if (isBidding()) {
            i = 79;
        } else {
            i = 97;
        }
        long latencyMillis = getLatencyMillis();
        int i2 = ((i + 59) * 59) + ((int) (latencyMillis ^ (latencyMillis >>> 32)));
        MaxNetworkResponseInfo.AdLoadState adLoadState = getAdLoadState();
        int i3 = i2 * 59;
        int iHashCode5 = 43;
        if (adLoadState == null) {
            iHashCode = 43;
        } else {
            iHashCode = adLoadState.hashCode();
        }
        int i4 = i3 + iHashCode;
        MaxMediatedNetworkInfo mediatedNetwork = getMediatedNetwork();
        int i5 = i4 * 59;
        if (mediatedNetwork == null) {
            iHashCode2 = 43;
        } else {
            iHashCode2 = mediatedNetwork.hashCode();
        }
        int i6 = i5 + iHashCode2;
        Bundle credentials = getCredentials();
        int i7 = i6 * 59;
        if (credentials == null) {
            iHashCode3 = 43;
        } else {
            iHashCode3 = credentials.hashCode();
        }
        int i8 = i7 + iHashCode3;
        String bCode = getBCode();
        int i9 = i8 * 59;
        if (bCode == null) {
            iHashCode4 = 43;
        } else {
            iHashCode4 = bCode.hashCode();
        }
        MaxError error = getError();
        int i10 = (i9 + iHashCode4) * 59;
        if (error != null) {
            iHashCode5 = error.hashCode();
        }
        return i10 + iHashCode5;
    }
}
