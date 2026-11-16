package defpackage;

import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustThirdPartySharing;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class m4 extends n4 {
    public final a33 a;

    @Override // defpackage.n4
    public final boolean a(xk1 xk1Var) {
        a33 a33Var = this.a;
        xk1Var.getClass();
        boolean z = xk1Var.c;
        boolean z2 = xk1Var.d;
        try {
            Class.forName("com.adjust.sdk.AdjustThirdPartySharing");
            AdjustThirdPartySharing adjustThirdPartySharing = new AdjustThirdPartySharing((Boolean) null);
            adjustThirdPartySharing.addGranularOption("amazon_dma", "ad_user_data", z2 ? "1" : "0");
            adjustThirdPartySharing.addGranularOption("amazon_dma", "ad_storage", z ? "1" : "0");
            Adjust.trackThirdPartySharing(adjustThirdPartySharing);
            a33Var.b("[Amazon Consent Signal] Signaled Amazon DMA (amazon_dma) to Adjust: ad_user_data=" + z2 + ", ad_storage=" + z, null);
            return true;
        } catch (Throwable th) {
            a33Var.b("Failed to apply consent to Adjust", th);
            return false;
        }
    }

    @Override // defpackage.n4
    public final boolean b(xk1 xk1Var) {
        a33 a33Var = this.a;
        xk1Var.getClass();
        boolean z = xk1Var.d;
        boolean z2 = xk1Var.e;
        boolean z3 = xk1Var.a;
        try {
            Class.forName("com.adjust.sdk.AdjustThirdPartySharing");
            AdjustThirdPartySharing adjustThirdPartySharing = new AdjustThirdPartySharing((Boolean) null);
            adjustThirdPartySharing.addGranularOption("google_dma", "eea", z3 ? "1" : "0");
            adjustThirdPartySharing.addGranularOption("google_dma", "ad_personalization", z2 ? "1" : "0");
            adjustThirdPartySharing.addGranularOption("google_dma", "ad_user_data", z ? "1" : "0");
            Adjust.trackThirdPartySharing(adjustThirdPartySharing);
            a33Var.b("[Google Consent Signal] Signaled Google DMA to Adjust: eea=" + z3 + ", ad_personalization=" + z2 + ", ad_user_data=" + z, null);
            return true;
        } catch (Throwable th) {
            a33Var.b("Failed to apply consent to Adjust", th);
            return false;
        }
    }

    public final boolean c(boolean z) {
        try {
            Class.forName("com.adjust.sdk.Adjust");
            Adjust.trackMeasurementConsent(z);
            return true;
        } catch (Throwable th) {
            this.a.b("Failed to apply consent to Adjust", th);
            return false;
        }
    }

    public final boolean d(String str, boolean z) {
        try {
            Class.forName("com.adjust.sdk.AdjustThirdPartySharing");
            AdjustThirdPartySharing adjustThirdPartySharing = new AdjustThirdPartySharing((Boolean) null);
            adjustThirdPartySharing.addPartnerSharingSetting(str, "install", z);
            adjustThirdPartySharing.addPartnerSharingSetting(str, "events", z);
            adjustThirdPartySharing.addPartnerSharingSetting(str, "sessions", z);
            Adjust.trackThirdPartySharing(adjustThirdPartySharing);
            return true;
        } catch (Throwable th) {
            this.a.b("Failed to apply consent to Adjust", th);
            return false;
        }
    }

    public m4(a33 a33Var) {
        this.a = a33Var;
    }
}
