package androidx.privacysandbox.ads.adservices.adselection;

import android.annotation.SuppressLint;
import android.net.Uri;
import androidx.annotation.RestrictTo;
import androidx.privacysandbox.ads.adservices.common.AdSelectionSignals;
import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import defpackage.gg0;
import defpackage.hg0;
import defpackage.s71;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;", "", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ClassVerificationFailure"})
public final class AdSelectionConfig {
    public static final AdSelectionConfig d;
    public final AdTechIdentifier a;
    public final AdSelectionSignals b;
    public final AdSelectionSignals c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig$Companion;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RestrictTo
    public static final class Companion {
    }

    static {
        AdTechIdentifier adTechIdentifier = new AdTechIdentifier();
        Uri.EMPTY.getClass();
        d = new AdSelectionConfig(adTechIdentifier, new AdSelectionSignals(), new AdSelectionSignals());
    }

    public AdSelectionConfig(AdTechIdentifier adTechIdentifier, AdSelectionSignals adSelectionSignals, AdSelectionSignals adSelectionSignals2) {
        Uri uri = Uri.EMPTY;
        uri.getClass();
        uri.getClass();
        this.a = adTechIdentifier;
        this.b = adSelectionSignals;
        this.c = adSelectionSignals2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdSelectionConfig)) {
            return false;
        }
        AdSelectionConfig adSelectionConfig = (AdSelectionConfig) obj;
        if (!this.a.equals(adSelectionConfig.a)) {
            return false;
        }
        Uri uri = Uri.EMPTY;
        if (!s71.b(uri, uri)) {
            return false;
        }
        gg0 gg0Var = gg0.a;
        if (!gg0Var.equals(gg0Var) || !this.b.equals(adSelectionConfig.b) || !this.c.equals(adSelectionConfig.c)) {
            return false;
        }
        hg0 hg0Var = hg0.a;
        return hg0Var.equals(hg0Var) && s71.b(uri, uri);
    }

    public final int hashCode() {
        Uri uri = Uri.EMPTY;
        return uri.hashCode() + (((uri.hashCode() * 31) + 1) * 923521);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdSelectionConfig: seller=");
        sb.append(this.a);
        sb.append(", decisionLogicUri='");
        Uri uri = Uri.EMPTY;
        sb.append(uri);
        sb.append("', customAudienceBuyers=");
        sb.append(gg0.a);
        sb.append(", adSelectionSignals=");
        sb.append(this.b);
        sb.append(", sellerSignals=");
        sb.append(this.c);
        sb.append(", perBuyerSignals=");
        sb.append(hg0.a);
        sb.append(", trustedScoringSignalsUri=");
        sb.append(uri);
        return sb.toString();
    }
}
